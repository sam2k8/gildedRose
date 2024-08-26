class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Sulfuras")) {
                item.sellIn--;

                if (item.name.equals("Aged Brie")) {
                    updateAgedBrie(item);
                } else if (item.name.equals("Backstage passes")) {
                    updateBackstagePasses(item);
                } else if (item.name.startsWith("Conjured")) {
                    updateConjuredItem(item);
                } else {
                    updateNormalItem(item);
                }
            }
        }
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++; // Increase quality again if sellIn < 0
        }
    }

    private void updateBackstagePasses(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0; // Concert is over, quality drops to 0
        } else {
            if (item.quality < 50) {
                item.quality++;

                if (item.sellIn < 10 && item.quality < 50) {
                    item.quality++; // Increase by an additional 1 if 10 days or less
                }
                if (item.sellIn < 5 && item.quality < 50) {
                    item.quality++; // Increase by an additional 1 if 5 days or less
                }
            }
        }
    }

    private void updateConjuredItem(Item item) {
        if (item.quality > 0) {
            item.quality -= 2; // Degrades twice as fast
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2; // Degrades twice as fast after sell date
        }

        if (item.quality < 0) {
            item.quality = 0; // Quality cannot go below 0
        }
    }

    private void updateNormalItem(Item item) {
        if (item.quality > 0) {
            item.quality--; // Decrease quality by 1
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--; // Decrease quality again if sellIn < 0
        }
    }
}
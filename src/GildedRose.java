class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            createItemUpdater(item).updateQuality();
        }
    }

    private AbstractItemUpdater createItemUpdater(Item item) {
        if(item.name.equals(ProductType.AGED_BIRD.getProductType())){
            return new AgedBrieUpdater(item);
        } else if (item.name.equals(ProductType.BACKSTAGE_PASSES.getProductType())){
            return new BackstagePassesUpdater(item);
        } else if (item.name.equals(ProductType.SULFURES.getProductType())) {
            return new SulfurasUpdater(item);
        } else if (item.name.equals(ProductType.CONJURED.getProductType())){
            return new ConjuredItemUpdater(item);
        }else {
            return new NormalItemUpdater(item);
        }
    }
}
public class BackstagePassesUpdater extends AbstractItemUpdater{
    public BackstagePassesUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.sellIn < 0) {
            item.quality = 0; // Quality drops to 0 after the concert
        } else {
            increaseQuality();
            if (item.sellIn < 10) {
                increaseQuality(); // Increase by 2 when 10 days or less
            }
            if (item.sellIn < 5) {
                increaseQuality(); // Increase by 3 when 5 days or less
            }
        }
        decreaseSellIn();
    }
}

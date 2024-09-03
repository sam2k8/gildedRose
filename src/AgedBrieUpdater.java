public class AgedBrieUpdater extends AbstractItemUpdater{
    public AgedBrieUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        decreaseSellIn();
        if (item.sellIn < 0) {
            increaseQuality(); // Increases in quality even after sellIn is 0
        }
    }
}

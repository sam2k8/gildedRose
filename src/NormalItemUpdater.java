public class NormalItemUpdater extends AbstractItemUpdater{

    public NormalItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseSellIn();
        if (item.sellIn < 0) {
            decreaseQuality(); // Degrade twice as fast after sellIn is 0
        }
    }
}

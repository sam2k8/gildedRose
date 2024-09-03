public class ConjuredItemUpdater extends AbstractItemUpdater{
    public ConjuredItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseQuality(); // Degrades twice as fast
        decreaseSellIn();
        if (item.sellIn < 0) {
            decreaseQuality();
            decreaseQuality(); // Degrade twice as fast after sellIn is 0
        }
    }
}

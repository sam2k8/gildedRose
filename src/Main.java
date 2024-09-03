public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[]{
                new Item(ProductType.AGED_BIRD.getProductType(), 2, 0),
                new Item(ProductType.BACKSTAGE_PASSES.getProductType(), 15, 20),
                new Item(ProductType.SULFURES.getProductType(), 0, 80),
                new Item(ProductType.CONJURED.getProductType(), 3, 6)
        };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 5; i++) { // Simulate 5 days
            System.out.println("Day " + i);
            for (Item item : items) {
                System.out.println(item);
            }
            app.updateQuality();
            System.out.println();
        }
    }
}
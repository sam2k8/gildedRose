public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[]{
                new Item("Aged Brie", 2, 0),
                new Item("Backstage passes", 15, 20),
                new Item("Sulfuras", 0, 80),
                new Item("Conjured", 3, 6)
        };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 10; i++) { // Simulate 5 days
            System.out.println("Day " + i);
            for (Item item : items) {
                System.out.println(item);
            }
            app.updateQuality();
            System.out.println();
        }
    }
}
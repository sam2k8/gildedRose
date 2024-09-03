public enum ProductType {
    AGED_BIRD ("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes"),
    SULFURES("Sulfuras"),
    CONJURED("Conjured");

    private final String type;

    // Constructor
    ProductType(String type) {
        this.type = type;
    }

    // Getter method to access the strings value
    public String getProductType() {
        return this.type;
    }
}

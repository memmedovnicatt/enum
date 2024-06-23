public enum Meat {
    RED_MEAT(200),
    POULTRY(100),
    SEAFOOD(50);

    private int weight;

    Meat(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}


package builderTest.model;

public class Kebab {
    private String dough;
    private String meat;
    private String sauce;

    public Kebab(String dough, String meat, String sauce) {
        this.dough = dough;
        this.meat = meat;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "dough='" + dough + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}

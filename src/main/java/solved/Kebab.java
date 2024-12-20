package solved;

public class Kebab {
    private String dough;
    private String meat;
    private String sauce;

    private Kebab(Builder builder) {
        this.dough = builder.dough;
        this.meat = builder.meat;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "dough='" + dough + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
    public static class Builder {
        private String dough;
        private String meat;
        private String sauce;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Kebab build() {
            return new Kebab(this);
        }
    }
}

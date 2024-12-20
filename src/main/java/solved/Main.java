package solved;

public class Main {
    public static void main(String[] args) {
        Kebab kebab = new Kebab.Builder()
                .setDough("w ciescie")
                .setMeat("mieszany")
                .setSauce("mieszany")
                        .build();
        System.out.println(kebab);
    }
}

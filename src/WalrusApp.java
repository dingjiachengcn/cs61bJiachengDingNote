public class WalrusApp {

    public static class Walrus {
        public int weight;
        public double tuskSize;

        public Walrus(int w, double ts) {
            weight = w;
            tuskSize = ts;
        }
    }

    public static void main(String[] args) {
        Walrus wally = new Walrus(1500, 10.5);
        System.out.println("Walrus weight: " + wally.weight);
        System.out.println("Walrus tusk size: " + wally.tuskSize);
    }
}

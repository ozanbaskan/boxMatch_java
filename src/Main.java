public class Main {
    public static void main(String[] args) {
        Boxer b1 = new Boxer("Ozan", 40, 300, 80, 100);
        Boxer b2 = new Boxer("Şamil", 30, 220, 65, 75);

        Match m = new Match(b1,b2,60,90);
        m.run();
    }
}

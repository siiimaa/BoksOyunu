public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Max", 15,95,100, 80);
        Fighter f2 = new Fighter("Eddie", 10, 120, 95, 55);

        Match match = new Match(f1,f2,95,100);
        match.run();
    }
}
public class Ex4 {
    public static void main(String[] args) {
        atmTerminal();
    }

    public static void atmTerminal() {

        int n;
        n = 486;

        int $100 = (n / 100);
        int $50 = ((n - 100 * $100) / 50) % 50;
        int $20 = ((n - 100 * $100 - 50 * $50) / 20) % 20;
        int $10 = ((n - 100 * $100 - 50 * $50 - 20 * $20) / 10) % 10;
        int $5 = ((n - 100 * $100 - 50 * $50 - 20 * $20 - 10 * $10) / 5) % 5;
        int $1 = (n - 100 * $100 - 50 * $50 - 20 * $20 - 10 * $10 - 5 * $5);

        System.out.println("Notes of $100: " + $100);
        System.out.println("Notes of $50: " + $50);
        System.out.println("Notes of $20: " + $20);
        System.out.println("Notes of $10: " + $10);
        System.out.println("Notes of $5: " + $5);
        System.out.println("Notes of $1: " + $1);
    }
}
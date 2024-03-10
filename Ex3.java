public class Ex3 {
    public static void main(String[] args) {
        idCalculator();
    }
    public static void idCalculator() {

        // Keeps ID in the string variable called auaId
        String auaId = "ZA0014224";
        int numericValue = 14224;

        // Checking the divisibility condition.
        boolean isDivisibleBy5 = numericValue % 5 == 0;

        // Printing out the results.
        System.out.println("AUA ID: " + auaId);
        System.out.println("Numeric Part: " + numericValue);
        System.out.println("Is Divisible By 5? " + isDivisibleBy5);
    }
}
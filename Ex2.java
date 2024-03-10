public class Ex2 {

    public static void main (String[] args) {
        calculator();
    }

    public static void calculator() {

        // if we want to do the math on the paper we will rewrite
        // the expression as 10 - 3*(100/600),
        // then get the 10 - 0.5 and get 9.5 as the answer,
        // while the code does the division and gets 0.16666666666666666 every time,
        // after subtracting the same value from the 10 3 times it will not get to 9,5
        // it will get to 9.500000000000002
        // That is the difference between handwriting and code calculation
        double aa = 100.0/600;
        System.out.println("100.0/600 = " + aa);

        double a = 10 - 100.0 / 600 - 100.0 / 600 - 100.0 / 600;
        System.out.println("The given Expression's result is: " + a);

        // Let's modify the expression a little bit
        double aaa = 10 - 3*(100.0/600);
        System.out.println("Modified Expression's Result (Expected Value) is: " + aaa);
        // As we can see the result is 9.5, so the reason while handwritten and
        // code compiled answer is different is the way of solving the expression.
    }
}

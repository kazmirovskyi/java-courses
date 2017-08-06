public class CalculateMaster {

    public static void main(String[] args) {

        System.out.println("Sum");
        String [] params1 = {"1", "+", "2"};
        Calculate.main(params1);

        System.out.println("Difference");
        String [] params2 = {"1", "-", "2"};
        Calculate.main(params2);

        System.out.println("Division");
        String [] params3 = {"6", "/", "2"};
        Calculate.main(params3);

        System.out.println("Multiplication");
        String [] params4 = {"6", "*", "2"};
        Calculate.main(params4);

        System.out.println("Exponentiation");
        String [] params5 = {"6", "^", "2"};
        Calculate.main(params5);

        System.out.println("Error");
        String [] params6 = {"6", "==", "2"};
        Calculate.main(params6);

    }

}

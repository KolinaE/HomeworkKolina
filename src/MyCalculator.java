import hometasks.Calculator;

public class MyCalculator {

    public static void main(String[] args) {

        int addResult = Calculator.add(9, 7);
        System.out.println(addResult);

        int subResult = Calculator.sub(5, 2);
        System.out.println(subResult);

        int divResult = Calculator.div(81, 9);
        System.out.println(divResult);

        int mulResult = Calculator.mul(17, 34);
        System.out.println(mulResult);
    }
}

public class Calculator {


    public void summa(int firstValue, int secondValue) {
        System.out.println(firstValue + secondValue);
    }

    public void minus(int firstValue, int secondValue) {
        System.out.println(firstValue - secondValue);

    }
    public void multy(int firstValue, int secondValue) {
        System.out.println(firstValue * secondValue);
    }

    public void division(int firstValue, int secondValue) {
        System.out.println(firstValue / secondValue);
    }

    public void fact(int value) {
        int someValue = 1;
        for (int i = 1; i <= value; i++) {
            someValue *= i;
        }
        System.out.println(someValue);
    }


}

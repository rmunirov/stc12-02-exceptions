package ru.innopolis.stc12.exeptions;

public class Main {
    public static void main(String[] args) {
        MathBox mathBox = new MathBox();

        int n1 = 8;
        int n2 = 0;

        int summ = mathBox.summa(n1, n2);
        System.out.println(n1 + " + " + n2 + " = " + summ);

        int diff = mathBox.diff(n1, n2);
        System.out.println(n1 + " - " + n2 + " = " + diff);

        double divEx = mathBox.dividerExceptionInside(n1, n2);
        System.out.println(n1 + " / " + n2 + " = " + divEx);

        double div = 0;
        try {
            div = mathBox.divider(n1, n2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(n1 + " / " + n2 + " = " + div);

        double divMyEx = 0;
        try {
            divMyEx = mathBox.dividerMyException(n1, n2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(n1 + " / " + n2 + " = " + divMyEx);

        long factr = mathBox.factorial(60);
        System.out.println("factorial = " + factr);

    }
}

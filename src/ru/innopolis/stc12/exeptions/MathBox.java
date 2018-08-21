package ru.innopolis.stc12.exeptions;

public class MathBox {
    public int summa(Integer a, Integer b) {
        int result = a + b;
        return result;
    }

    public int diff(Integer a, Integer b) {
        int result = a - b;
        return result;
    }

    public long factorial(Integer a) {
        return a * factorial(a - 1);
    }

    public double dividerExceptionInside(Integer a, Integer b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }

    public double divider(Integer a, Integer b) throws Exception {
        double result = 0;
        try {
            result = a / b;
            return result;
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public double dividerMyException(Integer a, Integer b) throws MyException {
        double result = 0;
        try {
            result = a / b;
            return result;
        } catch (Exception e) {
            throw new MyException("My exception");
        }
    }
}

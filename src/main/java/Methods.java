public class Methods {
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int getMaxFromArray(int[] array) {
        int result = 0;

        if (array.length > 0) {
            for (int currentValue : array) {
                result = getMax(result, currentValue);
            }
        }

        return result;
    }

    public static int getMax3(int a, int b, int c) {
        int[] array = {a, b, c};

        return getMaxFromArray(array);
    }

    public static int getMax5(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};

        return getMaxFromArray(array);
    }

    public static int getFactorial(int a) {
        return ((a - 1) > 0) ? getFactorial(a - 1)*a : a;
    }

    public static boolean isLeapYear(int year) {
        return ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0) ? true : false;
    }

    public static String printFibonacci(int n) {
        String result = "";

        if (n < 0) {
            return "0";
        }

        if (n <= 1) {
            return String.valueOf(n);
        } else {
            int[] array = new int[n];
            array[0] = 0;
            array[1] = 1;
            String coma;

            for (int i = 0; i < n; i++) {
                if (i > 1) {
                    array[i] = array[i - 2] + array[i - 1];
                }

                coma = (i > 0) ? ", " : "";

                result += coma + String.valueOf(array[i]);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = -3;
        int d = 11;
        int e = 0;
        int year = 2016;

        System.out.println(String.format("The greatest from %d and %d is %d", a, b, getMax(a, b)));
        System.out.println(String.format("The greatest from %d, %d, %d is %d", a, b, c, getMax3(a, b, c)));
        System.out.println(String.format("The greatest from %d, %d, %d, %d, %d is %d", a, b, c, d, e, getMax5(a, b, c, d, e)));
        System.out.println(String.format("Factorial for %d is %d", a, getFactorial(a)));
        System.out.println(String.format("Year %d is leap-year: %b", year, isLeapYear(year)));

        System.out.println(String.format("Fibonacci numbers: %s", printFibonacci(10)));
    }
}

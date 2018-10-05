public class Arrays {
    public static String charArrayToString(char[] array) {
        return new String(array);
    }

    public static int getArrayIndexByValueForward(int[] array, int elementValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementValue) {
                return i;
            }
        }

        return -1;
    }

    public static int getArrayIndexByValuetBackward(int[] array, int elementValue) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == elementValue) {
                return i;
            }
        }

        return -1;
    }

    public static void printArrayValuesMultiplyToParam(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]%value == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static int[] sortArray(int[] array) {
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j + 1) < array.length) {
                    if (array[j] > array[j + 1]) {
                        value = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = value;
                    }
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static boolean isElementDuplicated(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) &&(array[i] == array[j])) {
                    return true;
                }
            }
        }

        return false;
    }

    public static String[] getStringArrayWithSubstring(String[] array, String substring) {
        int resultArrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(substring)) {
                resultArrayLength++;
            }
        }

        String[] resultArray = new String[resultArrayLength];

        if (resultArrayLength == 0) {
            return resultArray;
        }

        for(int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i];
        }

        return resultArray;
    }

    public static void main(String[] arrays) {
        char[] charArray = {'a', 'b', 'c'};
        int[] intArray = {3, 5, 8, 9, 8, 11, -2, 0};

        System.out.println("1:");
        System.out.println(charArrayToString(charArray));

        System.out.println("\n2:");
        System.out.println(getArrayIndexByValueForward(intArray, 5));

        System.out.println("\n3:");
        System.out.println(getArrayIndexByValuetBackward(intArray, 8));

        System.out.println("\n5:");
        printArrayValuesMultiplyToParam(intArray, 2);

        System.out.println("\n6:");
        printArray(sortArray(intArray));

        System.out.println("\n7:");
        byte[] byteArray = {1, 2, 4, 3, 2};
        System.out.println(isElementDuplicated(byteArray));

        System.out.println("\n8:");
        String[] stringArray = {"aaa", "bbaaabb", "cccbbbaaa"}; //8
        printArray(getStringArrayWithSubstring(stringArray, "Bb"));

        System.out.println("\n9:");
        String[][] doubleArray = {{"aaa", "ddd"}, {"ssss", "1234", "wer"}};
        printArray(doubleArray);
    }
}

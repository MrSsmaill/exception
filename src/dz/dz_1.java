package dz;

public class dz_1 {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{1, 5, 5, 9, null, 7, 9, 5, null, 3};
        Integer[] array2 = new Integer[]{1, 5, 5, 9, 2, 7, 9, 5, 4, 3};
        Integer[] array3 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] array4 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        printArray(array1);
        printArray(array2);
//        printArray(array3);
        printArray(array4);
//        printArray(sumArrays(array2, array3));
        printArray(differenceArrays(array2,array4));
    }


    public static Integer[] differenceArrays(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинна массивов не равна");
        }
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null | arr2[i] == null) {
                throw new RuntimeException("Не верные значения матрици " + i);
            }
            if (arr2[i]==0){
                throw new RuntimeException("Деление на 0 в " + i +" индексе");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }


    public static Integer[] sumArrays(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинна массивов не равна");
        }
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null | arr2[i] == null) {
                throw new RuntimeException("Не верные значения матрици " + i);
            }
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}

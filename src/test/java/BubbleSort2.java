import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 1, 10, 50, 10};
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int tmp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayToSort));
    }
}
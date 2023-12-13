public class mergeSort {
    public static void mergeSort(int[] array, int[] tempArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, tempArray, leftIndex, middleIndex);
            mergeSort(array, tempArray, middleIndex + 1, rightIndex);
            merge(array, tempArray, leftIndex, middleIndex, rightIndex);
        }
    }

    public static void merge(int[] array, int[] tempArray, int leftIndex, int middleIndex, int rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++) {
            tempArray[i] = array[i];
        }

        int i = leftIndex, j = middleIndex + 1, k = leftIndex;

        while (i <= middleIndex && j <= rightIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middleIndex) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}

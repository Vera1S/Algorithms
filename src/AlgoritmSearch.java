public class AlgoritmSearch {
       public class MaxElement {
        public static int search(int[] array) {
            int leftBorder = 0;
            int rightBorder = array.length - 1;

            while (leftBorder <= rightBorder) {
                int middleIndex = (leftBorder + rightBorder) / 2;

                if ((middleIndex == 0 || array[middleIndex] >= array[middleIndex - 1]) && (middleIndex == array.length - 1 || array[middleIndex] > array[middleIndex + 1]))
                    return middleIndex;
                if (array[middleIndex] > array[middleIndex + 1]) {
                    rightBorder = middleIndex - 1;
                } else {
                    leftBorder = middleIndex + 1;
                }
            }
            return -1;
        }
    }
}

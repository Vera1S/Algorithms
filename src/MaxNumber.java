public class MaxNumber {
    public static void main(String[] args) {

//        Задание № 2
// Реализуйте и оцените алгоритм поиска максимального числа в
//неотсортированном массиве (объясните почему именно такая оценка).
//Реализовать можно как в виде текста, псевдокода или блок-схемы, так
// и в виде реального кода.
//
//1. Следует пояснить, что под "быстротой" алгоритма будет
// подразумеваться его асимптотическая сложность, а не физическое
// время выполнения.
//
//В действительности, единственный способ точно найти самое большое число
//в случайном массиве будет перебор каждого числа в поисках максимума.
//Поэтому сложность такого алгоритма – O(n) называется линейными.
//
//Шаг 1: Начало
//Шаг 2: Получить массив в arr и число для поиска в x
//Шаг 3: Начните с крайнего левого элемента arr[] и один за другим
//сравните x с каждым элементом arr[]
//Шаг 4: Если x соответствует элементу Print True.
//
//Шаг 5: Если x не совпадает ни с одним из элементов, выведите False.
//Шаг 6: Конец
        int[] arr = {1, 52, 3, 9, 45};
//        public static int findMax(int) {
//            if (arr.length == 0) {
//              throw new IllegalArgumentException("Массив пуст");
//            }
        int max = arr[arr.length - 1];     //За изначальный максимум берем  с последнего элемента (первый элемент массива arr[0];)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Максимальное число: " + arr[i]);
            }
        }
    }
}


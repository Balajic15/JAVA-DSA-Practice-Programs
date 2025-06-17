public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int t = arr[min]; arr[min] = arr[i]; arr[i] = t;
        }
        for (int i : arr) System.out.print(i + " ");
    }
}

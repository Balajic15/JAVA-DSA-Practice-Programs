public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        for (int i : arr) System.out.print(i + " ");
    }
}

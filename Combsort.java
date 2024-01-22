public class Combsort {
    public static void main(String[] args) {
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        combSort(arr);
        print(arr);
    }

    private static int getNextGap(int gap) {
        // Shrink gap by Shrink factor
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    public static void combSort(int arr[]) {
        int n = arr.length;
        int gap = n;

        boolean swapped = true;

        while (gap != 1 || swapped == true) {
            gap = getNextGap(gap);

            swapped = false;
            for (int i=0; i< n-gap; i++) {
                if (arr[i] > arr[i+gap]) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


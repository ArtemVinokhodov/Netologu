public class Main {

    //public static int count = 0;

    public static void main(String[] args) {
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};

        int x = binarySearch(arr, 32);
        int y = binarySearch(arr, 60);
        System.out.println(x);
        System.out.println(y);
    }

    public static int binarySearch(int[] arr, int elementToFined) {
        int left = 0;
        int right = arr.length - 1;
        int middle;


        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == elementToFined) {
                return middle;
            }

            if (arr[middle] > elementToFined) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}

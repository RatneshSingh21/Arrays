

public class rainwater{
    public static int trap(int[] arr) {
        int left[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        int right[] = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        int trapping = 0;
        for (int i = 0; i < arr.length; i++) {
            int water = Math.min(left[i], right[i]);
            trapping += water - arr[i];
        }
        return trapping;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trap(arr));
    }
}

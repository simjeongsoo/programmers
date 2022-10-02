
public class AryAvg {
    static double aryAvg(int[] arr) {
        if (arr == null || arr.length == 0) { // arr null check
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5,5};

        System.out.println("aryAvg = "+aryAvg(arr1));
        System.out.println("aryAvg = "+aryAvg(arr2));
    }
}
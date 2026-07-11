import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int countTriplets(int sum, int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int tripletSum = arr[i] + arr[left] + arr[right];

                if (tripletSum < sum) {
                    // All pairs (left, left+1) ... (left, right) are valid
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input handling
        int n = sc.nextInt();          // size of array
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();           // target sum

        Solution ob = new Solution();
        int ans = ob.countTriplets(k, a);

        System.out.println(ans);
    }
}
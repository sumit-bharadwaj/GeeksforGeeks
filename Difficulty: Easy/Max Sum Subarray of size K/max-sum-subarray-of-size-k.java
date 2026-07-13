class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low =0;
        int high =k-1;
        int sum = 0;
        for( int i=0; i<=high; i++){
            sum += arr[i];
        }
        // sliding array
        int res =0;
        int n = arr.length;
        while(high <= n){
            res = Math.max(res,sum);
            low++;
            high++;
            if(high == n){
                break;
            }
            sum = sum -arr[low-1];
            sum = sum+arr[high];
        }
        return res;
    }
}
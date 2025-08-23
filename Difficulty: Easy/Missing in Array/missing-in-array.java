class Solution {
    long missingNum(int arr[]) {
        // code here
        int N=arr.length+1;
        long OrignalSum= ((long)N*(N+1))/2;
        long ArrSum=0;
        for(int i=0;i<arr.length;i++){
             ArrSum= ArrSum+arr[i];
        }
         return OrignalSum-ArrSum;
    }
}

class Solution {
    public int kadanesMin(int[] arr,int n){
        int minSum=arr[0],sum=arr[0];
        for(int i=1;i<n;i++){
            sum = Math.min(arr[i],sum+arr[i]);
            minSum = Math.min(sum,minSum);
        }
        return minSum;
    }
    public int kadanesMax(int[] arr,int n){
        int maxSum=arr[0],sum=arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int s = Arrays.stream(arr).sum();
        int min = kadanesMin(arr,n);
        int max = kadanesMax(arr,n);
        int cic = s-min;
        if(max>0) return Math.max(cic,max);
        return max;
    }
}
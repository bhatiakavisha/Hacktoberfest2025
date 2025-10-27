class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum=0;
       long n=arr.length+1;
       long result=n*(n+1)/2;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
            return (int)(result-sum);

    }
}

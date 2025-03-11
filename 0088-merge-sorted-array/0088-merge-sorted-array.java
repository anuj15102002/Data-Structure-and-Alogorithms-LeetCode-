class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //in this we have to start from one's end and append the number
        //of second array from that position(m or n)
        for(int i=0,j=m;i<n;i++)
        {
            nums1[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        
    }
}
class Solution {
    public int maxArea(int[] height) {
        //we have two pointer s and e
        //and a variable for maxArea
        int s=0, max=0;
        int e=height.length-1;

        while(s<e){
            //variable to store current area
            //find min bcoz it will store atmost at that height (l) 
            //and breadth (e-s)
            int area=Math.min(height[s],height[e])*(e-s);

            //compare it with max
            max=Math.max(area,max);

            //if the height of e index is greater then we can move
            //e pointer to left to find the bigger line
            if(height[e]>height[s])s++;

            //if not then move e to right to find the bigger line
            else e--;

            }
            return max;
    }
}
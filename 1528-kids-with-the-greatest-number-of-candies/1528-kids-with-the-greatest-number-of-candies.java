class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //first we find the maxCandies among the candies array 
        //then comapre with each kid candies + extraCanides is Greater than
        //the maxCandies or not
        //and store the boolean in arrayList

        List<Boolean> result=new ArrayList<>();
        int maxCandies=0;
        for(int candy:candies)
        {
            maxCandies=Math.max(candy,maxCandies);
        }

        for(int candy:candies)
        {
            if(candy+extraCandies>=maxCandies)result.add(true);
            else result.add(false);
        }
        return result;
        
    }
}
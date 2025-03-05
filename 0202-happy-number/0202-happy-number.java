class Solution {
    public boolean isHappy(int n) {


        //First MEthod with HashSet

//         //we take set to store the square sum of numbers
//         Set<Integer> set=new HashSet<>();
//         //starts infinite loop
//         while(true){

//             //loop through number to find the sum of digit's square
//             int sum=0;
//             while(n!=0)
//             {
//                 sum+=Math.pow(n % 10 , 2);
//                 n=n/10;
                
//             }

//             if(sum==1)return true;

//             n=sum;

//             //if set catains the sum it means it will be an infinte
//             //loop and it is not an Happy Number
//             if(set.contains(n))return false;
//             //otherwise add this to set
//             set.add(n);
//         }
        
//     }
// }


            //Second method with Recursion

            if(n==7 || n==1)return true;//break condition 
            else if(n<10)return false; //break condition
            else{
                int sum=0;
                while(n>0) //find the digit's square sum
                {
                    int temp=n%10;
                    sum+=temp*temp;
                    n=n/10;

                }
                return isHappy(sum); //calling the function in loop
            }
    }
}
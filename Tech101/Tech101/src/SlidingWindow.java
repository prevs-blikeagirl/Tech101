import java.util.Arrays;


public class SlidingWindow {

   static  String mesg = ""; 
   static boolean found = false;
 
 
 
     
     public static  void slideTwoNums(int[] inputArr, int targetVal) throws Exception {

        int len = inputArr.length;

         if(len <2) {
             throw new Exception("Less than 2 numbers for 2 sum!!");
 
         }

         
 
         Arrays.sort(inputArr);

         if(inputArr[len-1] > targetVal) {
             mesg = "Last number is already greater than target sum, so not doing anything! \n";
             found = false;

         }
 
         System.out.println("Sorted Array" + "\n");
 
        for(int i= 0;i< len; i++ ){
            System.out.println(inputArr[i] + "\n");
        }
         int leftIndex = 0;
         int rightIndex = leftIndex + 1 ;
 
         
         while (leftIndex <rightIndex && rightIndex <len) {
 
             int sum = inputArr[leftIndex] + inputArr[rightIndex];
 
             if(sum == targetVal) {
                mesg = sum + " is right match for " + inputArr[leftIndex] + " and "+inputArr[rightIndex] + "\n";
    
                 break;
             }
 
        
                 leftIndex++;
            
                 rightIndex++;
             
             
         }
        
         
     }
 
    public static void main(String args[]) throws Exception{
 
     int[] inputArray = {2,3,4,6,7,10};

     
 
     slideTwoNums(inputArray, 17);


   
     
     System.out.println(mesg);
 
    }

}
    


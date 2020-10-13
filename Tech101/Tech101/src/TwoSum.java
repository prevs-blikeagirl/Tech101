import java.util.Arrays;

public class TwoSum {

   static  int num_1 =0;
   static  int num_2 = 0;



    
    public static  void twoSumMethod(int[] inputArr, int targetVal) throws Exception {
        if(inputArr.length <2) {
            throw new Exception("Less than 2 numbers for 2 sum!!");

        }

        Arrays.sort(inputArr);

        System.out.println("Sorted Array" + "\n");

       for(int i= 0;i< inputArr.length; i++ ){
           System.out.println(inputArr[i] + "\n");
       }
        int leftIndex = 0;
        int rightIndex = inputArr.length - 1;

        
        while (leftIndex <rightIndex) {

            int sum = inputArr[leftIndex] + inputArr[rightIndex];

            if(sum == targetVal) {
                System.out.println(sum + "is right match" + "\n");
                num_1 = inputArr[leftIndex];
                num_2 = inputArr[rightIndex];
                break;
            }

            if(sum < targetVal) {
                System.out.println(sum + "is less so picking new left index" + "\n");
                leftIndex++;
            }

            if(sum >targetVal) {
                System.out.println(sum + "is more so picking new right index" + "\n");
                rightIndex--;
            }
            
        }
       
        
    }

   public static void main(String args[]) throws Exception{

    int[] inputArray = {2,3,4,6,7,10,3};

    twoSumMethod(inputArray, 10);
    
   System.out.println("Numbers matched first" + num_1 + "\t"+num_2);

   }

    
}

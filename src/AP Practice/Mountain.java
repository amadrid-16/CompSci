public class Mountain{

   public static boolean isIncreasing(/*int[] array, int stop*/){
      return true;
   }
   public static boolean isDecreasing(/*int[] array, int start*/){
      return true;
   }
   public static int getPeakIndex(int[] array){
      for(int x = 1; x<array.length -1; x++){
         if (array[x-1]<array[x] && array[x]>array[x+1]){
            
            return x;
         }
      }
      
      return -1;
   }
   public static boolean isMountain(int[] array){
      int peak = getPeakIndex(array);
      return (peak !=-1) && isIncreasing(/*array.peak*/) && isDecreasing(/*array.peak*/);
   }
   
   
   public static void main(String[] args){
      int[] array = {11, 11, 11, 13, 13, 11, 11};
      
      boolean x = isMountain(array);
      System.out.println(x);
   }

}
public class SortTester{
   public static void main(String[] args){
      int [] studentNumbers = {1, 2, 3, 4, 5, 8, 9};
      int [] studentsRandomNumbers = {1, 7, 4, 2, 9, 0, 3, 6, 8};
      
      int target = 7;
      
      int index = SearchingAndSorting.sequentialSearch(studentNumbers, target);
      System.out.println(index);
      
      /*index = SearchingAndSorting.
      System.out.println(index);
      */
   }
}
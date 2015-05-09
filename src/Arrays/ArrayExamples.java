package Arrays;
public class ArrayExamples{

//Defn - a container that holds a fixed number of values of a single type
//dataType[] arrayRefVar; how to create an array  (general form)
//double[] myList; how to create a double array

//dataType[] arrayRedVar = dataTy[e[size]; create and inititializes the array of size
//double[] myList = double[4];

//dataType[] array RefVar = {val1, val2, val 3,..., valn}; creates and initializes the elements
//double[] myList = {1.9, 2.9, 3.4, 3.5, 3.14, 2.718};

   public static void main(String[] args){
   
      //double[] myList = {1.9, 2.9, 3.4, 3.5, 3.14, 2.718};
      // indexes           0,    1,   2,  3,    4,    5
      //length = 6         1,    2,   3,  4,    5,    6
      
      //Print out all of the elements of the array
      // start; end; iteration after each of the loop
      //1) for (int i = 0; i < myList.length; i++){
      //1) for (int i = 0; i < myList.length - 1; i++){
      //2   
      //for(int i=0; i <= myList.length - 1; i++){
      
         //System.out.print(myList[i-1 + " ");
         //System.out.print(myList[i] + " ");
      /*}
      
      String[] myNames = {"Bob", "Suzie", "Samantha", "Helen", "Jose", "Parsons"};
      
      for (String names:myNames){
      
         System.out.print("\n" + names + " ");
      
      }
      
      //Summing of all the elements
      double total = 0;
      for (int i = 0; i < myList.length; i++){
      
         total += myList[i]; //total + myList[i], whatever the sum is assign into total      
      }
      
      System.out.println("\nTotal is: " + total);
      
      //Find the max value
      double max = myList[0];
      for (int i = 1; i < myList.length; i++){
      
         if (max< myList[i])
            max = myList[i];
      
      }
      System.out.println("Max is " + max);*/
	   int[] arr = {1,0,2,-3,4,5};
	   int count = 0, index = 0;
	   System.out.println("Given Example");
	   while (index < arr.length){
		   System.out.print("index" + index);
		   if (arr[index] > 0)
			   count++;
		   index++;
		   System.out.println(" count "+ count);
	   }
	   /*System.out.println("\nNumber I");
	   count = 0;
	   index = 0;
	   for (int num : arr){
		   System.out.print("index" + index);
		   if (arr[num] > 0)
			   count++;
		   index++;
		   System.out.println(" count "+ count);
	   }*/
	   System.out.println("\nNumber II");
	   count = 0;
	   index = 0;
	   for (int num : arr){//enhanced for loop which is equivalent to given example^^^
		   System.out.print("index" + index);
		   if (num>0)
			   count++;
		   index++;
		   System.out.println(" count "+ count);
	   }
	   System.out.println("\nNumber III");
	   count = 0;
	   index = 0;
	   for (int i = 0; i< arr.length; i++){
		   System.out.print("index" + index);
		   if (arr[i]>0)
			   count++;
		   index++;
		   System.out.println(" count "+ count);
	   }
   }

}
package sorting;
public class SearchingAndSorting{

   public static int sequentialSearch(int[] elements, int target)
   {//declaring static that returns an int with inputs of an int[]
      for (int j = 0; j < elements.length; j++)
      {//loop through all of the ints in the elements array
         if (elements[j] == target)
         {//check if the contents of elements[j] to see if it is equal to target
            return j;
         }//if they do match then return the value of j
      }
   return -1;
            
   
   
   //if here isnt a match, then return -1
   }
   
   public static int binarySearch(int[] elements, int target)
   {//creating static method with parameters
      int left = 0;//creates a leftmost variable
      int right = elements.length - 1;

      while (left <= right)
      {
         int middle = (left + right) / 2;
         
         if (target < elements[middle])
         {
            right = middle - 1;
         }
         else if (target > elements[middle])
         {
            left = middle + 1;
         }
         else
         {
            return middle;
         }
      }
      return -1;
   }

   public static void selectionSort(int[] elements)
   {
      for (int j = 0; j < elements.length - 1; j++)
      {
         int minIndex = j;
         
         for (int k = j + 1; k < elements.length; k++)
         {
            if (elements[k] < elements[minIndex])
            {
               minIndex = k;
            }
         }
         int temp = elements[j];
         elements[j] = elements[minIndex];
         elements[minIndex] = temp;
      }
   }

   public static void insertionSort(int[] elements)
   {
      for (int j = 1; j < elements.length; j++)
      {
         int temp = elements[j];
         int possibleIndex = j;
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
         {
            elements[possibleIndex] = elements[possibleIndex - 1];
            possibleIndex--;
         }
         elements[possibleIndex] = temp;
      }
   }

//The last three methods all go together as a part of the same sorting algorithm
   public static void mergeSort(int[] elements)
   {
      int n = elements.length;
      int[] temp = new int[n];
      mergeSortHelper(elements, 0, n - 1, temp);
   }

   private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
   {
      if (from < to)
      {
         int middle = (from + to) / 2;
         mergeSortHelper(elements, from, middle, temp);
         mergeSortHelper(elements, middle + 1, to, temp);
         merge(elements, from, middle, to, temp);
      }
   }

   private static void merge(int[] elements, int from, int mid, int to, int[] temp)
   {
      int i = from;
      int j = mid + 1;
      int k = from;
      while (i <= mid && j <= to)
      {
         if (elements[i] < elements[j])
         {
            temp[k] = elements[i];
            i++;
         }
         else
         {
            temp[k] = elements[j];
            j++;
         }
         k++;
      }
      while (i <= mid)
      {
         temp[k] = elements[i];
         i++;
         k++;
      }
      while (j <= to)
      {
         temp[k] = elements[j];
         j++;
         k++;
      }
      for (k = from; k <= to; k++)
      {
         elements[k] = temp[k];
      }
   }

}
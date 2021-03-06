// This file is from Main's Text (Chapter 12). See Section 03 for the background.
// File: Heapsort.java
// A Java application to illustrate the use of a heapsort
// Additional javadoc documentation is available at:
//   http://www.cs.colorado.edu/~main/docs/Heapsort.html
 
/******************************************************************************
* The <CODE>Heapsort</CODE> Java application illustrates a heapsort.
* Part of the implementation (the <CODE>makeHeap</CODE> and
* <CODE>reheapifyDown</CODE> methods) is left
* as a student exercise.
*
* <p><b>Java Source Code for this class (without 
* <CODE>makeHeap</CODE> and <CODE>reheapifyDown</CODE>:</b>
*   <A HREF="../applications/Heapsort.java">
*   http://www.cs.colorado.edu/~main/applications/Heapsort.java
*   </A>
*
* @author Michael Main and (___student name___) 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version Feb 10, 2016
******************************************************************************/
public class Heapsort
{
   /**
   * The main method illustrates the use of a heapsort to sort a 
   * small array.
   * @param args
   *   not used in this implementation
   **/
   public static void main(String[ ] args)
   {
      final String BLANKS = "  "; // A String of two blanks
      int i;                      // Array index

      int[ ] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };

      // Print the array before sorting:
      System.out.println("Here is the entire original array:");
      for (i = 0; i < data.length; i++)
         System.out.print(data[i] + BLANKS);
      System.out.println( );

      // Sort the numbers, and print the result with two blanks after each number.
      heapsort(data, data.length);
      System.out.println("After sorting, the numbers are:");
      for (i = 0; i < data.length; i++)
         System.out.print(data[i] + BLANKS);
      System.out.println( );

      System.out.println("Perform test\n");
      test(data, data.length);
      System.out.println("End of test\n");
   }
   
   
   /**
   * This method cannot be used until the student implements 
   * <CODE>makeHeap</CODE> and <CODE>reheapifyDown</CODE>.
   * Sort an array of integers from smallest to largest, using a heapsort
   * algorithm.
   * @param data
   *   the array to be sorted
   * @param n
   *   the number of elements to sort, (from <CODE>data[0]</CODE> 
   *   through <CODE>data[n-1]</CODE>)
   * <b>Precondition:</b>
   *   <CODE>data</CODE> has at least <CODE>n</CODE> elements.
   * <b>Postcondition:</b>
   *   If <CODE>n</CODE> is zero or negative then no work is done. Otherwise, 
   *   the elements of <CODE>data</CODE> have been rearranged so that 
   *   <CODE>data[0] &lt;= data[1] &lt;= ... &lt;= data[n-1]</CODE>.
   * @exception ArrayIndexOutOfBoundsException
   *   Indicates that <CODE>data</CODE> has fewer than <CODE>n</CODE> elements.
   * */
   public static void heapsort(int[ ] data, int n)
   {
      int unsorted; // Size of the unsorted part of the array
      int temp;     // Used during the swapping of two array locations

      makeHeap(data, n);

      unsorted = n;

      while (unsorted > 1)
      {
         unsorted--;

         // Swap the largest element (data[0]) with the final element of unsorted part  
         temp = data[0];
         data[0] = data[unsorted];
         data[unsorted] = temp;

         reheapifyDown(data, unsorted);
      }
   }
   
   private static void makeHeap(int[ ] data, int n)
   // Precondition: data is an array with at least n elements.
   // Postcondition: The elements of data have been rearranged so that the
   // complete binary tree represented by this array is a heap.
   {  
     // modify the follow code to complete your implementation
     // System.err.println("The student needs to implement the makeHeap and");
     // System.err.println("reheapifyDown methods before the heapsort can be used.");
      //System.exit(0);
      
      for (int i=1; i< n; i++){
          int k=i;
          while(k>0 && data[k] >data[(k-1)/2]){
            int temp = data[(k-1)/2];
            data[(k-1)/2] = data[k];
            data[k] = temp;
            k= (k-1)/2;
      }
   }
   }

      private static void reheapifyDown(int[ ] data, int n){
   // Precondition: n > 0, and data is an array with at least n elements. These
   // elements form a heap, except that data[0] may be in an incorrect
   // location.
   // Postcondition: The data values have been rearranged so that the first
   // n elements of data now form a heap.
    
     // modify the follow code to complete your implementation
     //System.err.println("The student needs to implement the makeHeap and");
     //System.err.println("reheapifyDown methods before the heapsort can be used.");
     //System.exit(0);
     
     int current;         // The index of node moving down
     int bigChildIndex;   // The index of current's larger child
     boolean heapOkay;    // Will become true when heap is correct
     
     current = 0;        // Start by looking at the root/beginning of the array
     heapOkay = false;   // Set to false for not being a heap
     
     while ((!heapOkay) && ((2*current + 2) <= n-1)){
            if((2*current + 1) == n-1)
              bigChildIndex = 2*current + 1;
    
              if(data[2*current + 1] < data[2*current +2])
                bigChildIndex = 2*current +2;
               else
                  bigChildIndex = 2*current +1;
               
               if(data[current] < data[bigChildIndex]){
                 
                 int hold = data[current];
                 data[current] = data[bigChildIndex];
                 data[bigChildIndex]= hold;
                 current = bigChildIndex;
               }
                else heapOkay = true;
           }
   
            
      }


   // Precondition: dat is an int array of length len
   // 
   public static void test(int [] dat, int len) {
            dat = RandEx.randPermute(19);
     
     for (int i=0;i<dat.length;i++){

       System.out.print(dat[i] + "  ");
       
     } System.out.println( );
       heapsort(dat, dat.length);
       
     
      System.out.println("After sorting, the numbers are:");
      for (int i = 0; i < dat.length; i++){
         System.out.print(dat[i] + "  ");
     
      }
       System.out.println( );
       
       
       
     // use functions in RandEx to generate 20 permutations of the array dat
        
     // show them to the screen before applying heapsort to dat
     // apply heapsort to dat
     // show them to the screen after applying heapsort to dat
     // expected answer is of the form:
     // Original array:dat  = [ ... ]
     // apply permutation gives array 1
     // array 1:            = [ ... ]
     // after sorting:      = [ ... ]
     // ..............................
      // apply permutation gives array 20
     // array 20:           = [ ... ]
     // after sorting:      = [ ... ]
     // follow the above comments and implement the function
     // in the space below
   }
}


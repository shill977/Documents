/**Suzanne Hill
 * HW7 
 * CIS 351
 * Auto Generated Java Class.
 */
public class HW07 {
  /* Following the instructions given in the homework description,
   * complete the tasks by filling in the required details as listed below.
   */
  public static void main (String [] argv){    
    task1();
    task2();
    task3();
    task4();
    task5();
  }
  public static void task1(){
    System.out.println("Begin of task 1\n");
    
    // 1. 
    //ChainedHashNode [] H1 = new ChainedHashNode[104];
   ChainedTable H1=new ChainedTable(29);
    // 2. Create array A1 and put 105 distinct integers 
    // , say, a_1, ... , a_105 from U to A1
    int [] A1 = new int [105]; 
    int [] P1 = RandEx.randPermute(3000);
    for( int u = 0; u< A1.length; u++){
        A1[u]=P1[u];
        System.out.print(A1[u] +", ");
        
    } 
    for(int i=0; i< 29; i++)
     H1.put(A1[i], A1[i]);
    
    // 3. Randomly select b1, ... , b5 from a_1 to a_100
    //    Print b_1, .. , b_5 in the form B=[b_1, ... , b_5]  
    int [] pb = RandEx.randPermute(99);
    int[] b=new int [5];
    for(int i = 0; i<5; i++){
      b[i]=A1[pb[i]];
      
    // 4. Use containskey function to answer the questions (see HW description)
    //    print the answers to screen
    //    e.g. b_1 = 144 a_101 = 231. The answers will be shown like:
    // 
    //    H1 contains 144?    YES
    //    H1 contains 231?    NO
      
     H1.containsKey(b[i]);
     System.out.println("\nIs H1 contains key b"+b[i]+" ?       " + H1.containsKey(b[i]));
     System.out.println("Is H1 contains key a"+A1[i]+" ?       " + H1.containsKey(A1[i]));
    }
    
    
    
    
    System.out.println("\nEnd of Task 1\n");
    
  }
  public static void task2(){
    System.out.println("Begin of Task 2\n");
    // 1. Create H2
   ChainedTable H2=new ChainedTable(29);
    
    // 2. Create array C1 and put 105 distinct integers 
    // , say, c_1, ... , c_105 from U to C1
   
     int [] C1 = new int [105]; 
    int [] P1 = RandEx.randPermute(3000);
    for( int u = 0; u< C1.length; u++){
        C1[u]=P1[u];
        System.out.print(C1[u] +", ");
        
    } 
    for(int i=0; i< 29; i++)
     H2.put(C1[i], C1[i]);
    
    
    // 3. Randomly select d1, ... , d5 from c_1 to c_100
    //    Print d_1, .. , d_5 in the form D=[d_1, ... , d_5]  
    int [] pd = RandEx.randPermute(99);
    int[] d=new int [5];
    System.out.println("\nAction\t\t\tReturn null?\t\t\tElement return is: ");
    for(int i = 0; i<5; i++){
      d[i]=C1[pd[i]];
    
    
    
    // 4. Use removes and get function to answer the questions (see HW description)
    //    print the answers to screen
    //    e.g. d_1 = 144 c_101 = 231. The answers will be shown like:
    // 
    //    Action                Return null?           Element return is:   
    //    Remove 144 from H2    ...                    ... 
    //    Remove 231 from H2    ...                    ... 
    //    etc.
    
    H2.remove(d[i]);
    
    
    }  
    
    System.out.println("\nRemove" + "\t\t\tReturn null?\t\t\tElement return is: ");
    
    System.out.println("\nEnd of Task 2\n");
  }
  public static void task3(){
    System.out.println("Begin of Task 3\n");
    // AFTER you have completed your implementation of the maxChainLength
    // length function, do the following:
    
    // 1. Create an empty hash table H3, Insert the elements from 0 to 
    // table.length-1, compute maxChainLength of H3 
    // Show to the screen
    // Max. Chain length of H3 =  ...
    
    
    // 2. Create an empty hash table H4, Insert the elements p, 2p, 10p 
    // (element i = i*p and p is table.length) compute maxChainLength of H4 
    // Show to the screen
    // After inserting element 1, Max. Chain length of H4 =  ...
    // After inserting element 2, Max. Chain length of H4 =  ...
    // ...
    // After inserting element 10, Max. Chain length of H4 =  ...
    
    
    System.out.println("End of Task 3\n");
  }
  public static void task4(){
    System.out.println("Begin of Task 4\n");
    // 1. Create an empty hash table H5
    
    
    // 2. Insert 1000 elements to H5, call t1, ... , t1000
    // The elements are selected randomly from 0 to Integer.MAX_VALUE        
    // 3. Use put function to insert t1, ... , t1000 to H5. Compute 
    // maxChainLength of H5. 
    // 4. Repeat step 2 and 3 10 times and compute the average, Call L.
    
    
    
    
    
    
    // 5.
    // Show L to the screen by printing
    // The average value L = ....
     
    System.out.println("\nEnd of Task 4\n");
  }
  public static void task5(){
    System.out.println("Begin of Task 5\n");
    
    // 1. Select 1000 distinct integers randomly from U, 
    // call them u1, ... , u1000
    
    
    
    
    // 2.
    // use u1, ..., u1000 to
    // Conduct the experiment for p = 29
    // Show results to the screen by printing
    // For p = 29, The value L = ...
    
    
    
    
    // 3.
    // use u1, ..., u1000 to
    // Conduct the experiment for p = 30
    // Show results to the screen by printing
    // For p = 30, The value L = ...
    
    
    
    
    // 4.
    // use u1, ..., u1000 to
    // Conduct the experiment for p = 31
    // Show results to the screen by printing
    // For p = 31, The value L = ...
    
    
    
    
    
    // 5.
    // use u1, ..., u1000 to
    // Conduct the experiment for p = 32
    // Show results to the screen by printing
    // For p = 32, The value L = ...
    
    
    System.out.println("\nEnd of Task 5\n");
  }
}
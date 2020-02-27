// An IntPriorityQueue is a priority queue where:
//
// 1. Both the data and its priority are of type int.
// 2. If two elements a, b have priority m,n (resp.), then a has a 
//    higher priority than b if and only if m > n.
// 3. If two element are of the same priority, this implementation may 
//    return any one of them as the element of highest priority
//
// Note: This is a suggested assignment from Main's text

public class IntPriorityQueue
{
  //An array of PQNodes stored as heap
  private PQNode[] heap;
  
  //maximum size of the heap. It is non - resizable.
  int maxSize=0;
  
  //No. of elements in the heap.
  int n=0;
  
   /**
   * Initialize an empty IntPriorityQueue with a specified array size.
   * @param arraySize
   *   the array size for this new Priority Queue
   * <b>Precondition:</b>
   *   <CODE>arraySize &gt; 0</CODE>
   * <b>IntPriorityQueue:</b>
   *   This queue is empty and has the specified array size.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the specified array size. 
   * @exception IllegalArgumentException
   *   Indicates that arraySize is not positive.
   **/   
  public IntPriorityQueue(int arraySize)
  {  
    
    if (arraySize <= 0)
      throw new IllegalArgumentException("Array size must be positive.");
    heap = new PQNode[arraySize];
    maxSize=arraySize;
  }
  
  /**
   * Add a new node to the heap, based on the priority.
   * @param data
   *   the data (type int) of the new node.
   * @param priority
   *   the priority (type int) of the new node to be added.
   * <b>Precondition:</b>
   *   Both <CODE>data</CODE> and <CODE>priorirty</CODE> is an int.  
   **/
  public void add(int data , int priority)
  {   // modify the follow code to complete your implementation
  
    
    PQNode new_node = new PQNode();
    PQNode temp = new PQNode(); 
    if(n<maxSize){
      heap[n]=new_node;
      heap[n].data = data;
      heap[n].priority = priority;
      n++;
      
          int k=n;
      while(k>0 && heap[(k-1)/2].priority > heap[k].priority ){
          temp = heap[(k-1)/2];
          heap[(k-1)/2] = heap[k];
          heap[(k-1)/2].data = heap[k].data;
          heap[(k-1)/2].priority = heap[k].priority;
          heap[k] = temp;
          k= (k-1)/2;   
      }
    } throw new IllegalArgumentException("Array size is not large enough to add node.");  
     
    
  }
  
  /**
   * Removes the node from the heap.
   * @return
   *   Remove the highest priority node from the heap; heap property maintained.
   *   Return the highest priority node.
   **/
  public PQNode remove()
  {   // modify the follow code to complete your implementation
    PQNode temp = heap[n-1];
    heap[n-1] = null;
    n--;
    System.out.print(temp.data + " " + temp.priority);
    return temp;
  }
  
  /**
   * Show the priority of the node with highest priority.
   * @return
   *   The priority of the node with highest priority.
   **/
  public int showHighestPriority()
  {   
    return heap[n-1].priority;    
  }
  
  /**
   * Show the data of the node with highest priority.
   * @return
   *   The data of the node with highest priority.
   **/
  public int showFirstData()
  {    // modify the follow code to complete your implementation
    return heap[n-1].data;
  }
  
  /**
   * Display the elements in the heap (array) in array format (Eg. [3,2,1]).
   **/
  public void displayHeap()
  {
    for(int i=0;i<n-1; i++)
      System.out.print("[ " + heap[i].data + ", ");
    int i = n-1;
    System.out.print(heap[i].data + " ]\n");
  }   
  
  /**
   * Check if the heap (array) is empty
   * @return
   *   true if and only if the heap is empty
   **/
  public boolean isEmpty()
  {
    if (maxSize > 0)
    return false;
    else
      return true;
  }
  
class PQNode
{
   int data;
   int priority;
}
public static void main(String[ ] args){
}

}
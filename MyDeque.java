public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = -1;
    end = 0;
    size = 10;
  }
  public MyDeque(int initialCapacity){
    @SuppressWarnings("unchecked")
    data = (E[])new Object[initialCapacity];
    start = -1;
    end = 0;
    int size = initialCapacity;
  }

  public class Calculator{
      /*Evaluate a postfix expression stored in s.
       *Assume valid postfix notation, separated by spaces.
       */
      public static double eval(String s){}
  }

  public static double eval(String s){
    MyDeque dek = new MyDeque();
    for(int
  }
        
 //////////////////////////////
  public boolean isFull(){ 
    return ((front == 0 && end == size-1)|| 
            front == end+1); 
  } 
 /////////////////////////////
  public boolean isEmpty(){ 
    return (front == -1); 
  } 
 //////////////////////////////


  public int size(){
    return size;
  }

  public String toString(){//ummmmm
    String str = "";
    for (int i = start; i < data.size; i++){
      str+= data[i] + " ";
    }

  }

  public void addFirst(E element){
    /*if ((front == 0 && end == size-1)|| 
            front == end+1){
      resize(); //MAKE IT!!!
    }*/
    if(((front == 0 && end == size-1)|| 
            front == end+1)){
      System.out.println("no");
      return;
    }
    if(front == -1){
      front = 0;
      end = 0;
      data[front] = element;
      return;
    }
    if(front == 0){
      front = size-1;
      data[front] = element;
      return;
    }
    else{
      front--;
      data[front] = element;
      return;
    }
  }
  public void addLast(E element){
    if(((front == 0 && end == size-1)|| 
            front == end+1)){
      System.out.println("no");
      return;
    }
    if(front == -1){
      front = 0;
      end = 0;
      data[front] = element;
      return;
    }
    //if (end == size-1) ? end is last?
    else{
      end++;
      data[front] = element;
      return;
    }
  }
  public E removeFirst(){
    E remove = data[start];
    if(front == end){
      front = -1;
      end = -1;
    }
    else{
      if(front = size-1){
        front = 0;
      }
      else{
        front++;
      }
    }
    return remove;
  }
  public E removeLast(){
    E remove = data[end];
    end--;                
    return remove;
  }
  public E getFirst(){//returns front
    return data[start];
  }
  public E getLast(){//returns end
    return data[end];
  }
}

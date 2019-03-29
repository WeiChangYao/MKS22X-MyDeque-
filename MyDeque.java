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
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = -1;
    end = 0;
    int size = initialCapacity;
  }
/*
  public class Calculator{
      /*Evaluate a postfix expression stored in s.
       *Assume valid postfix notation, separated by spaces.
       */
 /*     public static double eval(String s){}
  }

  public static double eval(String s){
    MyDeque dek = new MyDeque();
    for(int
  }*/
        
 //////////////////////////////
  public boolean isFull(){ 
    return ((start == 0 && end == size-1)|| 
            start == end+1); 
  } 
 /////////////////////////////
  public boolean isEmpty(){ 
    return (start == -1); 
  } 
 //////////////////////////////


  public int size(){
    return size;
  }

/*  public String toString(){//ummmmm
    String str = "";
    for (int i = start; i < data.size; i++){
      str+= data[i] + " ";
    }

  }
*/
  public void addFirst(E element){
    /*if ((start == 0 && end == size-1)|| 
            start == end+1){
      resize(); //MAKE IT!!!
    }*/
    if(((start == 0 && end == size-1)|| 
            start == end+1)){
      System.out.println("no");
      return;
    }
    if(start == -1){
      start = 0;
      end = 0;
      data[start] = element;
      return;
    }
    if(start == 0){
      start = size-1;
      data[start] = element;
      return;
    }
    else{
      start--;
      data[start] = element;
      return;
    }
  }
  public void addLast(E element){
    if(((start == 0 && end == size-1)|| 
            start == end+1)){
      System.out.println("no");
      return;
    }
    if(start == -1){
      start = 0;
      end = 0;
      data[start] = element;
      return;
    }
    //if (end == size-1) ? end is last?
    else{
      end++;
      data[start] = element;
      return;
    }
  }
  public E removeFirst(){
    E remove = data[start];
    if(start == end){
      start = -1;
      end = -1;
    }
    else{
      if(start == size-1){
        start = 0;
      }
      else{
        start++;
      }
    }
    return remove;
  }
  public E removeLast(){
    E remove = data[end];
    if(start == end){
      start = -1;
      end = -1;
    }    
    else{
      if(end == 0){
        end = size-1;
      }
      else{
        end--;
      }
    }
    return remove;
  }
  public E getFirst(){//returns start
    return data[start];
  }
  public E getLast(){//returns end
    return data[end];
  }
}

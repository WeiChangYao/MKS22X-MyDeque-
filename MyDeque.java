import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size2, size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = -1;
    end = 0;
    size2 = 10;
    size = 0;
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = -1;
    end = 0;
    size2 = initialCapacity;
    size = 0;
  }
  
  public void resize(){
    @SuppressWarnings("unchecked")
    E[] d2 = (E[])new Object[size2*2]; //double the size
    //copystuff over
    int newStart = 0;
    if (start == 0){
      for(int i = start; i < size2; i++){
        d2[newStart] = data[i];
        newStart++;
      }
    }
    else{
      for(int i = start; i < size2; i++){
        d2[newStart] = data[i];
        newStart++;
      }
      for(int i = 0; i < start; i++){
        d2[newStart] = data[i];
        newStart++;
      }
    }
    data = d2; //makes data point at data2
    end = size2-1;
    size2 = size2*2;
    start = 0;
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

  public int size(){
    return size;
  }

  public int size2(){
    return size2;
  }


    public String toString(){//ummmmm
    if(size == 0) {
      return "{}";
    }
    String str = "{";
    int i = start;
    int j = end;
    while(i!=j){
      if(i>0&&i<size2){
        str+=data[i];
        i++;
      }
      else{
        i = 0;
        while(i!=j){
          str+=data[i];
          i++;
        }
        return str+data[j]+"}";
      }
    }
    return "";
  }
  
  public void addFirst(E element){
    /*if ((start == 0 && end == size2-1)|| 
            start == end+1){
      resize(); //MAKE IT!!!
    }*/
    if (element == null){
      throw new NullPointerException();
    }
    
    if(((start == 0 && end == size2-1)|| 
            start == end+1)){
      resize();
    }
    if(start == -1){
      start = 0;
      end = 0;
      data[start] = element;
      size++;
      return;
    }
    if(start == 0){
      start = size2-1;
      data[start] = element;
      size++;
      return;
    }
    else{
      start--;
      data[start] = element;
      size++;
      return;
    }
  }
  public void addLast(E element){
    //CHANGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    if (element == null){
        throw new NullPointerException();
    }
    if(((start == 0 && end == size2-1)|| 
            start == end+1)){
      resize();
    }
    if(start == -1){
      start = 0;
      end = 0;
      data[end] = element;
      size++;
      return;
    }
    //if (end == size2-1) ? end is last?
    else{
      end++;
      data[end] = element;
      size++;
      return;
    }
  }
  public E removeFirst(){
    if (start == -1){
      throw new NoSuchElementException();
    }
    E remove = data[start];
    if(start == end){
      start = -1;
      end = -1;
      size--;
    }
    else{
      if(start == size2-1){
        start = 0;
        size--;
      }
      else{
        size--;
        start++;
      }
    }
    return remove;
  }
  public E removeLast(){
    if (start == -1){
      throw new NoSuchElementException();
    }
    E remove = data[end];
    if(start == end){
      start = -1;
      end = -1;
      size--;
    }    
    else{
      if(end == 0){
        end = size2-1;
        size--;
      }
      else{
        size--;
        end--;
      }
    }
    return remove;
  }
  public E getFirst(){//returns start
    if (start == -1){
      throw new NoSuchElementException();
    }
    return data[start];
  }
  public E getLast(){//returns end
    if (start == -1){
      throw new NoSuchElementException();
    }
    return data[end];
  }
}

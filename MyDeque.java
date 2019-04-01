import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size2, size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = -1;//-1 for being empty
    end = 0;
    size2 = 10;//size2 is the total capacity
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
    if (start == 0){  //the start isn't in the other side
      for(int i = start; i < size2; i++){ 
        d2[newStart] = data[i];
        newStart++;
      }
    }
    else{ //start is on the oter side
      for(int i = start; i < size2; i++){ //from start to the end of array
        d2[newStart] = data[i];
        newStart++;
      }
      for(int i = 0; i < start; i++){ //from index 0 to end
        d2[newStart] = data[i];
        newStart++;
      }
    }
    data = d2; //makes data point at data2
    end = size2-1;
    size2 = size2*2; //double size
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
    return size;  //amount of things
  }

  public int size2(){
    return size2; //capacity
  }


    public String toString(){//ummmmm
    if(size == 0) {
      return "{}";
    }
    String str = "{";
    int i = start;
    int j = end;
    while(i!=j){
      if(i>0&&i<size2){ //adds start to end of array to string
        str+=data[i];
        i++;
      }
      else{
        i = 0;
        while(i!=j){
          str+=data[i]; //adds rest of stuff to string
          i++;
        }
        return str+data[j]+"}";
      }
    }
    return "";
  }
  
  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException();
    }
    
    if(((start == 0 && end == size2-1)|| 
            start == end+1)){
      resize();
    }
    if(start == -1){
      start = 0; //not empty anymore, so changes it
      end = 0;
      data[start] = element; //add
      size++;
      return;
    }
    if(start == 0){ //not empty
      start = size2-1; //add to the other side
      data[start] = element;
      size++; 
      return;
    }
    else{
      start--; //subtract from other side
      data[start] = element; //add thing
      size++;
      return;
    }
  }
  public void addLast(E element){
    if (element == null){
        throw new NullPointerException();
    }
    if(((start == 0 && end == size2-1)|| 
            start == end+1)){
      resize();
    }
    if(start == -1){ //not empty anymore
      start = 0;
      end = 0;
      data[end] = element;
      size++;
      return;
    }
    else{
      end++; //keep adding right
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
    if(start == end){ //this makes it empty
      start = -1;     //start is -1 again
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

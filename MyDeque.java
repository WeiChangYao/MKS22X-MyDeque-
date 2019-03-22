public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 10;
  }
  public MyDeque(int initialCapacity){
    @SuppressWarnings("unchecked")
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = data.length;
    int size = initialCapacity;
  }
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
    if(start == 0 && end!=start+1){
      start = size-1;
      data[start] = element;
    }
    if(start!=0 && end!=start-1){
      start--;
      data[start] = element;
    }
    //else, resize and stuff?
  }
  public void addLast(E element){
    if(end != size-1){
      end++;
      data[end]=element;
    }
  }
  public E removeFirst(){
    if(start != 0)
  }
  public E removeLast(){ }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}

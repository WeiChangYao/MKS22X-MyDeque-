public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = data.length;
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

  public String toString(){
    String str = "";
    for (int i = 0; i < data.size; i++){
      str+= data[i] + " ";
    }
  }
 /*
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }*/
}

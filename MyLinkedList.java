public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(int value){
    Node y;
    if (start == null){
      y = new Node(value, null, null);
      start = y;
      end = y;
    }
    else{
      y = new Node(value, null, end);
      end.setNext(y);
      end = y;
    }
    size += 1;
    return true;
  }
  public String toString(){
    Node current = start;
    String y = "[";
    for (int i = 0; i < size - 1; i ++){
      y += current + ", ";
      current = current.next();
    }
    if (size > 0){
      y += current;
    }
    y += "]";
    return y;
  }
  private Node getNthNode(int index){
    Node current = start;
    for (int i = 0; i < index; i ++){
      current = current.next();
    }
    return current;
  }
  public Integer get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    return getNthNode(index).getData();
  }
  public Integer set(int index, Integer value){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    Node current = getNthNode(index);
    int old = current.getData();
    current.setData(value);
    return old;
  }
  public boolean contains(Integer value){
    Node current = start;
    while (current != null){
      if (current.getData() == value){
        return true;
      }
      current = current.next();
    }
    return false;
  }
  public int indexOf(Integer value){
    Node current = start;
    int x = 0;
    while (current != null){
      if (current.getData().equals(value)){
        return x;
      }
      current = current.next();
      x += 1;
    }
    return -1;
  }
  public void add(int index, Integer value){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    if (index != size){
      Node current = getNthNode(index);
      Node y;
      if (index != 0){
        y = new Node(value, current, current.prev());
        current.prev().setNext(y);
      }
      else{
        y = new Node(value, current, null);
      }
      current.setPrev(y);
      if (index == 0){
        start = y;
      }
      if (index == size - 1){
        end = y;
      }
      size += 1;
    }
    else{
      add(value);
    }
  }
  public Integer remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    Node current = getNthNode(index);
    int old = current.getData();
    if (current != start){
      current.prev().setNext(current.next());
    }
    else{
      start = current.next();
    }
    if (current != end){
      current.next().setPrev(current.prev());
    }
    else{
      end = current.prev();
    }
    size = size - 1;
    return old;
  }
  public boolean remove(Integer value){
    remove(indexOf(value));
    return true;
  }
}

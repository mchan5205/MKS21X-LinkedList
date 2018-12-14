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
    Node y = new Node(value, null, end);
    end.setNext(y);
    y = end;
    size += 1;
    return true;
  }
  public String toString(){
    String y = "";
    for (int i = 0; i < size; i ++){
      y += "";
    }
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
    return getNthNode(index).getData();
  }
  public Integer set(int index, Integer value){
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
  public int IndexOf(Integer value){
    Node current = start;
    int x = 0;
    while (current != null){
      if (current.getData() == value){
        return x;
      }
      current = current.next();
      x += 1;
    }
    return -1;
  }
  public void add(int index, Integer value){
    Node current = getNthNode(index);
    Node y = new Node(value, current, current.prev());
    current.prev().setNext(y);
    current.setPrev(y);
    size += 1;
  }
  public Integer remove(int index){
    Node current = getNthNode(index);
    int old = current.getData();
    current.prev().setNext(current.next());
    current.next().setPrev(current.prev());
    return old;
  }
  public boolean remove(Integer value){
    remove(IndexOf(value));
    return true;
  }
}

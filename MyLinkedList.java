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
    return getNthNode(index).setData(value);
  }
}

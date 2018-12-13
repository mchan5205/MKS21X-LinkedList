class Node{
  private int data;
  private Node next,prev;
  public Node(int dt, Node nt, Node pv){
    data = dt;
    next = nt;
    prev = pv;
  }
}
class MyLinkedList{
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
    end.next = y;
    y = end;
  }
  public String toString(){
    String y = "";
    for (int i = 0; i < size; i ++){
      y += "";
    }
  }
}

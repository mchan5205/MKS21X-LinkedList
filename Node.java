public class Node{
  private int data;
  private Node next,prev;
  public Node(int dt, Node nt, Node pv){
    data = dt;
    next = nt;
    prev = pv;
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node other){
    next = other;
  }
  public void setPrev(Node other){
    prev = other;
  }
}

public class LinkedListNode <T>{
    LinkedListNode <T> next;
    T value;
    // the point of constructor is, for every value that is hard to assign 
    public <T> LinkedListNode(T value){
        this.value = value;
    }
    
    public String toString() {
        return value.toString()
    }

}

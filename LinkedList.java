import java.lang.IndexOutOfBoundsException;

public class LinkedList <T>{ 
    LinkedListNode <T> head;
    int length = 0;
    public void append(T value) {
        if (head == null){
            head = new LinkedListNode<T>(value);
        }
        else {
            LinkedListNode <T> var = head;
            while(var.next != null){
                var = var.next; 
            }
            var.next = new LinkedListNode<T>(value);
        }
        length = length + 1;

        }
    public void insert(T value, int index) {
        LinkedListNode <T> var = head;
        LinkedListNode <T> temp = new LinkedListNode<T>(value);
        if (index == 0){
            temp.next = head;
            head = temp;

            // temp --> 0 --> 1


        }
        for (int i = 0; i < index - 1 ; i += 1){
            // (starting ; conditional ; what you want to do with loop)
            var = var.next;

        }
        temp.next = var.next; 
        var.next = temp;
        length = length + 1
    }
    public T pop(int index) {
        // we can only pop if there is a head so if head isnt blank, returns value
        // if the head is blank then that means there is nothing in any node, or no linked list
        // im trying to say that if head isnt null just replace it by making the new head the next thing on the lest from head
        // if the index given is larger than list, we crash
        LinkedListNode <T> var = head;
        T temp ;
        if (int index >= int length){
            raise IndexOutOfBoundsException ("Index" + index + " out of bounds for length " + length );
        }
        elif (index == 0){
            temp = head.value;
            head = head.next;           
        }
        elif (){
            for (int i = 0; i < index - 1 ; i += 1){
                // (starting ; conditional ; what you want to do with loop)
                var = var.next;
            }
            temp = var.next.value;
            var.next = var.next.next;            
        }
        length = length - 1;
        return temp ;
        }

    public void remove(T value) {
        LinkedListNode <T> var = head;
        if (head.value == value){
            head = head.next;
            return;
        }
        for (int i = 0; i < length ; i += 1 ; { 
            // (starting ; conditional ; what you want to do with loop)
            if (var.next.value == value){
                var.next = var.next.next;
                return;
            }
            var = var.next;
        
        }
     
    }
    public void removeAll(T value) {
        LinkedListNode <T> var = head;

        for (int i = 0; i < length ; i += 1 ; { 
            // (starting ; conditional ; what you want to do with loop)
            if (var.next.value == value){
                var.next = var.next.next;
            }
            var = var.next;
        
        }
        if (head.value == value){
            head = head.next;
            
        }
     
    }
        
} 

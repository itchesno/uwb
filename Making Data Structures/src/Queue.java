public class Queue {
    //declares queue
    Object[] Queue;

    //constructor with given length
    public Queue(int length){
        Queue = new Object[length];
    }

    //constructor without given length
    public Queue(){
        Queue = new Object[0];
    }

    //adds an item to the back of the queue
    public void enqueue(Object o){
        Object[] NewQueue = new Object[size() + 1];
        NewQueue[0] = o;
        for(int i = 1; i < size(); i++){
            NewQueue[i] =  Queue[i];
        }
    }

    //returns the top data item from queue
    public Object dequeue(){
        int v = 1;
        Object[] NewQueue = new Object[size() - 1];
        for(int i = 0; i-1 < size(); i++){
            NewQueue[i] =  Queue[i];
            v++;
        }
        return Queue[v];
    }

    //returns size of queue
    public int size(){
        return Queue.length;
    }

    //returns string of queue contents
    public String toString(){
        String list = "";

        for(int i = 0; i < size(); i++){
            list += (Queue[i].toString() + ", ");
        }
        return list;
    }

    //Checks if the queue is empty
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }

    //Checks if all elements in queue are equal
    public boolean equals(Queue z) {
        for (int i = 1; i < z.size(); i++){
            if (z.get(0).equals(z.get(i)) == false){
                return false;
            }
        }
        return true;
    }

    //returns value at certain index of a queue
    public Object get(int index){
        return Queue[index];
    }
}

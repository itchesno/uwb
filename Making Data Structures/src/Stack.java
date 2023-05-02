public class Stack {
    //declares stack
    Object[] Stack;

    //constructor with given length
    public Stack(int length){
        Stack = new Object[length];
    }

    //constructor without given length
    public Stack(){
        Stack = new Object[0];
    }

    //adds an item to the top of the stack
    public void push(Object o){
        Object[] NewStack = new Object[size() + 1];
        int v = 0;
        for(int i = 0; i < size(); i++){
            NewStack[i] = Stack[i];
            v++;
        }
        NewStack[v] = o;
    }

    //removes an item from the top of the stack
    public Object pop(){
        Object[] NewStack = new Object[size() - 1];
        int v = 0;
        for(int i = 0; i < size(); i++){
            NewStack[i] = Stack[i];
            v++;
        }

        return Stack[v+1];
    }

    //returns size of stack
    public int size(){
        return Stack.length;
    }

    //returns string of stack contents
    public String toString(){
        String list = "";

        for(int i = 0; i < size(); i++){
            list += (Stack[i].toString() + ", ");
        }
        return list;
    }

    //Checks if the stack is empty
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }

    //Checks if all elements in stack are equal
    public boolean equals(Stack z) {
        for (int i = 1; i < z.size(); i++){
            if (z.get(0).equals(z.get(i)) == false){
                return false;
            }
        }
        return true;
    }

    //returns value at certain index of a stack
    public Object get(int index){
        return Stack[index];
    }
}

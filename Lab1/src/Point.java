public class Point {
    //Can access i
    public int i = 1;
    //Cannot access v
    private int v = 2;

    //Greeting() has private access in Point
    private void Greeting(){
        System.out.println("Hello!");
    }
    //Prints Goodbye! when called in main
    public void Farewell(){
        System.out.println("Goodbye!");
    }
}

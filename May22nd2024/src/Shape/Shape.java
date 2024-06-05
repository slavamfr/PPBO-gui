package Shape;

abstract class Shape {
    abstract void draw();

    private void display(){
        System.out.println("Displaying Shape");
    }

    void process(){
        display();
        draw();
    }
}

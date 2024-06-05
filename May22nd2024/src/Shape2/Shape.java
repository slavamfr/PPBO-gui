package Shape2;

abstract class Shape {
    protected String color;

    Shape(String color){
        this.color = color;
    }

    abstract void draw();
}

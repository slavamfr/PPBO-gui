package Shape2;

class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    @Override
    void draw(){
        System.out.println("Drawing circle of color : "+color);
    }
}

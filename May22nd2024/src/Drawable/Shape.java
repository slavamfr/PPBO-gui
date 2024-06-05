package Drawable;

abstract class Shape implements Drawable {
    @Override
    public void draw(){
        System.out.println("Drawing shape");
    }
    abstract void info();
}


package opdrachten;

public class Circle {
    //class variables
    public final static double PI = Math.PI;

    private int radius;
    private int x;
    private int y;

    //constructors


    public Circle(){ this(0, 0, 0);

    }
    public Circle(int radius){

    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setPosition(x, y);

    }
    //getters and setters

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = Math.abs(radius);
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void grow(int z){
        this.radius = (radius + z);
    }

    public double getArea(){
        return PI * (radius*radius);
    }

    public double getPerimeter(){
        return (double) 2 * (PI * radius);
    }
}


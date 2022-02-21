package opdrachten;

public class Rectangle {
//member variables
    //declare in declaration
    //public final static int ANGLES = 4;

    // initialize in static codeblock
    public final static int ANGLES;
    private static int count;

    static{
        //System.out.println("This static block is executed.");
        ANGLES = 4;
    }
    // this will be executed every time we make an object.
    {
        //System.out.println("We are creating an object.");
        count++;
    }
    private int height;
    private int width;
    private int x;
    private int y;


    //constructors
    //default constructor
    public Rectangle(){
        this(0,0, 0, 0);
    }

    public Rectangle(int width, int height){
        this(width, height, 0,0);
    }

    public Rectangle(int width, int height, int x, int y){
        setWidth(width);
        setHeight(height);
        setPosition(x, y);
    }

    //copy constructor
    public Rectangle(Rectangle r){
        this(r.getWidth(), r.getHeight(), r.getX(), r.getY());

    }
    //setters and getters
    public void setHeight(int height) {
        // add logic to avoid negative number, or to change it to a positive number.
        this.height = (height < 0)? - height : height;

    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        // this is another method to return an absolute (positive) number.
        this.width = Math.abs(width);
    }

    public int getWidth() {
        return this.width;
    }


    public void setX(int x){
        this.x = x;

    }

    public int getX() {
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public static int getCount(){
        return count;
    }

    // own methods added
    public void grow(int d){
        this.width = Math.abs(width * d);
        this.height = Math.abs(height * d);

    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getArea(){
        return (double)this.height*this.width;

    }

    public double getPerimeter(){
        return (this.height + this.width) *2;
    }




}




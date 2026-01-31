abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Hello");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing");
    }
}
class code7{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        c1.message();
    }
}

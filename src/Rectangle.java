public class Rectangle extends Shape {
    private int first;
    private int second;

    public Rectangle(int first,int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double getPerimeter() {
        return (2*(first+second));
    }
}

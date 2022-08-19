public class Trapezoid extends Shape{
    private int first;
    private int second;
    private int third;

    public Trapezoid(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public double getPerimeter() {
        return (first+second+(2*third));
    }
}

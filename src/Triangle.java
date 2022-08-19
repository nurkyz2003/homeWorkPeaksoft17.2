public class Triangle extends Shape{
    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public double getPerimeter() {
        return (first+second+third);
    }
}

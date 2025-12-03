package pckg_strategy_2;

public class Point {

    private String name;
    private double x, y;
    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other){
        return Math.sqrt(Math.pow(this.x-other.x, 2)+Math.pow(this.y-other.y, 2));
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                '}';
    }
}

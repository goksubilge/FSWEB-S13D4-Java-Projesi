import com.bilge.model.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println(" --- Point Class --- ");

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        System.out.println("distance(second)= " + first.distance(second));

        Point point = new Point(2,3);

        System.out.println("distance()= " + point.distance());
    }
}
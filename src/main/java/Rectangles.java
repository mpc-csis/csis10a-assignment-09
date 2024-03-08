import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;

/**
 * Created by brian on 3/22/14.
 */
public class Rectangles {

    public static void main(String[] args) {
        System.out.println("\f");
        Rectangle box = new Rectangle(30, 20, 100, 50);
        System.out.println("box = " + box);

        // 1) Use box.setX and box.setY to move box to the location x=80, y=50

        System.out.println("1) after moving, box = " + box);

        // 2) Use box.setX() and box.setY() to move box to the location in Point p
        //    by figuring out the change in x based on p.getX and box.getX
        //    and the change in y.
        Point2D p = new Point2D(250, 210);


        System.out.println("2) after translating, box = " + box);


        // 3) Write a method that returns the lower right point of a rectangle
        //    then uncomment the two lines below and test it.
        Rectangle box2 = new Rectangle(100, 200, 20, 30);
        //     Point pLR = lowerRight(box2);   // define lowerRight below main
        //     System.out.println("3) lower right corner of box2 = " + pLR);
        System.out.println("3) should be [x=120,y=230]");

        // 4) Write a method that returns a new Rectangle that is next to the
        //    one passed to it. Then uncomment the next two lines and test it.

        //     Rectangle box3 = adjacentRectangle(box2);  // define adjacentRectangle below main
        //     System.out.println("4) rectangle adjacent to box2 = " + box3);
        System.out.println("4) should be [x=120,y=200,width=20,height=30]");
        System.out.println("4) box2 (should still be [100, 200, 20, 30]) = " + box2);


    }

    public static void printPoint(Point2D p) {
        System.out.printf("(%.2f, %.2f)\n", p.getX(), p.getY());
    }

    public static Point2D findCenter(Rectangle rect) {
        double x = rect.getX() + rect.getWidth() / 2;
        double y = rect.getY() + rect.getHeight() / 2;
        return new Point2D(x, y);
    }

    public static double distance(Point2D p1, Point2D p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }


}

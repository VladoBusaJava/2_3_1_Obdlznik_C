package academy.metis.javabasics.lesson2.activity3.exercise1.part3.RectanglePositioning.java;
import java.awt.*;

public class RectanglePositioning {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(50, 50,20,30);

        shiftRectangle(rectangle,25,0);
        System.out.println(rectangle);

        shiftRectangle(rectangle,0,25);
        System.out.println(rectangle);

        shiftRectangle(rectangle, -25,0);
        System.out.println(rectangle);

        shiftRectangle(rectangle,0,-25);
        System.out.println(rectangle);




    }

    public static void shiftRectangle(Rectangle rectangle, int x, int y) {
        rectangle.translate(x,y);


    }


}

import java.util.Scanner;

public class RectangleOOPS {
    static int length;
    static int breadth;
    public static void main(String[] args) {
         RectangleOOPS.length=10;
         RectangleOOPS.breadth=20;
        System.out.println("Area is :"+ area(length,breadth));

    }

    private static int area(int length, int breadth) {
        return length* breadth;
    }
}

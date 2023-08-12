import java.util.Scanner;

public class Rectangle {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");

        int length=sc.nextInt();
        System.out.println("Enter breadth");

        int breadth=sc.nextInt();

        System.out.println("Area is :"+ area(length,breadth));

    }

    private static int area(int length, int breadth) {
        return length*breadth;
    }
}



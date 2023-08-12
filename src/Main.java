public class Main {


    public static void main(String[] args) {
       Circle1.radius=10f;
        System.out.println(Circle1.area(Circle1.radius));

        Square.side=20;
        System.out.println(Square.area(Square.side));
    }
}


class Circle1{
    public static float radius;
    public static float area(float radius){
        return 3.14f * radius * radius;
    }

}

class Square{
    public static int side;
    public static int area(int side){
        return side*side;
    }
}
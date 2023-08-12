public class ObjectDemo {
    public static void main(String[] args) {
        Circle2 c1=new Circle2();
        c1.radius=10f;
        System.out.println(Circle2.area());

    }
}


 class Circle2{
   static  float radius;
   static float area(){
       return 3.14f * radius* radius;
   }
}


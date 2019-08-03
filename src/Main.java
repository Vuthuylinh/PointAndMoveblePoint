public class Main {
    public static void main(String[] args) {
        Point point1=new Point();
        System.out.println(point1.toString());

        Point point2= new Point(2.5,3.7);
        System.out.println(point2.toString());

        MoveblePoint moveblePoint1= new MoveblePoint();
        System.out.println(moveblePoint1.toString());
        moveblePoint1=moveblePoint1.move();
        System.out.println("MovablePoint1 with momve(): "+moveblePoint1.toString());

        MoveblePoint moveblePoint2= new MoveblePoint(3,7);
        System.out.println(moveblePoint2.toString());
        moveblePoint2=moveblePoint2.move();
        System.out.println("MovablePoint2 with move(): "+ moveblePoint2.toString());

        MoveblePoint moveblePoint3= new MoveblePoint(1,2,3,4);
        System.out.println(moveblePoint3.toString());
        moveblePoint3= moveblePoint3.move();
        System.out.println("MovablePoint3 with move(): "+ moveblePoint3.toString());

    }
}

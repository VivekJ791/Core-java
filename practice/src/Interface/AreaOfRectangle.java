package Interface;

import java.awt.geom.Area;

interface Rectangle{
    void getArea(int length,int breadth);
}
public class AreaOfRectangle implements Rectangle {
    public void getArea(int length , int breadth){
        System.out.println(length * breadth);
    }
    public static void main(String[] args) {
        AreaOfRectangle a=new AreaOfRectangle();
        a.getArea(4,6);
    }
}

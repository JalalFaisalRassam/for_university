import java.awt.*;

public class exe4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("\n expected \t Rectangle[x=0,y=0,width=25,height=40]");
        System.out.println(box);
    }
}

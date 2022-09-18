import java.util.Random;

public class exe6 {
    public static void main(String[] args) {
        int r;
        Random reandom=new Random();
        r=reandom.nextInt(6);
        System.out.println(r);
        //another way to print arundom number
        System.out.println(reandom.nextInt(6));

    }
}

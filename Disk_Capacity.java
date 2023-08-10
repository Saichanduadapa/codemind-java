import java.util.*;
public class Disk{
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int t=c.nextInt();
        int s=c.nextInt();
        int b=c.nextInt();
        System.out.println(2*t*s*b*512);
    }
}
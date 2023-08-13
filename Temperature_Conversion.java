import java.util.*;
public class Convert{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double c=s.nextInt();
        double f=(c*9/5)+32;
        System.out.printf("%.2f",f);
    }
}
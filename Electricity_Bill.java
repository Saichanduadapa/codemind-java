import java.util.*;
public class Bill{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double bill,c;
        String ia=s.nextLine();
        String b=s.nextLine();
        int u=s.nextInt();
        if (u<=199) {
            bill=u*1.20;
        }
        else if(u>=200 && u<400) {
            bill=u*1.50;
        }
        else if(u>=400 && u<600) {
            bill=u*1.80;
        }
        else {
            bill=u*2.00;
        }
        if (bill>=400) {
            c=bill+bill*0.15;
        }
        else{
             c=bill+100;
        }
        System.out.printf("%.2f",c);
    }
}
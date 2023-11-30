import java.util.*;
public class Automorphic{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=n*n;
        String r1=Integer.toString(n);
        String r2=Integer.toString(sq);
        if(r2.contains(r1)){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}
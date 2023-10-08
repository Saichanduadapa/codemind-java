import java.util.*;
public class Per{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(Math.sqrt(n)==(int)Math.sqrt(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
import java.util.*;
public class Even{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}
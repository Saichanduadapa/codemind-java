import java.util.*;
public class Can{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for (int i=0;i<n;i++){
        int a=s.nextInt();
        int b=s.nextInt();
        if((b-a)<a && a!=b){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
}
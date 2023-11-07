import java.util.*;
public class Pat{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<3 || n>100){
            System.out.println("The pattern is not possible");
        }
        else{
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
}
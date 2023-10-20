import java.util.*;
public class Wave{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int c=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i += 2){
            if(ar[0]-ar[1]<0){
            if(ar[i]>ar[i+1]){
                System.out.println("no");
                c = 1;
                break;
            }
            else{
                continue;
            }
        }
        else{
            if(ar[i]<ar[i+1]){
                System.out.println("no");
                c = 1;
                break;
            }
            else{
                continue;
            }
        }
        }
        if(c==0){
            System.out.println("yes");
        }
    }
                
}
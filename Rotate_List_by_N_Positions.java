import java.util.*;
public class Rotate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            int r=sc.nextInt();
            ar.add(r);
        }
        int k=sc.nextInt();
        while(k!=0){
            int a=ar.get(n-1);
            ar.remove(n-1);
            ar.add(0,a);
            k-=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }
    }
}
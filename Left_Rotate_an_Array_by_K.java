import java.util.*;
public class Left{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            ar.add(a);
        }
        while(k!=0){
            int r=ar.get(0);
            ar.remove(0);
            ar.add(r);
            k-=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }
    }
}
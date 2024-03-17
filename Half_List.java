import java.util.*;
public class Half{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<(n/2);i++){
            int r=sc.nextInt();
            a.add(r);
        }
        for(int i=n/2;i<n;i++){
            int r=sc.nextInt();
            b.add(r);
        }
        Collections.reverse(b);
        for(int i:a){
            b.add(i);
        }
        for(int i: b){
            System.out.print(i+" ");
        }
    }
}
import java.util.*;
public class Cnt{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int c=0;
        HashSet<Integer> ar1=new HashSet<Integer>();
        HashSet<Integer> ar2=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            ar1.add(a);
        }
        for(int i=0;i<m;i++){
            int a=s.nextInt();
            ar2.add(a);
        }
        ar1.retainAll(ar2);
        System.out.println(ar1.size());
    }
}
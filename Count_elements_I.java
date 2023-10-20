import java.util.*;
public class Cnt{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        HashSet<Integer> s1=new HashSet<Integer>();
        HashSet<Integer> s2=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            s1.add(s.nextInt());
        }
        for(int i=0;i<m;i++){
            s2.add(s.nextInt());
        }
        s1.retainAll(s2);
        System.out.println(s1.size());
    }
}
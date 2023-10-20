import java.util.*;
public class Sum{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0;
    HashSet<Integer> set=new HashSet<Integer>();
    for(int i=0;i<n;i++){
        set.add(s.nextInt());
    }
    for(int i: set){
        if(i%2==0)
        sum+=i;
    }
    System.out.println(sum);
}
}
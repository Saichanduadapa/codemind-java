import java.util.*;
public class E{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int c=0;
    int n=s.nextInt();
    int[] ar=new int[n];
    for (int i=0;i<n;i++){
        ar[i]=s.nextInt();
    }
    for(int i:ar){
        String S=Integer.toString(i);
        if(S.length()%2==0){
            c+=1;
        }
    }
    System.out.println(c);
    
    }
}
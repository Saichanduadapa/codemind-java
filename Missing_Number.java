import java.util.*;
public class Miss{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            ar.add(s.nextInt());
        }
        for(int i=1;i<=n;i++){
            boolean res=ar.contains(i);
            if(res==true){
                c+=1;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
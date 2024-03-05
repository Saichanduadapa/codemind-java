import java.util.*;
public class Miss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr.add(a);
        }
        for(int i=1;i<=n;i++){
            if(!arr.contains(i)){
                System.out.println(i);
                break;
            }
        }
        
    }
}
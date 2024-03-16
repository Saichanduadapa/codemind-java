import java.util.*;
public class Print{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(res.get(a)==null){
                res.put(a,i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>(res.keySet());
        if(ans.size()<3){
            System.out.println("It is not possible");
        }
        else{
        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-3));
        }
    }
}
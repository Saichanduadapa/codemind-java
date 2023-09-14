import java.util.*;
public class Max{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int m=0;
        int e=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    c+=1;
                }
            }
            if(m<c){
                m=c;
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    c++;
                }
            }
            if(c==m){
                //System.out.println(ar[i]);
                res.add(ar[i]);
                //System.out.println(res[k]);
                k++;
            }
        }
        Collections.sort(res);
        //System.out.println(Arrays.toString(res));
        System.out.println(res.get(0));
    }
}
import java.util.*;
public class Non{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int k=0;k<n;k++){
            int l=s.nextInt();
            String st=s.next();
            s.nextLine();
            // System.out.println(st);
            int p=0;
            for(int i=0;i<l;i++){
                int c=0;
                for(int j=0;j<l;j++){
                    if(i == j){
                        continue;
                    }
                    if (st.charAt(i)==st.charAt(j)) c+=1;
                }
                if(c==0){
                    System.out.println(st.charAt(i));
                    p+=1;
                    break;
                }
            }
            if(p==0){
                System.out.println(-1);
            }
        }
    }
}
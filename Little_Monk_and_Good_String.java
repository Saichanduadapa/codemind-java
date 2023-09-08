import java.util.*;
public class Monk{
    public static boolean is_vow(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int m=0;
        for(int i=0;i<str.length();i++){
            int c=1;
            for(int j=i+1;j<str.length();j++){
                if(is_vow(str.charAt(i))&&is_vow(str.charAt(j))){
                    c++;
                }
                else{
                break;
                }
            }
            if(m<c){
                    m=c;
                }
        }
        System.out.println(m);
    }
}
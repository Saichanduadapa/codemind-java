import java.util.*;
public class Dig{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                c++;
            }
        }
        if(c==0){
            System.out.println("Doesn't contain digit");
        }
        else{
           System.out.println("Contains "+c+" digit"); 
        }
    }
}
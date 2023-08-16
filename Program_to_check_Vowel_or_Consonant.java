import java.util.*;
public class V{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char n=s.next().charAt(0);
        if (n=='a' || n=='A' || n=='e' || n=='E' || n=='I' || n=='i' || n=='o' || n=='O' || n=='u' || n=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
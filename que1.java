package strings;
import java.util.*;
public class que1 {
    public static void serc(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        serc(name);
        }
        
}

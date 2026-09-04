package strings;

public class que3 {
    public static String slice(String str , int a , int b){
        String newly = "";
        for(int i = a;i<b;i++){
            newly += str.charAt(i);
        }
        return newly;
    }
    public static void main(String[] args) {
        String str = "Hello-world";

        System.out.println(slice(str, 2, 6));
    }
}

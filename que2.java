package strings;

public class que2 {
    public static String pali(String str){
        int n = str.length();
        String rev = "";
        for(int i = n-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }
        return rev.intern();
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        // if(pali(str)== str){
        //     System.out.print("yes it is palidrome");
        // }else{
        //     System.out.print("NO it is not palidrome");
        // }
        System.out.print(palindrome(str));
    }
}

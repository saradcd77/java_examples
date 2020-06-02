
""" Check if a string is palindrome """
public class StringReverse {

    public static boolean reverseString(String str){

        String output = "";

        for (int i = 0; i < str.length(); i++){
            output += str.charAt(i);
            System.out.println(output);
        }
        return output.equals(str);
    }
    
    public static void main(String [] args){
        System.out.println(reverseString("anna"));
        System.out.println(reverseString("civic"));
        System.out.println(reverseString("Sarad"));

    }
}
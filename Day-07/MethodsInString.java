public class MethodsInString {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String:");
        // String str = sc.nextLine();

        // System.out.println("Enter B String:");
        // String str1 = sc.nextLine();

        // Length
        // System.out.println(str.length());
        // System.out.println(str1.length());

        // Char At
        // System.out.println(str.charAt(1));

        // Substring
        // System.out.println(str.substring(2, 5));

        // Contains
        // System.out.println(str1.contains("tushar"));


        /* String str = "Tushar";

        // System.out.println(str.toCharArray());

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } */


        // Split
        String str2 = "My,Name,Is,Tushar";
        String[] arr = str2.split(",");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}

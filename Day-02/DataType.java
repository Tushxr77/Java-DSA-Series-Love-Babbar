public class DataType {
    public static void main(String[] args) {

        // Integer Data Types

        byte a = 126; // Range: -128 to 127
        System.out.println(a);

        short b = 300; // Range: -32,768 to 32,767
        System.out.println(b);

        int c = 50000; // Range: -2^31 to (2^31 - 1)
        System.out.println(c);

        long d = 60000000L; // Range: -2^63 to (2^63 - 1)
        System.out.println(d);

        // Decimal Data Types

        float f = 56.7188f;
        System.out.println(f);

        double e = 57.84845153468468;
        System.out.println(e);

        // Boolean

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        // Character

        char ch = 'a';
        System.out.println(ch);

        // Character arithmetic
        System.out.println(ch + 2);
        System.out.println((char) (ch + 2));
    }
}
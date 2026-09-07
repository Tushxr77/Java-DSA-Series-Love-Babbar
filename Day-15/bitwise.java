public class bitwise {
    public static void main (String[] args) {
        int a = 5;
        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~b);

        //Leftshift
//        for(int i =1;i<=32;i++){
//            b =b<<1;
//            System.out.println(b);

        //right Shift
//            for(int i =1;i<=32;i++){
//                a=a>>1;
//                System.out.println(a);
//            }
        //set  bits
//        int n = 5;
//        int count = 0;
//        while (n != 0) {
//            if ((n & 1)!=0){
//                count ++;
//            }n=n>>1;
//        }System.out.println(count);


        //Second method for set bits
        int n=16;
        if((n&(n-1))==0){
            System.out.println("Power of two");
        }
    }
    }


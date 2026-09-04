package OOPS;

public class ComplexNumberClass {
    public static class ComplexNumber{

        int x;
        int y;
        ComplexNumber(int x, int y) {
            this.x = x;
            this.y = y;
        }
        void print(){
            if(y<0){
                System.out.println(x+"- i"+ +(- y));
            }else{
                System.out.println(x+"  + i"+ + y);
            }
        }

        public void add(ComplexNumber c2) {
            x+=c2.x;
            y+=c2.y;
        }
        public void multiply(ComplexNumber c2){
            int real = x*c2.x - y*c2.y;
            int imaginary = x*c2.y + y*c2.x;

            x = real;
            y = imaginary;
        }
    }

    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(5,9);


        ComplexNumber c2 = new ComplexNumber(5,-9);


        ComplexNumber c3 = new ComplexNumber(10,5);


        //Print ALl of them
        System.out.println("The Complex Number In The Form OF x+iy");
        c1.print();
        c2.print();
        c3.print();

        //Addition
        c1.add(c2);
        c1.print();

        //Multiplacton
        c1.multiply(c2);
        c1.print();

    }
}

import java.util.*;

public class CalComplex {
    
        int real, img;
    
        public CalComplex(int r, int i) {
            this.real = r;
            this.img = i;
        }
    
        void show() {
            System.out.print("Your Complex Number is :-  ");
            System.out.println(this.real + " +  i" + this.img);
        }
    
        public static CalComplex AddComplexNumber(CalComplex num1, CalComplex num2) {
            CalComplex result = new CalComplex(0, 0);
    
            result.real = num1.real + num2.real;
            result.img = num1.img + num2.img;
    
            return result;
        }
    
        public static CalComplex subtractComplexNumber(CalComplex num1, CalComplex num2) {
            CalComplex result = new CalComplex(0, 0);
    
            result.real = num1.real - num2.real;
            result.img = num1.img - num2.img;
    
            return result;
        }
    
        public static CalComplex multiplyComplexNumber(CalComplex num1, CalComplex num2) {
            CalComplex result = new CalComplex(0, 0);
    
            result.real = num1.real * num2.real;
            result.img = num1.img * num2.img;
    
            return result;
        }
    
        public static void main(String[] args) {
    
            System.out.println("Let's add two complex Number");
    
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter 1st Complex Number :- ");
            System.out.print("Real part : ");
            int real1 = scn.nextInt();
            System.out.print("imaginary part : ");
            int img1 = scn.nextInt();
            System.out.println("Your 1st complex Number : " + real1 + " + i" + img1);
    
            CalComplex complex1 = new CalComplex(real1, img1);
            complex1.show();
            System.out.println();
    
            System.out.println("Enter 2nd Complex Number :- ");
            System.out.print("Real part : ");
            int real2 = scn.nextInt();
            System.out.print("imaginary part : ");
            int img2 = scn.nextInt();
            System.out.println("Your 2nd complex Number : " + real2 + " + i" + img2);
    
            CalComplex complex2 = new CalComplex(real2, img2);
            complex2.show();
            System.out.println();
    
            CalComplex complex3 = AddComplexNumber(complex1, complex2);
            System.out.println("Addition : - ");
            complex3.show();
            System.out.println();
    
            complex3 = subtractComplexNumber(complex1, complex2);
            System.out.print("Subtraction :-  ");
            System.out.println();
            complex3.show();
    
            complex3 = multiplyComplexNumber(complex1, complex2);
            System.out.print("Multiply :-  ");
            System.out.println();
            complex3.show();
    
            scn.close();
    
        }
    
    }
}

public class HelloWorld{

     public static void main(String []args){
         int num1 = 5;
         int num2 = 2;
         int num3 = 7;
         double num4 = 2.2;
         double num5 = 7.8;
         add(num4,num5);
         add(num1,num2);
         add(num1,num2,num3);
     }
     public static void add(int a, int b){
         int math = a+b;
         System.out.println("Uses Method 1: "+math);
     }
     public static void add(double a, double b){
         double math = a+b;
         System.out.println("Uses Method 2: "+math);
     }
     public static void add(int a, int b, int c){
         int math = a+b+c;
         System.out.println("Uses Method 3: "+math);
     }
     
     
}

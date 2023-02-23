import java.util.Scanner;
public class ex101v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza o n1: ");
        double n1=scanner.nextDouble();
        System.out.println("Introduza o n2: ");
        double n2=scanner.nextDouble();
        System.out.println("Introduza a operaçao: ");
        String opt=scanner.next();
        scanner.close();
        double result=0;
            switch (opt) {
                case "*":
                    result=n1*n2;
                    System.out.println(n1+ " " + opt + " " + n2 + " = " + result);
                    break;
                case "+":
                    result=n1+n2;
                    System.out.println(n1+ " " + opt + " " + n2 + " = " + result);
                    break;
                case "/":
                    result=n1/n2;
                    System.out.println(n1+ " " + opt + " " + n2 + " = " + result);
                    break;
                case "-":
                    result=n1-n2;
                    System.out.println(n1+ " " + opt + " " + n2 + " = " + result);
                    break;
                default:
                    System.err.println("Operador invalido: " + opt);
                    break;
            
        }
    }
    
}

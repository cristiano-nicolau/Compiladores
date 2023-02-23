

public class ex101 {    
    public static void main(String args[]) {
        double n1=Double.parseDouble(args[0]);
        double n2=Double.parseDouble(args[2]);
        String opt=args[1];
        double result=0;
        if (args.length  != 3){
            System.err.println("Number of arguments invalid");
            
        }else{
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
}
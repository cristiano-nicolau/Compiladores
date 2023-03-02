import java.util.Scanner;
import java.util.Stack;

public class ex103 {
    public static void main(String[] args) {
        Stack <Double>stack = new Stack <Double>();
		Scanner sc = new Scanner(System.in);
		double result=0;
		double n1,n2=0;
		String operator=null;
		while(sc.hasNextDouble()){
			stack.add(sc.nextDouble());
			System.out.println(stack.toString());
		}
        
		while(stack.size()>1 && sc.hasNext() ){
			n1=stack.pop();
			n2=stack.pop();
		    operator=sc.next();
		    switch(operator) {
			    case "+":
				    result=n1+n2;
				    break;
			    case "-":
				    result=n1-n2;
				    break;
		    	case "*":	
			    	result=n1*n2 ;
				    break;
	    		case "/":
		    		if(n2==0){
			    		System.err.println("Error!Cannot divide by zero!");
				    	System.exit(0);
				    result=n1/n2;
			        }	
				    break;
			    default:
				    System.err.println("Operator invalid!");
				    System.exit(0);
		}
		stack.add(result);
		System.out.println(stack.toString());
    }    
}
}
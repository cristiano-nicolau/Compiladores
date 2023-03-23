@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PrefixCalculatorBaseVisitor<Double> {

   @Override public Double visitStat(PrefixCalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         Double res = visit(ctx.expr());
         if (res != null){
            System.out.println("Resultado é "+res);
         }
      }
      return null;
   }

   @Override public Double visitExprPrefix(PrefixCalculatorParser.ExprPrefixContext ctx) {
      Double res = null;
      Double n1=visit(ctx.expr(0));
      Double n2=visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch (op) {
         case "+":
            res = n1 + n2;
            break;
         case "-":
            res = n1 - n2;
            break;
         case "*":
            res = n1 * n2;
            break;
         case "/":
            if (n2 == 0) {
               System.out.println("Divisão por zero!");
            } else {
               res = n1 / n2;
            }
            break;
      }
      return res;
   }

   @Override public Double visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      return Double.valueOf(ctx.Number().getText());
      //return res;
   }
}

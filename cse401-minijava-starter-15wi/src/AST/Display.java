package AST;
import AST.Visitor.Visitor;

public class Display extends Statement {
  public Exp e;

  public Display(Exp re, int ln) {
    super(ln);
    e=re; 
  }
  
  public void accept(Visitor v) {
    v.visit(this);
  }
}


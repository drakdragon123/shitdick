package src.ast.expr;

import src.ast.*;
import src.ast.stmt.*;
import src.utils.*;

public class MemberExprNode extends ExprNode implements BuiltinElements {
  public ExprNode obj;
  public String member;

  public MemberExprNode(Position pos, ExprNode obj, String member) {
    super(pos);
    this.obj = obj;
    this.member = member;
  }

  @Override
  public boolean isLeftValue() {
    return true;
  }

  @Override
  public void accept(ASTVisitor visitor) {
    visitor.visit(this);
  }
}
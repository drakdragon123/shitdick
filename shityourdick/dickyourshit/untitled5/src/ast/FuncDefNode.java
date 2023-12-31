package src.ast;

import src.ast.stmt.*;
import src.utils.*;
import java.util.ArrayList;

public class FuncDefNode extends Node {
    public TypeNode returnType;
    public String name;
    public ParameterListNode params;
    public ArrayList<StmtNode> stmts = new ArrayList<StmtNode>();

    public FuncDefNode(Position pos, String name) {
        super(pos);
        this.name = name;
    }
    public FuncDefNode(Position pos, Type type, String name, Type paramType, int cnt) {
        super(pos);
        this.returnType = new TypeNode(pos, type.typeName, type.dim);
        this.name = name;
        if (paramType != null && cnt > 0)
            this.params = new ParameterListNode(pos, paramType, cnt);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

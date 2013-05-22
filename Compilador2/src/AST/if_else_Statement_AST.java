/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public class if_else_Statement_AST extends Statement_AST {
    public Expresion_AST h1;
    public Statement_AST h2;
    public StatementA_AST h3;
    
    public if_else_Statement_AST(Expresion_AST e, Statement_AST s, StatementA_AST ea) {
        super();
        h1 = e;
        h2 = s;
        h3 = ea;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_if_else_Statement_AST(this, arg);
    }
    
}

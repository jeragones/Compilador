/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;



/**
 *
 * @author jdbr
 */
public class ELSE_Statement_AST extends StatementA_AST {
    public Statement_AST h1;
    public ELSE_Statement_AST(Statement_AST s) {
        super();
        this.h1 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_ELSE_Statement_AST(this, arg);
   }
}

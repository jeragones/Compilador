/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Statement_AST;
import AST.Statements_AST;

/**
 *
 * @author jdbr
 */
public class varias_Statements_AST extends Statements_AST {
    public Statement_AST h1;
    public Statements_AST h2;

    public varias_Statements_AST(Statement_AST s, Statements_AST ss) {
        super();
        this.h1 = s;
        this.h2 = ss;
    }
     public Object visit(Visitor v,Object arg) {
       return v.visitvarias_Statements_AST(this, arg);
   }
}

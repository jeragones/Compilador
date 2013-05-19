/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Expresion_AST;
import AST.Statement_AST;

/**
 *
 * @author GeOrge
 */
public class while_Statement_AST extends Statement_AST {
    public Expresion_AST h1;
    public Statement_AST h2;
    
    public while_Statement_AST(Expresion_AST e, Statement_AST s) {
        super();
        h1=e;
        h2=s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_while_Statement_AST(this, arg);
    }
    
}

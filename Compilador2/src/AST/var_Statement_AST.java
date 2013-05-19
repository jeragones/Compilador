/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Statement_AST;
import AST.Statements_AST;

/**
 *
 * @author GeOrge
 */
public class var_Statement_AST extends Statement_AST {
    public Statements_AST h1;
    
    public var_Statement_AST(Statements_AST s) {
        super();
        h1=s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_var_Statement_AST(this, arg);
    }
}

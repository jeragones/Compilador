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
public class println_Statement_AST extends Statement_AST {
    public Expresion_AST h1;
    
    public println_Statement_AST(Expresion_AST e) {
        super();
        h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_println_Statement_AST(this, arg);
    }
}

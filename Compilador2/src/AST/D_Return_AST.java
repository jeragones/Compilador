/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Expresion_AST;
import AST.Return_AST;

/**
 *
 * @author GeOrge
 */
public class D_Return_AST extends Return_AST {
    public Expresion_AST h1;
    
    public D_Return_AST(Expresion_AST e) {
        super();
        h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_D_Return_AST(this, arg);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Expresion_AST;
import AST.ExpressionA_AST;

/**
 *
 * @author GeOrge
 */
public class Exp_AST extends ExpressionA_AST {
    public Expresion_AST h1;
    
    public Exp_AST(Expresion_AST e) {
        super();
        h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Exp_AST(this, arg);
    }
}

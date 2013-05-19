/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionSimpl_AST;

/**
 *
 * @author GeOrge
 */
public class Exp_Simple_FALSE_AST extends ExpresionSimpl_AST {
    public Exp_Simple_FALSE_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Exp_Simple_FALSE_AST(this, arg);
    }
}

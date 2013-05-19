/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.IdAux_AST;

/**
 *
 * @author GeOrge
 */
public class c_Void_AST extends IdAux_AST {
    public c_Void_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_c_Void_AST(this, arg);
    }
}

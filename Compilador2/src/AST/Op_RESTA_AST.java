/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Op_AST;

/**
 *
 * @author GeOrge
 */
public class Op_RESTA_AST extends Op_AST {
    public Op_RESTA_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Op_RESTA_AST(this, arg);
    }
}

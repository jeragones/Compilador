/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.IdAux_AST;

/**
 *
 * @author jdbr
 */
public class THIS_THIS_AST extends IdAux_AST {
     
    public THIS_THIS_AST() {
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_This_This_AST(this, arg);
   }
    
}

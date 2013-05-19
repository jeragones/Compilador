/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionB_AST;
import AST.Expresion_AST;

/**
 *
 * @author jdbr
 */
public class u_Expression_AST extends ExpresionB_AST {
    public Expresion_AST h1;
    public u_Expression_AST(Expresion_AST e) {
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_u_Expression_AST(this, arg);
   }
    
}

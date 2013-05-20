/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionSimpl_AST;
import AST.Expresion_AST;
import AST.Visitor;

/**
 *
 * @author jdbr
 */
public class Expre_NEWINT_AST extends ExpresionSimpl_AST {
    public Expresion_AST h1;
    public Expre_NEWINT_AST(Expresion_AST e) {
        super();       
        this.h1 = e;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expre_NEWINT_AST(this, arg);
   }
    
}

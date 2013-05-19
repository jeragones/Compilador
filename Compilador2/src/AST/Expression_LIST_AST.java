/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionList_AST;
import AST.ExpresionLists_AST;
import AST.Expresion_AST;

/**
 *
 * @author jdbr
 */
public class Expression_LIST_AST extends ExpresionList_AST {
    public Expresion_AST h1;
   public ExpresionLists_AST h2;
    public Expression_LIST_AST(Expresion_AST e, ExpresionLists_AST el) {
        super();
       this.h1 = e;
       this.h2 = el;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expression_LIST_AST(this, arg);
   }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionLists_AST;
import AST.Expresion_AST;

/**
 *
 * @author jdbr
 */
public class varias_Expression_LIST_AST extends ExpresionLists_AST {
    public Expresion_AST h1;
    public ExpresionLists_AST h2;

    public varias_Expression_LIST_AST(Expresion_AST e, ExpresionLists_AST el) {
        super();
        this.h1 = e;
        this.h2 = el;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitvarias_Expresion_Lists_AST(this, arg);
   }
    
}

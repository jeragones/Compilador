/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author jdbr
 */
public class Expre_NEWID_AST extends ExpresionSimpl_AST {
    public Symbol id;
    public ExpresionList_AST h1;
    public Expre_NEWID_AST(Symbol id, ExpresionList_AST e) {
        super();
        this.id = id;
        h1=e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expre_NEWID_AST(this, arg);
    }
}

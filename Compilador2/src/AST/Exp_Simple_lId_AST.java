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
public class Exp_Simple_lId_AST extends ExpresionSimpl_AST {
    public Symbol id;
    public Exp_Simple_lId_AST(Symbol id) {
        super();
        this.id = id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Exp_Simple_lId_AST(this, arg);
   }
    
}

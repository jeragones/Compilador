/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionSimpl_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author jdbr
 */
public class Exp_Simple_STRING_AST extends ExpresionSimpl_AST {
    public Symbol str;
    public Exp_Simple_STRING_AST(Symbol ss) {
         super();
        this.str = ss;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_Simple_STRING_AST(this, arg);
   }
}
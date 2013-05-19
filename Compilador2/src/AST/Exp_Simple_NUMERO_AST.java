/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionSimpl_AST;
import AST.Visitor;
import java_cup.runtime.Symbol;

/**
 *
 * @author jdbr
 */
public class Exp_Simple_NUMERO_AST extends ExpresionSimpl_AST {
 public Symbol num;
    public Exp_Simple_NUMERO_AST(Symbol n){
        super();
        this.num = n;
    }
     public Object visit(Visitor v,Object arg) {
       return v.visitExp_Simple_NUMERO_AST(this, arg);
   }
}

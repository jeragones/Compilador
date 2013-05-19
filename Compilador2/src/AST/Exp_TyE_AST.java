/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionInt_AST;
import AST.TipysAST;

/**
 *
 * @author jdbr
 */
public class Exp_TyE_AST extends ExpresionInt_AST {
     public TipysAST h1;
    public ExpresionInt_AST h2;
    public Exp_TyE_AST(TipysAST t, ExpresionInt_AST ei) {
        super();
        this.h1 = t;
        this.h2 = ei;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Exq_TyE_AST(this, arg);
   }
}

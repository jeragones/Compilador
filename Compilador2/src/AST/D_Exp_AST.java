/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;



/**
 *
 * @author jdbr
 */
public class D_Exp_AST extends Expresion_AST {
    public ExpresionSimpl_AST h1;
    public ExpresionInt_AST h2;
    public D_Exp_AST(ExpresionSimpl_AST es, ExpresionInt_AST ei) {
        super();
        this.h1 = es;
        this.h2 = ei;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_D_Exp_AST(this, arg);
   }
    
}

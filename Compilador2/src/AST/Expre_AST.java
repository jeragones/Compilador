/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;



/**
 *
 * @author jdbr
 */
public class Expre_AST extends ExpresionSimpl_AST {
    public Expresion_AST h1;
    public Expre_AST(Expresion_AST e) {
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expre_AST(this, arg);
   }
    
}

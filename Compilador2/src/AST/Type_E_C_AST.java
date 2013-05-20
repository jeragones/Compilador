/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;



/**
 *
 * @author jdbr
 */
public class Type_E_C_AST extends TipysAST {
    public Expresion_AST h1;
    public Type_E_C_AST(Expresion_AST e) {
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_E_C_AST(this, arg);
   }
    
}

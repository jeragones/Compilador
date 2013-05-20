/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;



/**
 *
 * @author jdbr
 */
public class Expression_Read_AST extends ExpressionA_AST {
    public Type_AST t;
    public Expression_Read_AST(Type_AST t) {
        super();
        this.t = t;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expression_Read_AST(this, arg);
   } 
    
}

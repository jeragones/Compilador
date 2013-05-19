/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Type_AST;

/**
 *
 * @author GeOrge
 */
public class Type_Boolean_AST extends Type_AST {
    public Type_Boolean_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_Boolean_AST(this, arg);
    }
}

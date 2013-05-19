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
public class Type_TInt_AST extends Type_AST {
    public Type_TInt_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_TInt_AST(this, arg);
    }
}

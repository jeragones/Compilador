/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.TipysAST;

/**
 *
 * @author GeOrge
 */
public class Type_LENGTH_AST extends TipysAST {
    public Type_LENGTH_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_LENGTH_AST(this, arg);
    }
}

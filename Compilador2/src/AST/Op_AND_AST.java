/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public class Op_AND_AST extends Op_AST {
    public Op_AND_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Op_AND_AST(this, arg);
    }
}
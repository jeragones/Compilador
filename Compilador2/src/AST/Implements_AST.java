/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ClassDeclarationC_AST;

/**
 *
 * @author GeOrge
 */
public class Implements_AST extends ClassDeclarationC_AST {
    public Implements_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_Implements_AST(this, arg);
    }
}

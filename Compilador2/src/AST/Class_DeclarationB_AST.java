/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;


import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Class_DeclarationB_AST extends ClassDeclarationB_AST {
    public Symbol h1;
    public ClassDeclarationC_AST h2;
    
    public Class_DeclarationB_AST(Symbol id, ClassDeclarationC_AST cdc) {
        super();
        h1 = id;
        h2 = cdc;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_DeclarationB_AST(this, arg);
    }
}

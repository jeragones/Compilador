/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ClassDeclarationA_AST;
import AST.ClassDeclarationB_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Class_DeclarationA_AST extends ClassDeclarationA_AST {
    public Symbol id;
    public ClassDeclarationB_AST h1;
    
    public Class_DeclarationA_AST(Symbol id, ClassDeclarationB_AST cdb) {
        super();
        this.id=id;
        h1=cdb;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Class_DeclarationA_AST(this, arg);
    }
    
}

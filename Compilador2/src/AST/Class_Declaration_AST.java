/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclarationA_AST;
import AST.ClassDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class Class_Declaration_AST extends BodyDeclarationA_AST {
    public ClassDeclaration_AST h1;
    public Class_Declaration_AST(ClassDeclaration_AST cd) {
        super();
        h1 = cd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Class_Declaration_AST(this, arg);
    }
}

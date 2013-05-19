/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ClassDeclaration_AST;
import AST.ClassDeclarationsAST;

/**
 *
 * @author GeOrge
 */
public class varias_Class_Declarations_AST extends ClassDeclarationsAST {
    public ClassDeclaration_AST h1;
    public ClassDeclarationsAST h2;
    public varias_Class_Declarations_AST(ClassDeclaration_AST cd, ClassDeclarationsAST cds) {
        super();
        h1 = cd;
        h2 = cds;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varias_CLass_Declarations_AST(this, arg);
    }
}

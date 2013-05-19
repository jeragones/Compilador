/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclarationA_AST;
import AST.MethodDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class Method_Declaration_AST extends BodyDeclarationA_AST {
    public MethodDeclaration_AST h1;
    public Method_Declaration_AST(MethodDeclaration_AST md) {
        super();
        h1 = md;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Method_Declaration_AST(this, arg);
    }
}

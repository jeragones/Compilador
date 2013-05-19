/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclaration_AST;
import AST.ClassDeclarationA_AST;
import AST.ClassDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class Body_AST extends ClassDeclaration_AST {
    public ClassDeclarationA_AST h1;
    public BodyDeclaration_AST h2;
    
    public Body_AST(ClassDeclarationA_AST cda, BodyDeclaration_AST bd) {
        super();
        h1 = cda;
        h2 = bd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Body_AST(this, arg);
    }
    
}

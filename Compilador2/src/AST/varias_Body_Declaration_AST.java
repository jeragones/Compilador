/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclarationA_AST;
import AST.BodyDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class varias_Body_Declaration_AST extends BodyDeclaration_AST {
    public BodyDeclarationA_AST h1;
    public BodyDeclaration_AST h2;
    
    public varias_Body_Declaration_AST(BodyDeclarationA_AST bda, BodyDeclaration_AST bd) {
        super();
        h1 = bda;
        h2 = bd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varias_Body_Declaration_AST(this, arg);
    }
}

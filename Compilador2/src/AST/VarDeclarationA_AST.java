/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclarationA_AST;
import AST.VarDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class VarDeclarationA_AST extends BodyDeclarationA_AST {
    public VarDeclaration_AST h1;
    
    public VarDeclarationA_AST(VarDeclaration_AST vd) {
        super();
        h1 = vd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_VarDeclarationA_AST(this, arg);
    }
}

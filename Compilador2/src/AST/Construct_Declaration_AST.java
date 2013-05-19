/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.BodyDeclarationA_AST;
import AST.ConstrDeclaration_AST;

/**
 *
 * @author GeOrge
 */
public class Construct_Declaration_AST extends BodyDeclarationA_AST {
    public ConstrDeclaration_AST h1;
    public Construct_Declaration_AST(ConstrDeclaration_AST cd) {
        super();
        h1=cd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Construct_Declaration_AST(this, arg);
    }
}

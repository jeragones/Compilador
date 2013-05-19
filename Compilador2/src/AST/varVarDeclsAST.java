/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.VarDeclaration_AST;
import AST.VarDeclarations_AST;

/**
 *
 * @author GeOrge
 */
public class varVarDeclsAST extends VarDeclarations_AST {
    public VarDeclaration_AST h1;
    public VarDeclarations_AST h2;
    
    public varVarDeclsAST(VarDeclaration_AST vd, VarDeclarations_AST vds) {
        super();
        h1 = vd;
        h2 = vds;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varVarDecls_AST(this, arg);
    }
}

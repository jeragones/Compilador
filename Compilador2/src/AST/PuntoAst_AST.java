/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ImportDeclarationA_AST;

/**
 *
 * @author GeOrge
 */
public class PuntoAst_AST extends ImportDeclarationA_AST {
    public PuntoAst_AST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visit_PuntoAst_AST(this, arg);
    }
}

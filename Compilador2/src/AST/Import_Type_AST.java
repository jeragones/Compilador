/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ImportDeclarationA_AST;
import AST.ImportDeclaration_AST;
import AST.TypeName_AST;

/**
 *
 * @author GeOrge
 */
public class Import_Type_AST extends ImportDeclaration_AST {
    public TypeName_AST h1;
    public ImportDeclarationA_AST h2;
    
    public Import_Type_AST(TypeName_AST tn, ImportDeclarationA_AST id) {
        super();
        h1 = tn;
        h2 = id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Import_Type_AST(this, arg);
    }
}

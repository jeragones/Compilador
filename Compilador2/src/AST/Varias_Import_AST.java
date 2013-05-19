/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ImportDeclaration_AST;
import AST.ImportDeclarations_AST;

/**
 *
 * @author GeOrge
 */
public class Varias_Import_AST extends ImportDeclarations_AST {
    public ImportDeclarations_AST h1;
    public ImportDeclaration_AST h2;
    
    public Varias_Import_AST(ImportDeclarations_AST ids, ImportDeclaration_AST id) {
        super();
        h1 = ids;
        h2 = id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Varias_Import_AST(this, arg);
    }
}

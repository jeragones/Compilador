/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.AST;
import AST.ClassDeclarationsAST;
import AST.ImportDeclarations_AST;
import AST.MainClass_AST;

/**
 *
 * @author GeOrge
 */
public class ImpD_ClassD_MainC_AST extends AST {
    public ImportDeclarations_AST h1;
    public ClassDeclarationsAST h2;
    public MainClass_AST h3;
    
    public ImpD_ClassD_MainC_AST(ImportDeclarations_AST id, ClassDeclarationsAST cd, MainClass_AST mc) {
        super();
        h1 = id;
        h2 = cd;
        h3 = mc;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_ImpD_ClassD_MainC_AST(this, arg);
    }
}

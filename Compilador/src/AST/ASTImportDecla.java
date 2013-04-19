/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public class ASTImportDecla extends ASTImportDeclaration {
    public ASTImportDeclaration h1;
    
    public ASTImportDecla(ASTImportDecls a, ASTImportDecla m, ASTImportDeclaration h1) {
        super(a, m);
        this.h1 = h1;
    }
}

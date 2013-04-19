/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public class ASTImportDeclaration extends ASTCuerpoPrograma {    
    public ASTImportDecls h1;
    public ASTImportDecla h2;
    
    public ASTImportDeclaration(ASTImportDecls h1, ASTImportDecla h2) {
        this.h1 = h1;
        this.h2 = h2;
    }
}

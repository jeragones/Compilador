/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import Scanner.Symbol;

/**
 *
 * @author GeOrge
 */
public class ASTImportDecls extends ASTImportDeclaration {
    public String Import;
    public String PunComa;
    public ASTTypeName h1;
    public ASTImportDeclsa h2;
    
    public ASTImportDecls(String Imp, String PC, ASTTypeName h1, ASTImportDeclsa h2) {
        Import = Imp;
        PunComa = PC;
        this.h1 = h1;
        this.h2 = h2;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTClassDecla extends ASTProgramClass {
    public ASTClassDecl h1;
    
    public ASTClassDecla(ASTClassDecls c, ASTClassDecla ca, ASTClassDecl cd){
        super(c, ca);
        h1=cd;
    }
    
}

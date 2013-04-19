/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTClassDecla extends ASTProgramClass{
    public ASTClassDecl h1;
    
    public ASTClassDecla(ASTClassDecl cd){
        super();
        h1=cd;
    }
    
}

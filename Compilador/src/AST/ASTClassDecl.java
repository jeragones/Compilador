/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTClassDecl extends ASTClassDecla{
    public ASTClassDecls h1;
    public ASTClassDecla h2;
    
    public ASTClassDecl(ASTClassDecls c, ASTClassDecla ca){
        h1=c;
        h2=ca;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTClassDecl extends ASTProgram {
    public ASTClassDecls h1;
    public ASTClassDecla h2;
    
    public ASTClassDecl(ASTClassDecls c, ASTClassDecla ca, ASTClassDecl cd){
        //super(c, ca, cd);
        h1=c;
        h2=ca;
    }
    
    
}

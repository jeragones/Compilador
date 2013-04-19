/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTProgramClass extends ASTCuerpoPrograma {
    public ASTClassDecls h1;
    public ASTClassDecla h2;
    
    public ASTProgramClass(ASTClassDecls c, ASTClassDecla ca){
        super();
        h1=c;
        h2=ca;
    }
    
}

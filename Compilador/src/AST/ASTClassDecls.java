/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTClassDecls extends ASTProgramClass{
    public String Class;
    public ASTID h1;
    public ASTClassDeclsc h2;
    public String Llave_on;
    public ASTBodyDecl h3;
    public String Llave_off;
    public ASTClassDecls(String cl,ASTID id,ASTClassDeclsc cd,String ll_on,ASTBodyDecl bd,String ll_off){
        super();
        Class=cl;
        h1=id;
        h2=cd;
        Llave_on=ll_on;
        h3=bd;
        Llave_off=ll_off;
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTConstrDecl extends ASTBodyDecl{
    public String Public;
    public String ID;
    public String Parent_on;
    public ASTFormalList_Constr fl;
    public String Parent_off;
    public String Llave_on;
    public ASTVarDecl vd;
    public ASTStatement state;
    public String Llave_off;
    public ASTConstrDecls cds;
    
}

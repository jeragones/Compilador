/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTExpListsa extends ASTExpLists{
    public ASTExpLists  Ex;
    public ASTExpListsa(ASTExpLists e){
        Ex=e;
    }
}

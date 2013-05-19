/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ClassDeclarationB_AST extends AST{
    public ClassDeclarationB_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

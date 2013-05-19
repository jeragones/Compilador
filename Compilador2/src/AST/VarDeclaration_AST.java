/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class VarDeclaration_AST extends AST{
    public VarDeclaration_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

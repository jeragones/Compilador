/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public abstract class ExpresionLists_AST extends AST {
    public ExpresionLists_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

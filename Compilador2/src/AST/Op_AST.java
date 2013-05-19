/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public abstract class Op_AST extends AST {
    public Op_AST (){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

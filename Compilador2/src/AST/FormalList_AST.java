/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class FormalList_AST extends AST {
    //epsilon
    public FormalList_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
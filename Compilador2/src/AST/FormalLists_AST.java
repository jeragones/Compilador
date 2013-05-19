/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class FormalLists_AST extends AST{
    //epsilon
    public FormalLists_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

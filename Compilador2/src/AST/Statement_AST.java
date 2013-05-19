/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class Statement_AST extends AST{
    public Statement_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
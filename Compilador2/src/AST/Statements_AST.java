/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class Statements_AST extends AST {
    public Statements_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

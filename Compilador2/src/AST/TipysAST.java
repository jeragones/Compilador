/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public abstract class TipysAST extends AST {
    public TipysAST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public abstract class StatementA_AST extends AST {
    public StatementA_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

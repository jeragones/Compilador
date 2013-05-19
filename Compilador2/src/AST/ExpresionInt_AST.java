/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.*;

/**
 *
 * @author GeOrge
 */
public abstract class ExpresionInt_AST extends AST {
    public ExpresionInt_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

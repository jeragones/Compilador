/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Statement_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class exit_Stat_AST extends Statement_AST {
    public Symbol nn;
    public exit_Stat_AST(Symbol nn) {
        super();
        this.nn = nn;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_exit_Stat_AST(this, arg);
    }
}

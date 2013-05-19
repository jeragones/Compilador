/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionList_AST;
import AST.IdAux_AST;
import AST.Statement_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Explist_Stat_AST extends Statement_AST {
    public Symbol id;
    public IdAux_AST h1;
    public ExpresionList_AST h2;
    
    public Explist_Stat_AST(Symbol id, IdAux_AST ia, ExpresionList_AST el) {
        super();
        this.id=id;
        h1=ia;
        h2=el;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Explist_Stat_AST(this, arg);
    }
}

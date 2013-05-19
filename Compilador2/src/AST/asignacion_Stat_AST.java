/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpressionA_AST;
import AST.Statement_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class asignacion_Stat_AST extends Statement_AST {
    public Symbol id;
    public ExpressionA_AST h1;
    
    public asignacion_Stat_AST(Symbol id, ExpressionA_AST ea) {
        super();
        this.id=id;
        h1=ea;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_asignacion_Stat_AST(this, arg);
    }
}

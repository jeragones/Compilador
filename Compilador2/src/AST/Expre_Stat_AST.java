/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionB_AST;
import AST.ExpressionA_AST;
import AST.Statement_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Expre_Stat_AST extends Statement_AST {
    public Symbol id;
    public ExpresionB_AST h1;
    public ExpressionA_AST h2;
    
    public Expre_Stat_AST(Symbol id, ExpresionB_AST eb, ExpressionA_AST ea) {
        super();
        this.id=id;
        h1=eb;
        h2=ea;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Expre_Stat_AST(this, arg);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author jdbr
 */

public class THIS_ID_AST extends IdAux_AST {
    public Symbol id;
    
    public THIS_ID_AST(Symbol id) {        
        super();
        this.id = id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_This_IDAST(this, arg);
   }
    
}

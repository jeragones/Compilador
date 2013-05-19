/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.FormalLists_AST;
import AST.Type_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class varias_FormalLists_AST extends FormalLists_AST {
    public Type_AST h1;
    public Symbol id;
    public FormalLists_AST h2;
    
    public varias_FormalLists_AST(Type_AST t, Symbol id, FormalLists_AST fls) {
        super();
        h1 = t;
        this.id = id;
        h2 = fls;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varias_FormalLists_AST(this, arg);
    }
}

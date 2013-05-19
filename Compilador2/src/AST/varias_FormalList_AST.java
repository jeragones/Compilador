/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.FormalList_AST;
import AST.FormalLists_AST;
import AST.Type_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class varias_FormalList_AST extends FormalList_AST {
    public Type_AST h1;
    public Symbol id;
    public FormalLists_AST h2;
    
    public varias_FormalList_AST(Type_AST t, Symbol id, FormalLists_AST fl) {
        super();
        h1 = t;
        h2 = fl;
        this.id = id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varias_FormalList_AST(this, arg);
    }
}

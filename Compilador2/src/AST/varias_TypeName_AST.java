/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.TypeName_AST;
import AST.TypeNames_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class varias_TypeName_AST extends TypeName_AST {
    public Symbol id;
    public TypeNames_AST h1;
    
    public varias_TypeName_AST(Symbol id, TypeNames_AST tn) {
        super();
        this.id = id;
        h1 = tn;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_varias_TypeName_AST(this, arg);
    }
}

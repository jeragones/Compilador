/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.TypeNames_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Type_Names_AST extends TypeNames_AST {
    public Symbol h1;
    public TypeNames_AST h2;
    
    public Type_Names_AST(Symbol id, TypeNames_AST tns) {
        super();
        h1 = id;
        h2 = tns;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_Names_AST(this, arg);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Type_AST;
import AST.VarDeclaration_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Tid_AST extends VarDeclaration_AST {
    public Type_AST h1;
    public Symbol id;
    
    public Tid_AST(Type_AST t, Symbol id) {
        super();
        h1=t;
        this.id=id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Tid_AST(this, arg);
    }
    
}

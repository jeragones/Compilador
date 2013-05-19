/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Type_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class Type_Id_AST extends Type_AST {
    public Symbol id;
    public Type_Id_AST(Symbol id) {
        super();
        this.id=id;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_Type_Id_AST(this, arg);
    }
}

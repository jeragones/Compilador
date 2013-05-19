/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.IdAux_AST;
import AST.Type_AST;

/**
 *
 * @author GeOrge
 */
public class c_Id_AST extends IdAux_AST {
    public Type_AST h1;
    
    public c_Id_AST(Type_AST t) {
        super();
        h1 = t;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_c_Id_AST(this, arg);
    }
}

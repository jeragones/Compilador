/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Expresion_AST;
import AST.Op_AST;
import AST.TipysAST;

/**
 *
 * @author jdbr
 */
public class Type_Op_AST extends TipysAST {
    public Op_AST h1;
    public Expresion_AST h2;
    public Type_Op_AST(Op_AST o, Expresion_AST e) {
        super();
        this.h1 = o;
        this.h2 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitType_Op_AST(this, arg);
   }
    
}

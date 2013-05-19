/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.ExpresionList_AST;
import AST.TipysAST;
import java_cup.runtime.Symbol;

/**
 *
 * @author jdbr
 */
public class Type_EList_AST extends TipysAST {
    public Symbol id;
    public ExpresionList_AST h1; 
    public Type_EList_AST(Symbol id, ExpresionList_AST el) {
        super();
        this.h1 = el;
        this.id = id;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitType_EList_AST(this, arg);
   }
    
    
}

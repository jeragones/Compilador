/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.*;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class MethodDecl_AST extends MethodDeclaration_AST {
    public Symbol id;
    public IdAux_AST h1;
    public FormalList_AST h2;
    public VarDeclarations_AST h3;
    public Statements_AST h4;
    public Return_AST h5;
    
    public MethodDecl_AST(Symbol id, IdAux_AST ia, FormalList_AST fls, VarDeclarations_AST vd, Statements_AST s, Return_AST a) {
        super();
        this.id = id;
        h1 = ia;
        h2 = fls;
        h3 = vd;
        h4 = s;
        h5 = a;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_MethodDecl_AST(this, arg);
    }
}

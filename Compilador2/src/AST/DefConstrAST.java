/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;


import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class DefConstrAST extends ConstrDeclaration_AST {
    public Symbol id;
    public FormalList_AST h1;
    public VarDeclaration_AST h2;
    public Statement_AST h3;
    
    public DefConstrAST(Symbol id, FormalList_AST fl, VarDeclaration_AST vd, Statement_AST s) {
        super();
        this.id=id;
        h1=fl;
        h2=vd;
        h3=s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_DefConstr_AST(this, arg);
    }
}

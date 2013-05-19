/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.MainClass_AST;
import AST.Statement_AST;
import java_cup.runtime.Symbol;

/**
 *
 * @author GeOrge
 */
public class MainC_AST extends MainClass_AST {
    public Symbol h1;
    public Symbol h2;
    public Statement_AST h3;
    
    public MainC_AST(Symbol i1, Symbol i2, Statement_AST s) {
        super();
        h1=i1;
        h2=i2;
        h3=s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visit_MainC_AST(this, arg);
    }
    
}

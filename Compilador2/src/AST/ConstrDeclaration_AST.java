/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ConstrDeclaration_AST extends AST{
    public ConstrDeclaration_AST(){
        super();
    }
     public abstract Object visit(Visitor v,Object arg);
}

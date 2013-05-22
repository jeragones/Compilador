/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class Type_AST extends AST{
    public int tipo = -1;
    
//    public Type_AST(){
//        super();
//    }
    public abstract Object visit(Visitor v,Object arg);
}

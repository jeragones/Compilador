/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class TypeNames_AST extends AST{
    
    public TypeNames_AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}

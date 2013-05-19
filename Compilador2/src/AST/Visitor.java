/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public interface Visitor {

    public Object visit_Op_AND_AST(Op_AND_AST aThis, Object arg);
    public Object visit_Op_OR_AST(Op_OR_AST aThis, Object arg);
    public Object visit_MAYOR_AND_AST(Op_MAYOR_AST aThis, Object arg);
    public Object visit_Op_MAYOR_IGUAL_AST(Op_MAYOR_IGUAL_AST aThis, Object arg);
    public Object visit_Op_MENOR_IGUAL_AST(Op_MENOR_IGUAL_AST aThis, Object arg);
    public Object visit_Op_MENOR_AST(Op_MENOR_AST aThis, Object arg);
}

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
    public Object visit_Op_IGUAL_AST(Op_IGUAL_AST aThis, Object arg);
    public Object visit_Op_DIFERENCIA_AST(Op_DIFERENCIA_AST aThis, Object arg);
    public Object visit_Op_DIV_AST(Op_DIV_AST aThis, Object arg);
    public Object visit_Op_ASTERISCO_AST(Op_ASTERISCO_AST aThis, Object arg);
    public Object visit_Op_SUMA_AST(Op_SUMA_AST aThis, Object arg);
    public Object visit_Op_RESTA_AST(Op_RESTA_AST aThis, Object arg);
    public Object visit_Type_LENGTH_AST(Type_LENGTH_AST aThis, Object arg);
    public Object visit_Exp_Simple_THIS_AST(Exp_Simple_THIS_AST aThis, Object arg);
    public Object visit_Exp_Simple_FALSE_AST(Exp_Simple_FALSE_AST aThis, Object arg);
    public Object visit_Exp_Simple_TRUE_AST(Exp_Simple_TRUE_AST aThis, Object arg);
    public Object visit_Type_TInt_AST(Type_TInt_AST aThis, Object arg);
    public Object visit_Type_Boolean_AST(Type_Boolean_AST aThis, Object arg);
    public Object visit_Implements_AST(Implements_AST aThis, Object arg);
    public Object visit_Extends_AST(Extends_AST aThis, Object arg);
    public Object visit_Type_Int_AST(Type_Int_AST aThis, Object arg);
    public Object visit_c_Void_AST(c_Void_AST aThis, Object arg);
    public Object visit_PuntoAst_AST(PuntoAst_AST aThis, Object arg);
    public Object visitvarias_Statements_AST(varias_Statements_AST aThis, Object arg);
    public Object visit_u_Expression_AST(u_Expression_AST aThis, Object arg);
    public Object visitThis_IDAST(THIS_ID_AST aThis, Object arg);
    public Object visitThis_This_AST(THIS_THIS_AST aThis, Object arg);

    public Object visitType_Op_AST(Type_Op_AST aThis, Object arg);

    public Object visitType_EList_AST(Type_EList_AST aThis, Object arg);

    public Object visitExq_TyE_AST(Exp_TyE_AST aThis, Object arg);
}

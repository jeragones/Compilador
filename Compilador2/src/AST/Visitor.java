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
    public Object visit_Varias_Statements_AST(varias_Statements_AST aThis, Object arg);
    public Object visit_u_Expression_AST(u_Expression_AST aThis, Object arg);
    public Object visit_This_IDAST(THIS_ID_AST aThis, Object arg);
    public Object visit_This_This_AST(THIS_THIS_AST aThis, Object arg);

    public Object visit_Type_Op_AST(Type_Op_AST aThis, Object arg);

    public Object visit_Type_EList_AST(Type_EList_AST aThis, Object arg);

    public Object visit_Exq_TyE_AST(Exp_TyE_AST aThis, Object arg);

    public Object visit_Varias_Expresion_Lists_AST(varias_Expression_LIST_AST aThis, Object arg);

    public Object visit_Expression_LIST_AST(Expression_LIST_AST aThis, Object arg);

    public Object visit_Exp_Simple_STRING_AST(Exp_Simple_STRING_AST aThis, Object arg);

    public Object visit_Type_Names_AST(Type_Names_AST aThis, Object arg);

    public Object visit_Body_AST(Body_AST aThis, Object arg);

    public Object visit_varias_CLass_Declarations_AST(varias_Class_Declarations_AST aThis, Object arg);

    public Object visit_ImpD_ClassD_MainC_AST(ImpD_ClassD_MainC_AST aThis, Object arg);

    public Object visit_DeclarationB_AST(Class_DeclarationB_AST aThis, Object arg);

    public Object visitD_Exp_AST(D_Exp_AST aThis, Object arg);

    public Object visitExp_Simple_NUMERO_AST(Exp_Simple_NUMERO_AST aThis, Object arg);

    public Object visitExpre_NEGACION_AST(Expre_NEGACION_AST aThis, Object arg);

    public Object visitExpre_NEWID_AST(Expre_NEWID_AST aThis, Object arg);

    public Object visitExpre_NEWINT_AST(Expre_NEWINT_AST aThis, Object arg);
}

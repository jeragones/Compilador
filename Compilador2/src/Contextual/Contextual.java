/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contextual;

import AST.*;
import Contextual.TablaMetodos;

/**
 *
 * @author GeOrge
 */

public class Contextual implements Visitor {
   
    public TablaMetodos tabMetodo = new TablaMetodos();
    public TablaIdentificadores tabIdentificador = new TablaIdentificadores();
    public TablaClases tabClase = new TablaClases();
    
    public Object visitcondeclAST(MethodDecl_AST aThis, Object arg) { 
        tabMetodo.openScope();
        tabMetodo.enter(aThis.id.value.toString(), aThis);
        aThis.h1.visit(this, arg);
        aThis.h2.visit(this, arg);
        aThis.h3.visit(this, arg);
        aThis.h4.visit(this, arg);
        aThis.h5.visit(this, arg);
        tabMetodo.closeScope();
        return null;
    }
 
    public Object visit_Op_AND_AST(Op_AND_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }
 
    public Object visit_Op_OR_AST(Op_OR_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }
 
    public Object visit_MAYOR_AND_AST(Op_MAYOR_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_MAYOR_IGUAL_AST(Op_MAYOR_IGUAL_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_MENOR_IGUAL_AST(Op_MENOR_IGUAL_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }
    
    public Object visit_Op_MENOR_AST(Op_MENOR_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_IGUAL_AST(Op_IGUAL_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_DIFERENCIA_AST(Op_DIFERENCIA_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_DIV_AST(Op_DIV_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_ASTERISCO_AST(Op_ASTERISCO_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_SUMA_AST(Op_SUMA_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Op_RESTA_AST(Op_RESTA_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Type_LENGTH_AST(Type_LENGTH_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Exp_Simple_THIS_AST(Exp_Simple_THIS_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Exp_Simple_FALSE_AST(Exp_Simple_FALSE_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Exp_Simple_TRUE_AST(Exp_Simple_TRUE_AST aThis, Object arg) {
        aThis.visit(this, arg);
        return null;
    }

    public Object visit_Type_TInt_AST(Type_TInt_AST aThis, Object arg) {
        
            
    }
    
    /*/////////////////////////////////////////////////////////////////////////////////////////////////////*/
    public Object visit_Type_Boolean_AST(Type_Boolean_AST aThis, Object arg) {
        if(aThis.tipo==4) {
            return 4;
        } else {
            return -1;
        }
    }
    

    public Object visit_Implements_AST(Implements_AST aThis, Object arg) {
        
    }

    public Object visit_Extends_AST(Extends_AST aThis, Object arg) {
        
    }

    public Object visit_Type_Int_AST(Type_Int_AST aThis, Object arg) {
        
    }

    public Object visit_c_Void_AST(c_Void_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_PuntoAst_AST(PuntoAst_AST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Varias_Statements_AST(varias_Statements_AST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_u_Expression_AST(u_Expression_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_This_IDAST(THIS_ID_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_This_This_AST(THIS_THIS_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Type_Op_AST(Type_Op_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Type_EList_AST(Type_EList_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Exq_TyE_AST(Exp_TyE_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Varias_Expresion_Lists_AST(varias_Expression_LIST_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expression_LIST_AST(Expression_LIST_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Exp_Simple_STRING_AST(Exp_Simple_STRING_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Type_Names_AST(Type_Names_AST aThis, Object arg) {
        if(tabClase.retrieve(aThis.h1.value.toString())!=null) {
            aThis.h2.visit(this, arg);
            return null;
        } else {
            System.out.println("No existe la librería");
            return -1;
        }
    }

    public Object visit_Body_AST(Body_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_varias_CLass_Declarations_AST(varias_Class_Declarations_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_ImpD_ClassD_MainC_AST(ImpD_ClassD_MainC_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_DeclarationB_AST(Class_DeclarationB_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_D_Exp_AST(D_Exp_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Exp_Simple_NUMERO_AST(Exp_Simple_NUMERO_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expre_NEGACION_AST(Expre_NEGACION_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expre_NEWID_AST(Expre_NEWID_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expre_NEWINT_AST(Expre_NEWINT_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_ELSE_Statement_AST(ELSE_Statement_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Type_E_C_AST(Type_E_C_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expre_AST(Expre_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_varias_Body_Declaration_AST(varias_Body_Declaration_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_while_Statement_AST(while_Statement_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_varias_TypeName_AST(varias_TypeName_AST aThis, Object arg) {
        aThis.h1.visit(this, arg);
        return null;
    }

    public Object visit_Varias_Import_AST(Varias_Import_AST aThis, Object arg) {
        aThis.h1.visit(this, arg);
        aThis.h2.visit(this, arg);
        return null;
    }

    public Object visit_VarDeclarationA_AST(VarDeclarationA_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Exp_Simple_lId_AST(Exp_Simple_lId_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Expression_Read_AST(Expression_Read_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Import_Type_AST(Import_Type_AST aThis, Object arg) {
        aThis.h1.visit(this, arg);
        aThis.h2.visit(this, arg);
        return null;
    }

    public Object visit_Method_Declaration_AST(Method_Declaration_AST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Construct_Declaration_AST(Construct_Declaration_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Class_Declaration_AST(Class_Declaration_AST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Class_DeclarationA_AST(Class_DeclarationA_AST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_DefConstr_AST(DefConstrAST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Type_Id_AST(Type_Id_AST aThis, Object arg) {
        aThis.id
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_varVarDecls_AST(varVarDeclsAST aThis, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_varias_FormalList_AST(varias_FormalList_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_MethodDecl_AST(MethodDecl_AST aThis, Object arg) {
        tabMetodo.openScope();
        tabMetodo.enter(aThis.id.value.toString(), aThis);
        tabMetodo.closeScope();
        aThis.h1.visit(this, arg);
        aThis.h2.visit(this, arg);
        aThis.h3.visit(this, arg);
        aThis.h4.visit(this, arg);
        aThis.h5.visit(this, arg);
        return null;
    }

    public Object visit_Expre_Stat_AST(Expre_Stat_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Explist_Stat_AST(Explist_Stat_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_Exp_AST(Exp_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_D_Return_AST(D_Return_AST aThis, Object arg) {
        aThis.h1.visit(this, arg);
        return null;
    }

    public Object visit_varias_FormalLists_AST(varias_FormalLists_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_var_Statement_AST(var_Statement_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_println_Statement_AST(println_Statement_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_if_else_Statement_AST(if_else_Statement_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_exit_Stat_AST(exit_Stat_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_c_Id_AST(c_Id_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_asignacion_Stat_AST(asignacion_Stat_AST aThis, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object visit_MainC_AST(MainC_AST aThis, Object arg) {
        if(tabClase.retrieve(aThis.h1.value.toString())==null) {
            tabClase.openScope();
            tabClase.enter(aThis.h1.value.toString(), aThis);
            if(tabMetodo.retrieve(aThis.h2.value.toString())==null)
        } else {
        
        }
        tabClase.openScope();
        tabClase.enter(aThis.h1.value.toString(), aThis);
        tabMetodo.openScope();
        tabMetodo.enter(aThis.h2.value.toString(), aThis);
        aThis.h3.visit(this, arg);
        tabMetodo.closeScope();
        tabClase.closeScope();
        return null;
    }

    public Object visit_Tid_AST(Tid_AST aThis, Object arg) {
        tabIdentificador.openScope();
        tabIdentificador.enter(aThis.id.value.toString(), aThis);
        aThis.h1.visit(this, arg);
        tabIdentificador.closeScope();
        return null;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

import AST.*;

/**
 *
 * @author jdbr
 */
public class PrettyPrintAST implements Visitor {
      public static String tree=""; 
  public void imprimir(AST raiz)
  {
    tree+="IMPRESION DEL ARBOL:\n\n";
    raiz.visit(this,new Integer(0));
    tree+="\nFIN DE IMPERSION\n";
  }
  
  public void printtab(int n)
  {
    for(int num=n; num != 0; num--){
     System.out.print("+++");
    System.out.print(">");
    tree+="+++";
    tree+=">";}
      
  }
  
  public Object visit_Body_AST( Body_AST c, Object arg){
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Class_DeclarationA_AST( Class_DeclarationA_AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Class_DeclarationB_AST( Class_DeclarationB_AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.h1.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.h1.value);
    if (c.h1!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Class_Declaration_AST( Class_Declaration_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Construct_Declaration_AST( Construct_Declaration_AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_DefConstrAST( DefConstrAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
         
  public Object visit_D_Exp_AST( D_Exp_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
          
  public Object visit_MainC_AST( MainC_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.h1.value+"------->"+c.h2.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.h1.value+"------->"+c.h2.value);
    if (c.h1!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_MethodDecl_AST( MethodDecl_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h4!=null)
      c.h4.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h5!=null)
      c.h5.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_D_Return_AST( D_Return_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Expression_Read_AST( Expression_Read_AST c, Object arg)
  {
      int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.t!=null)
      c.t.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Expre_Stat_AST( Expre_Stat_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Exp_Simple_STRING_AST( Exp_Simple_STRING_AST c, Object arg)
  {
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.str.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.str.value);
      return null;
  }
  
  public Object visit_Expression_LIST_AST( Expression_LIST_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Explist_Stat_AST( Explist_Stat_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Expre_NEGACION_AST( Expre_NEGACION_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Expre_NEWINT_AST( Expre_NEWINT_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Expre_NEWID_AST( Expre_NEWID_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Expre_AST( Expre_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_ImpD_ClassD_MainC_AST(ImpD_ClassD_MainC_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Method_Declaration_AST( Method_Declaration_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }

  
  public Object visit_Type_Names_AST( Type_Names_AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.h1.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.h1.value);
    if (c.h1!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Tid_AST( Tid_AST c, Object arg)
  {
      int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
   
  public Object visit_Type_E_C_AST( Type_E_C_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Type_LENGTH_AST( Type_LENGTH_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  
  public Object visit_Type_EList_AST( Type_EList_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_Type_Op_AST( Type_Op_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_VarDeclarationA_AST( VarDeclarationA_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_asignacion_Stat_AST( asignacion_Stat_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
public Object visit_Extends_AST( Extends_AST c, Object arg)
{
    int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
    return null;
}
  

  public Object visit_PuntoAst_AST( PuntoAst_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
}
  public Object visit_THIS_ID_AST( THIS_ID_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.id.value);
      return null;
}
  public Object visit_ELSE_Statement_ASTT( ELSE_Statement_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_exit_Stat_AST( exit_Stat_AST c, Object arg)
  {
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.nn.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.nn.value);
      return null;
  }
  
 
  public Object visiti_if_else_Statement_AST( if_else_Statement_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Import_Type_AST( Import_Type_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_println_Statement_AST( println_Statement_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Exp_AST( Exp_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  
  public Object visit_Exp_TyE_AST( Exp_TyE_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_u_Expression_AST( u_Expression_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_varias_Body_Declaration_AST( varias_Body_Declaration_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_varias_Class_Declarations_AST( varias_Class_Declarations_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_( varias_Expression_LIST_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_varias_FormalList_AST( varias_FormalList_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_varias_FormalLists_AST( varias_FormalLists_AST c, Object arg)
          {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_Varias_Import_AST( Varias_Import_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_var_Statement_AST( var_Statement_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visit_varias_Statements_AST( varias_Statements_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_varias_TypeName_AST( varias_TypeName_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarVarDeclsAST( varVarDeclsAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_while_Statement_AST( while_Statement_AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
    return null;
  }
  public Object visit_c_Void_AST( c_Void_AST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_c_Id_AST(c_Id_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_THIS_THIS_AST( THIS_THIS_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Extends2_AST( Extends_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Implements_AST(Implements_AST c,Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Exp_Simple_NUMERO_AST(Exp_Simple_NUMERO_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.num.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.num.value);
      return null;
  }
  public Object visit_Exp_Simple_lId_AST(Exp_Simple_lId_AST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.id.value);
      return null;
  }
  public Object visit_Exp_Simple_TRUE_AST(Exp_Simple_TRUE_AST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Exp_Simple_FALSE_AST(Exp_Simple_FALSE_AST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Exp_Simple_THIS_AST(Exp_Simple_THIS_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  
    public Object visit_Op_SUMA_AST( Op_SUMA_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
    
  public Object visitOpRestaAST( Op_RESTA_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_ASTERISCO_AST( Op_ASTERISCO_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpDivisionAST( Op_DIV_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_DIFERENCIA_AST( Op_DIFERENCIA_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_IGUAL_AST( Op_IGUAL_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_IGUAL_AST( Op_MENOR_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_MENOR_IGUAL_AST( Op_MENOR_IGUAL_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visit_Op_MAYOR_IGUAL_AST( Op_MAYOR_IGUAL_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpMayorqueAST( Op_MAYOR_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpOrAST( Op_OR_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpAndAST( Op_AND_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
     
   public Object visit_Type_Int_AST( Type_Int_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
   
   public Object visit_Type_Boolean_AST( Type_Boolean_AST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
   public Object visit_Type_TInt_AST( Type_TInt_AST c, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=c.getClass().getName()+"\n";
       System.out.println(c.getClass().getName());
       return null;
   }

    @Override
    public Object visit_Op_AND_AST(Op_AND_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Op_OR_AST(Op_OR_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_MAYOR_AND_AST(Op_MAYOR_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Op_MENOR_AST(Op_MENOR_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Op_DIV_AST(Op_DIV_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Op_RESTA_AST(Op_RESTA_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Varias_Statements_AST(varias_Statements_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_This_IDAST(THIS_ID_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_This_This_AST(THIS_THIS_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Exq_TyE_AST(Exp_TyE_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Varias_Expresion_Lists_AST(varias_Expression_LIST_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_varias_CLass_Declarations_AST(varias_Class_Declarations_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_DeclarationB_AST(Class_DeclarationB_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_ELSE_Statement_AST(ELSE_Statement_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_DefConstr_AST(DefConstrAST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_Type_Id_AST(Type_Id_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_varVarDecls_AST(varVarDeclsAST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }

    @Override
    public Object visit_if_else_Statement_AST(if_else_Statement_AST aThis, Object arg) {
       int numaux = ((Integer)arg).intValue();
       printtab(numaux);
       tree+=aThis.getClass().getName()+"\n";
       System.out.println(aThis.getClass().getName());
       return null;
    }
    
}

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
public abstract class PrettyPrintAST implements Visitor {
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
  
  
  public Object visittipExpAST( tipExpAST c, Object arg)
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
  public Object visitunaExpAST( unaExpAST c, Object arg)
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
  public Object visitvarBodyDeclAST( varBodyDeclAST c, Object arg)
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
  public Object visitvarClassDeclsAST( varClassDeclsAST c, Object arg)
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
  public Object visitvarExpListsAST( varExpListsAST c, Object arg)
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
  public Object visitvarFormalListAST( varFormalListAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id2.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id2.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
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
  public Object visitvarFormalListsAST( varFormalListsAST c, Object arg)
          {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    tree+=c.getClass().getName()+"------->"+c.id2.value+"\n";
    System.out.println(c.getClass().getName()+"------->"+c.id2.value);
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      tree+="NULL\n";
      System.out.println("NULL");
    }
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
  public Object visitvarImportAST( varImportAST c, Object arg)
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
  public Object visitvarStatAST( varStatAST c, Object arg)
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
  
  public Object visitvarStatementsAST( varStatementsAST c, Object arg)
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
  public Object visitvarTypeNameAST( varTypeNameAST c, Object arg)
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
  public Object visitwhileStatAST( whileStatAST c, Object arg)
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
  public Object visitconVoidAST( conVoidAST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitconIdAST( conIdAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitThisconThisAST( ThisconThisAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitconExtendsAST( conExtendsAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitconImplementsAST(conImplementsAST c,Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitExp_SimplNumeroAST(Exp_SimplNumeroAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.numero.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.numero.value);
      return null;
  }
  public Object visitExp_SimplIdAST(Exp_SimplIdAST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"------->"+c.id.value+"\n";
        System.out.println(c.getClass().getName()+"------->"+c.id.value);
      return null;
  }
  public Object visitExp_SimpltrueAST(Exp_SimpltrueAST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitExp_SimplfalseAST(Exp_SimplfalseAST c, Object arg){
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitExp_SimplthisAST(Exp_SimplthisAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  
    public Object visitOpSumaAST( OpSumaAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
    
  public Object visitOpRestaAST( OpRestaAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpAsteriscoAST( OpAsteriscoAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpDivisionAST( OpDivisionAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpDiferenteaAST( OpDiferenteaAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpIgualaAST( OpIgualaAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpMenorqueAST( OpMenorqueAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpMenorigualAST( OpMenorigualAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpMayorigualAST( OpMayorigualAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpMayorqueAST( OpMayorqueAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpOrAST( OpOrAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
  public Object visitOpAndAST( OpAndAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
     
   public Object visitTypeconIntccAST( TypeconIntccAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
   
   public Object visitTypeconBooleanAST( TypeconBooleanAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
   
   public Object visitTypeconIntAST( TypeconIntAST c, Object arg)
  {
      
   int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        tree+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
      return null;
  }
    
}

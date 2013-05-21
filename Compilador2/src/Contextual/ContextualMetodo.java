/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contextual;

import AST.MethodDecl_AST;
import AST.Visitor;

/**
 *
 * @author GeOrge
 */
public class ContextualMetodo implements Visitor {
    
    public TablaMetodos tabla = new TablaMetodos();
  
  public Object visitcondeclAST(MethodDecl_AST c, Object arg){ 
    c.h1.visit(this,arg); //se visita para hacer manejo de tabla de las declaraciones
    c.h2.visit(this,arg); //se visita para hacer chequeo de tipos de los statemens
    return null; 
  }
  
  public Object visitunadeclAST( unadeclAST c, Object arg){
    c.d.visit(this,arg);
    return null;
  }
  public Object visitvariasdeclsAST( variasdeclsAST c, Object arg){
    c.d1.visit(this,arg);
    c.d2.visit(this,arg);
    return null;
  }
  
  public Object visitintdeclAST( intdeclAST c, Object arg){
    c.h1.visit(this,c); // se visitan el árbol creado de IDs con el propósito de hacer análisis contextual agregando estos IDs en la tabla de símbolos. Se envía el nodo para que sirva de tipo en la tabla para cada ID. 
    return null;}
  
  public Object visitsindeclAST( sindeclAST c, Object arg){
    c.sta.visit(this,arg); //se visita para hacer chequeo de tipos de los statemens
    return null;
  }
  
  public Object visitstrdeclAST( strdeclAST c, Object arg){
    c.h1.visit(this,c); // se visitan el árbol creado de IDs con el propósito de hacer análisis contextual agregando estos IDs en la tabla de símbolos. Se envía el nodo para que sirva de tipo en la tabla para cada ID. 
    return null;}
  
  public Object visitunIDAST(unIDAST c, Object arg)
  {
    tabla.enter((String)(c.h1),(declAST)arg);
    System.out.println(tabla.retrieve((String)c.h1));
    return null;
  }
  public Object visitvariosIDAST( variosIDAST c, Object arg)
  {
    c.h1.visit(this,arg);
    c.h2.visit(this,arg);
    return null;
  }
  
  public Object visitIDexprAST( IDexprAST c, Object arg){
    //buscar en tabla
    nodoTabla res = tabla.retrieve((String)c.h1);
    if (res != null){
    //if tipo == entero return 0; else return 1
      if(res.p_decl instanceof intdeclAST)
      {
        c.tipo = 0;
        return 0;
      }
      else
      {
        c.tipo = 1;
        return 1;
      }
    }
    else
    {
      System.out.println("Identificador no declarado (" + (String)c.h1 + ")");
      c.tipo = -1;
      return -1;
    }
  }
  public Object visitNUMexprAST( NUMexprAST c, Object arg){
    c.tipo = 0;
    return 0; 
  }
  public Object visitSTRexprAST( STRexprAST c, Object arg){
    c.tipo = 1;
    return 1; 
  }
  
  public Object visitassignstatAST( assignstatAST c, Object arg){
    // hacer chequeo de tipos;
    int t1, t2 = -1;
    
    nodoTabla res = tabla.retrieve((String)c.h1);
    if(res!=null){
      if(res.p_decl instanceof intdeclAST)
        t1 = 0;
      else 
        t1 = 1;
    }
    else
    {
      //error de ID no declarado
      t1 = -1;
    }
    
    t2 = ((Integer) c.h2.visit(this,null));
    
    if (t1!=t2){
      //error de tipos incompatibles... y despliego los tipos
    }
    else{
      if(t1!=-1);
        //error de ids no declarados
    }
    return null;
  }
  
  public Object visitunstatsAST( unstatsAST c, Object arg){
    c.h1.visit(this,null);
    return null;
  }
  
  public Object visitvariosstatsAST( variosstatsAST c, Object arg){
    c.h1.visit(this,null);
    c.h2.visit(this,null);
    return null;
  }
  
  public Object visitexprstatAST( exprstatAST c, Object arg){
    c.h1.visit(this,null);
    return null;
  }
  
  public Object visittermexprAST( termexprAST c, Object arg){
    return c.h1.visit(this,null);
    //return null;
  }
  
  public Object visitsumaexprAST( sumaexprAST c, Object arg){
    int t1,t2,res = -1;
    res = t1 = (Integer) c.h1.visit(this,null);
    t2 = (Integer) c.h2.visit(this,null);
    
    if (t1!=t2){
      res = -1;
      System.out.println("Error de tipos: tipos incompatibles");
    }
    else{
      if(t1!=-1)
        System.out.println("Error de alcance: Ambas variables");
    }
    
    return res;
  }
  
  public Object visitfactortermAST( factortermAST c, Object arg){
    return c.h1.visit(this,null);
    //return null;
  }
  
  public Object visitmulttermAST( multtermAST c, Object arg){
    return null;
  }
  
  public Object visitexprfactorAST( exprfactorAST c, Object arg){
    return c.h1.visit(this,null);
    //return null;
  }
}

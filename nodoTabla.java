import AST.*;

public class nodoTabla {
  
  public String nombreID;
  public int nivel;
  public AST p_decl;
  
  public nodoTabla(String nom, int niv, AST decl) {
    nombreID = nom;
    nivel = niv;
    p_decl = decl;
  }
  
  public String toString() {
    return new String(nombreID + "-" + nivel + "-" + p_decl.toString());
  }
}
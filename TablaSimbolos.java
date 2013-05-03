import java.util.ArrayList;
import AST.*;

public class TablaSimbolos{
  
  private ArrayList tabla;
  public int nivel = 0;
  
  public TablaSimbolos() {
    tabla = new ArrayList();
  }
  
  public boolean enter(String n, AST p_decl) { // insertar en la lista
    
    
    nodoTabla nn = new nodoTabla(n, nivel, p_decl);
    
    int i = tabla.size() - 1;
    while(((nodoTabla)tabla.get(i)).nivel == this.nivel) {
      if(((nodoTabla)tabla.get(i)).nombre == nn.nombre) 
        return(false);
      i--;
    }
    
    tabla.add(nn); 
    
    return true;
  } 
  
  public nodoTabla retrieve(String n) { // buscar en la lista
    int i = tabla.size() - 1;
    while(((nodoTabla)tabla.get(i)).nivel <= 0) {
      if(((nodoTabla)tabla.get(i)).nombre == n) {
        return((nodoTabla) tabla.get(i));
      }
      i--;
    }
  }
  
  public void openScope() { // abrir un nivel
    nivel++;
  }
  
  public void closeScope() { // cerrar un nivel
    // sacar todos los ids de nivel actual de la tabla
    int i = tabla.size() - 1;
    while((tabla.size() == 0) && ((nodoTabla)tabla.get(i)).nivel == this.nivel) {
      tabla.remove(i);
      i--;
      if(tabla.size() == 0)
        break;
    }
    nivel--;
  }
}
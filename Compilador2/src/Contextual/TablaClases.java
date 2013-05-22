/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contextual;

import AST.AST;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class TablaClases {
    
    public ArrayList tabla;
    public int nivel;
    
    public TablaClases() {
        tabla = new ArrayList();
        nivel = 0;
    }
    
    public boolean enter(String n, AST decl){
        NodoTabla nn = new NodoTabla(n, nivel, decl);  
        for(int i=tabla.size()-1;i>=0;i++) {
            if(((NodoTabla)tabla.get(i)).nivel == this.nivel){
                if(((NodoTabla)tabla.get(i)).nombreID == nn.nombreID)
                    return false;  
            }
        }
        tabla.add(nn);
        return true;
    }
  
    public NodoTabla retrieve(String n){
        for(int i=tabla.size()-1;((i>=0)&&((NodoTabla)tabla.get(i)).nivel >= 0);i++) {
            NodoTabla temp = (NodoTabla)tabla.get(i);
            if(temp.nombreID == n)
            return ((NodoTabla)tabla.get(i));
        }
        return null;
    }
    
    public void openScope(){
        nivel++;
    }
  
    public void closeScope(){
        //sacar todos los ids de nivel actual de la tabla
        for(int i=tabla.size()-1;((tabla.size() != 0)&&(((NodoTabla)tabla.get(i)).nivel == this.nivel));i++) {
            tabla.remove(i);
        }
        nivel--;
    }
    
    public void llenar(){
        tabla.add(new NodoTabla("Button", 0,null));
        tabla.add(new NodoTabla("Label", 0,null));
        tabla.add(new NodoTabla("TextField", 0,null));
        tabla.add(new NodoTabla("ClassActions", 0,null));
        tabla.add(new NodoTabla("Frame", 0,null));
        tabla.add(new NodoTabla("String", 0,null));
        tabla.add(new NodoTabla("Integer", 0,null));
        tabla.add(new NodoTabla("ClassActions", 0,null));
        tabla.add(new NodoTabla("ActionListener", 0,null));
        tabla.add(new NodoTabla("ActionEvent", 0,null));
        tabla.add(new NodoTabla("Object", 0,null));
        tabla.add(new NodoTabla("WindowAdapter", 0,null));
        }
}


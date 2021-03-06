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
public class TablaMetodos {
    public ArrayList tabla;
    public int nivel;
    
    public TablaMetodos() {
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
        tabla.add(new NodoTabla("parseInt", 0, null));
        tabla.add(new NodoTabla("valueOf", 0, null));
        tabla.add(new NodoTabla("getText", 0, null));
        tabla.add(new NodoTabla("setText", 0, null));
        tabla.add(new NodoTabla("getSourse", 0, null));
        tabla.add(new NodoTabla("setVisible", 0, null));
        tabla.add(new NodoTabla("addActionListener", 0, null));
        tabla.add(new NodoTabla("setBounds", 0, null));
        tabla.add(new NodoTabla("setSize", 0, null));
        tabla.add(new NodoTabla("setTitle", 0, null));
        tabla.add(new NodoTabla("addWindowListener", 0, null));
        
    }
    
}

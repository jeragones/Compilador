/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Contextual;

import AST.AST;

/**
 *
 * @author GeOrge
 */
public class NodoTabla {
    public String nombreID;
    public int nivel;
    public AST decl;

    public NodoTabla(String nom, int ni, AST dec){
        nombreID = nom;
        nivel = ni;
        this.decl = dec;
    }
}



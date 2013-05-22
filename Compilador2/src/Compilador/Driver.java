/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;


import java.io.*;
import Compilador.MyException;
import AST.*;
import Contextual.*;
/**
 *
 * @author jdbr
 */
public class Driver {
    
    
    
    public static String E=null;
    public static PrettyPrintAST IMPRIME = new PrettyPrintAST();
    public static void driver(File text) throws Exception{
    try{
        Scanner s = new Scanner(new FileReader(text));
        parser p = new parser(s);
        Contextual contextual = new Contextual();
        p.parse();
        p.raiz.visit(Contextual,null);
          
        System.out.println("Arbol:");
        System.out.println("");
        IMPRIME.imprimir(p.raiz);
        System.out.println("");
        System.out.println("Fin");

    }
    catch(MyException e){
        
       System.out.println(e.getMessage());
       E=e.getMessage();
    } 
    }
}

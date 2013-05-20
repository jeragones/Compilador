/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;


import java.io.*;
import java.util.ArrayList;
import Compilador.MyException;
import AST.*;
/**
 *
 * @author jdbr
 */
public class Driver {
    
    
    //public static java_cup.runtime.Scanner s;
    //Scanner s;
    public static String E=null;
    public static PrettyPrintAST printer = new PrettyPrintAST() {

        @Override
        public Object visit_Type_Id_AST(Type_Id_AST c, Object arg) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    public static void driver(File text) throws Exception{
    try{
      Scanner s = new Scanner(new FileReader(text));
     parser p = new parser(s);
          p.parse();
          
        System.out.println("Arbol:");
        System.out.println("");
        printer.imprimir(p.raiz);
        System.out.println("");
        System.out.println("Fin");

    }
    catch(Exception e){
        
       System.out.println(e.getMessage());
       E=e.getMessage();
    } 
    }
}

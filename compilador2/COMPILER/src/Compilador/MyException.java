/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

/**
 *
 * @author jdbr
 */
public class MyException extends Exception{
     public MyException(String msj){
        super(msj+"\n");
    }
}

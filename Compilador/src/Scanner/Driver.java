/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import AST.AST;
import Ventana.Ventana;
import java.io.FileReader;
import java.io.StringReader;
import javax.swing.JTextArea;

/**
 *
 * @author Alonso
 */
public class Driver {

    JTextArea Source;
    
    public Driver(JTextArea source) {
        Source = source;
    }
    
    public void Ejecutar() throws Exception {
        Scanner s = new Scanner(new StringReader(Source.getText()));
        parser p = new parser(s);
        p.parse();

    }
    
    public static void main(String argv[]) {

    for (int i = 0; i < argv.length; i++) {
      try {
        System.out.println("Proceso de parsing sobre el archivo ["+argv[i]+"]");
        Scanner s = new Scanner(new FileReader(argv[i]));
        //parser p = new parser(s);
//        p.parse();
        
        System.out.println("No hay Errores!!!");
      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
    }
  }
}

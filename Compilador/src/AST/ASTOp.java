/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author jdbr
 */
public abstract class ASTOp extends ASTExpsa{
    public String Suma;
    public String Resta;
    public String Mult;
    public String Div;
    public String Diferencia;
    public String Igual_comp;
    public String Menor;
    public String Menor_Igual;
    public String Mayor_Igual;
    public String Mayor;
    public String OR;
    public String AND;
    
    public ASTOp(String s,String r,String m,String d,String dif,String ic,String me,String me_i,String ma_i,String ma,String or,String a){
    Suma = s;
    Resta = r;
    Mult =m;
    Div = d;
    Diferencia = dif;
    Igual_comp =ic;
    Menor = me;
    Menor_Igual = me_i;
    Mayor_Igual =ma_i;
    Mayor =ma;
    OR =or;
    AND=a;
        
    }
    
    
    
    
}

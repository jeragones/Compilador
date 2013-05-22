/**
 * Scanner para la gramAtica de prueba del curso de Compiladores e Interpretes.
 */

import java.util.ArrayList;
import java_cup.runtime.*;
%%

%class Scanner
%unicode
%ignorecase
%public
%cup
%line
%column
%scanerror Exception

%eofval{
        return symbol(sym.EOF, new String("EOF"));
%eofval}

%{
    public static  ArrayList Ltokens=new ArrayList();
    
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
  
  int contComment=0;
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment =  {TraditionalComment} | {EndOfLineComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [:jletterdigit:]* | [$][:jletter:][:jletterdigit:]* | _[:jletter:][:jletterdigit:]* 	

Identifier2 = [:jletter:] [:jletterdigit:]* | [$][:jletter:][:jletterdigit:]* | _[:jletter:][:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]* | 0.[0-9][0-9]* | [1-9][0-9]*.[0-9][0-9]*

Char = '[:jletter:]'

%state STRING
%state Comentario
%%

/* Palabras reservadas */


<YYINITIAL> "int[]"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.INT+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.INT, yytext()); }

<YYINITIAL> "int"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.TINT+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.TINT, yytext()); }

<YYINITIAL> "String[]"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.TSTRING+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.TSTRING, yytext()); }

<YYINITIAL> "boolean"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.BOOLEAN+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.BOOLEAN, yytext()); }

<YYINITIAL> "class"            {String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.CLASS+"\n" ;
                                 Ltokens.add(m);  
                                return symbol(sym.CLASS, yytext()); }


<YYINITIAL> "else"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.ELSE+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.ELSE, yytext()); }


<YYINITIAL> "if"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IF+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.IF, yytext()); }


<YYINITIAL> "true"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.TRUE+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.TRUE, yytext()); }


<YYINITIAL> "false"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.FALSE+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.FALSE, yytext()); }

<YYINITIAL> "while"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.WHILE+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.WHILE, yytext()); }


<YYINITIAL> "main"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.MAIN+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.MAIN, yytext()); }


<YYINITIAL> "public"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PUBLIC+"\n" ;
                                 Ltokens.add(m); 
                                  return symbol(sym.PUBLIC, yytext()); }


<YYINITIAL> "static"            {String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.STATIC+"\n" ;
                                 Ltokens.add(m); 
                                 return symbol(sym.STATIC, yytext()); }

<YYINITIAL> "extends"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.EXTENDS+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.EXTENDS, yytext()); }

<YYINITIAL> "length"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.LENGTH+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.LENGTH, yytext()); }

<YYINITIAL> "new"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.NEW+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.NEW, yytext()); }

<YYINITIAL> "out"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.OUT+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.OUT, yytext()); }

<YYINITIAL> "println"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PRINTLN+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PRINTLN, yytext()); }

<YYINITIAL> "return"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.RETURN+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.RETURN, yytext()); }

<YYINITIAL> "System"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.SYSTEM+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.SYSTEM, yytext()); }

<YYINITIAL> "this"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.THIS+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.THIS, yytext()); }

<YYINITIAL> "void"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.VOID+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.VOID, yytext()); }

<YYINITIAL> "import"    	    	{String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IMPORT+"\n" ;
                                 Ltokens.add(m);  
                                return symbol(sym.IMPORT, yytext()); }

<YYINITIAL> "implements"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IMPLEMENTS+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.IMPLEMENTES, yytext()); }

<YYINITIAL> "exit"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.EXIT+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.EXIT, yytext()); }

<YYINITIAL> "in"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IN+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.IN, yytext()); }

<YYINITIAL> "read"            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.READ+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.READ, yytext()); }

<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                  { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.ID+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.ID, yytext()); }


  /* identificadores */ 
  {Identifier2}                   { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.ID2+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.ID2, yytext()); }


 
  /* literales enteros positivos */
  {DecIntegerLiteral}            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.NUMERO+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.NUMERO, yytext()); }

  \"                             { string.setLength(0); yybegin(STRING); }
  
  /*{Char}                         { return symbol(sym.CHAR,yytext(), yytext()); }*/

  
  /* operadores */

  "="                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IGUAL+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.IGUAL, yytext()); }


  "*"                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.ASTERISCO+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.ASTERISCO, yytext()); }


  "+"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.SUMA+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.SUMA, yytext()); }


  "-"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.RESTA+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.RESTA, yytext()); }

  /* operadores logicos*/

  "||"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.OR+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.OR, yytext()); }


  "&&"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.AND+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.AND, yytext()); }


  "/"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.DIV+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.DIV, yytext()); }


  "!"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.NEGACION+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.NEGACION, yytext()); }

  /* operadores condicionales*/


  "!="                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.DIFERENCIA+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.DIFERENCIA, yytext()); }


  "=="                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.IGUAL_COMP+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.IGUAL_COMP, yytext()); }


  "<"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.MENOR+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.MENOR, yytext()); }


  "<="                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.MENOR_IGUAL+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.MENOR_IGUAL, yytext()); }


  ">"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.MAYOR+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.MAYOR, yytext()); }


  ">="                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.MAYOR_IGUAL+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.MAYOR_IGUAL, yytext()); }

  

  /* otros simbolos validos */

  "("                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PARENT_ON+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PARENT_ON, yytext()); }


  ")"                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PARENT_OFF+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PARENT_OFF, yytext()); }


  "{"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.LLAVE_ON+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.LLAVE_ON, yytext()); }


  "}"                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.LLAVE_OFF+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.LLAVE_OFF, yytext()); }


  "["                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.CORCHETE_ON+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.CORCHETE_ON, yytext()); }

  "]"                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.CORCHETE_OFF+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.CORCHETE_OFF, yytext()); }

  "."                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PUNTO+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PUNTO, yytext()); }

  ".*"                           { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PUNTO_AST+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PUNTO_AST, yytext()); }

  ";"                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.PUNTO_COMA+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.PUNTO_COMA, yytext()); }

  ","                            { String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.COMA+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.COMA, yytext()); }
  
  "/*"				{contComment++; yybegin(Comentario);}


  /* commentarios */
 /* {Comment}                      { /* ignore */ }*/
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); 
                                   String m="Token: " + yytext() + " Fila: " + yyline + " Columna: " + yycolumn+". Valor: "+sym.STRING+"\n" ;
                                 Ltokens.add(m); 
                                return symbol(sym.STRING, yytext()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}


<Comentario> 	{
   [^]				 {/*Ignore*/}
  "/*"				 { contComment++;}
  "*/"				 {contComment--;
				  if(contComment == 0)
					{
					yybegin(YYINITIAL);
				        }
				  }
}


/* caracteres no validos */
.|\n                             { System.out.println("Error caracter invalido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
				   String m="ERROR! Caracter no Permitido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn+"\n" ;
                                    //error.add(m);
                                            throw new MyException(m); }


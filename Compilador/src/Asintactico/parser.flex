/**
 * Scanner para la gramática de prueba del curso de Compiladores e Intérpretes.
 */
%%

%class Scanner
%unicode
%debug
%line
%column
%type Symbol // cambiar nombre del token
%function nextToken // funcion principal

/*%eofval{
	return symbol(sym.EOF);
%eofval}*/

%{
   StringBuffer string = new StringBuffer();

   private Symbol symbol(int type) {
      return new Symbol(type, yyline, yycolumn);
   }
   private Symbol symbol(int type, Object value) {
      return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment   = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] | "_" | "$" [:jletterdigit:]*


DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING

%%

/* Palabras reservadas */

<YYINITIAL> "INT"              { return symbol(sym.INT); }
<YYINITIAL> "STRING"           { return symbol(sym.STRING); }
<YYINITIAL> "boolean"          { return symbol(sym.BOOLEAN); }
<YYINITIAL> "Class"            { return symbol(sym.Class); }
<YYINITIAL> "else"             { return symbol(sym.Else); }
<YYINITIAL> "if"               { return symbol(sym.If); }
<YYINITIAL> "true"             { return symbol(sym.True); }
<YYINITIAL> "false"            { return symbol(sym.False); }
<YYINITIAL> "while"            { return symbol(sym.While); }
<YYINITIAL> "main"             { return symbol(sym.Main); }
<YYINITIAL> "public"           { return symbol(sym.Public); }
<YYINITIAL> "static"           { return symbol(sym.Static); }
<YYINITIAL> "extends"          { return symbol(sym.Extends); }
<YYINITIAL> "length"           { return symbol(sym.Lenght); }
<YYINITIAL> "INTEGER_LITERAL"  { return symbol(sym.INTEGER_LITERAL); }
<YYINITIAL> "STRING_CONSTANT"  { return symbol(sym.STRING_CONSTANT); }
<YYINITIAL> "new"              { return symbol(sym.New); }
<YYINITIAL> "out"              { return symbol(sym.Out); }
<YYINITIAL> "println"          { return symbol(sym.Println); }
<YYINITIAL> "return"           { return symbol(sym.Return); }
<YYINITIAL> "system"           { return symbol(sym.System); }
<YYINITIAL> "this"             { return symbol(sym.This); }
<YYINITIAL> "void"            { return symbol(sym.Void); }
<YYINITIAL> "import"            { return symbol(sym.Import); }
<YYINITIAL> "implemets"            { return symbol(sym.Implements); }
<YYINITIAL> "exit"            { return symbol(sym.Exit); }
<YYINITIAL> "in"            { return symbol(sym.In); }
<YYINITIAL> "read"            { return symbol(sym.Read); }


<YYINITIAL> {
  /* identificadores */
  {Identifier}                   { return symbol(sym.ID,yytext()); }}

  /* literales enteros positivos */

  {DecIntegerLiteral}            { return symbol(sym.NUM); }
  \"                             { string.setLength(0); yybegin(STRING); }

  /* operadores */

  "="                           { return symbol(sym.Igual_Asig); }
  "*"                           { return symbol(sym.MULT); }
  "/"                           { return symbol(sym.Div); }
  "+"                           { return symbol(sym.Suma); }
  "-"                           { return symbol(sym.Resta); }

  /* operadores logicos*/

  "||"                          { return symbol(sym.OR); }
  "&&"                          { return symbol(sym.AND); }
  "!"                           { return symbol(sym.Negacion); }

  /* operadores condicionales*/

  "!="                          { return symbol(sym.Diferencia); }
  "=="                          { return symbol(sym.Igual_Comp); }
  "<"                           { return symbol(sym.Menor); }
  ">"                           { return symbol(sym.Mayor); }
  "<="                          { return symbol(sym.Menor_Igual); }
  ">="                          { return symbol(sym.Mayor_Igual); }

  /* otros simbolos válidos */

  "("                           { return symbol(sym.PARENT_on); }
  ")"                           { return symbol(sym.PARENT_off); }
  "["                           { return symbol(sym.Corchete_on); }
  "]"                           { return symbol(sym.Corchete_off); }
  "{"                           { return symbol(sym.Llave_on); }
  "}"                           { return symbol(sym.Llave_off); }
  ";"                           { return symbol(sym.DOTCOMMA); }
  ","                           { return symbol(sym.COMA); }
  "."                           { return symbol(sym.Punto); }
  

  /* commentarios */
  {Comment}                     { /* ignore */ }

  /* espacios en blanco */
  {WhiteSpace}                  { /* ignore */ }


<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   return symbol(sym.STRING, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

/* caracteres no válidos */
.|\n                             { System.out.println("Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
				   /*throw new Error("Caracter no permitido <"+
                                                    yytext()+">");*/ }
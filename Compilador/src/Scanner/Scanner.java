/**
 * Scanner para la gramática de prueba del curso de Compiladores e Intérpretes.
 */

package Scanner;

/**
 *
 * @author GeOrge
 */

public class Scanner {
    
    
        /** This character denotes the end of file */
    public static final int YYEOF = -1;

    /** initial size of the lookahead buffer */
    private static final int ZZ_BUFFERSIZE = 16384;
    private static final String ZZ_NL = System.getProperty("line.separator");

    /** lexical states */
    public static final int STRING = 2;
    public static final int YYINITIAL = 0;

    /**
    * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
    * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
    *                  at the beginning of a line
    * l is of the form l = 2*k, k a non negative integer
    */
    private static final int ZZ_LEXSTATE[] = { 
        0,  0,  1, 1
    };

    /** 
    * Translates characters to character classes
    */
    private static final String ZZ_CMAP_PACKED = 
        "\11\11\1\3\1\2\1\0\1\3\1\1\16\11\4\0\1\3\1\63"+
        "\1\55\1\0\1\10\1\0\1\62\1\0\1\66\1\67\1\5\1\57"+
        "\1\75\1\60\1\76\1\4\1\12\11\13\1\0\1\74\1\64\1\56"+
        "\1\65\2\0\1\51\1\6\1\30\1\6\1\47\1\6\1\21\1\6"+
        "\1\14\2\6\1\50\1\6\1\15\1\52\2\6\1\20\1\17\1\16"+
        "\6\6\1\70\1\77\1\71\1\0\1\7\1\0\1\26\1\22\1\43"+
        "\1\45\1\25\1\33\1\46\1\40\1\32\2\6\1\24\1\41\1\27"+
        "\1\23\1\42\1\6\1\35\1\31\1\34\1\36\1\54\1\37\1\44"+
        "\1\53\1\6\1\72\1\61\1\73\1\0\41\11\2\0\4\6\4\0"+
        "\1\6\2\0\1\11\7\0\1\6\4\0\1\6\5\0\27\6\1\0"+
        "\37\6\1\0\u01ca\6\4\0\14\6\16\0\5\6\7\0\1\6\1\0"+
        "\1\6\21\0\160\11\5\6\1\0\2\6\2\0\4\6\10\0\1\6"+
        "\1\0\3\6\1\0\1\6\1\0\24\6\1\0\123\6\1\0\213\6"+
        "\1\0\5\11\2\0\236\6\11\0\46\6\2\0\1\6\7\0\47\6"+
        "\11\0\55\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0\1\11"+
        "\10\0\33\6\5\0\3\6\15\0\4\11\7\0\1\6\4\0\13\11"+
        "\5\0\53\6\37\11\4\0\2\6\1\11\143\6\1\0\1\6\10\11"+
        "\1\0\6\11\2\6\2\11\1\0\4\11\2\6\12\11\3\6\2\0"+
        "\1\6\17\0\1\11\1\6\1\11\36\6\33\11\2\0\131\6\13\11"+
        "\1\6\16\0\12\11\41\6\11\11\2\6\4\0\1\6\5\0\26\6"+
        "\4\11\1\6\11\11\1\6\3\11\1\6\5\11\22\0\31\6\3\11"+
        "\244\0\4\11\66\6\3\11\1\6\22\11\1\6\7\11\12\6\2\11"+
        "\2\0\12\11\1\0\7\6\1\0\7\6\1\0\3\11\1\0\10\6"+
        "\2\0\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3\0\4\6"+
        "\2\0\1\11\1\6\7\11\2\0\2\11\2\0\3\11\1\6\10\0"+
        "\1\11\4\0\2\6\1\0\3\6\2\11\2\0\12\11\4\6\7\0"+
        "\1\6\5\0\3\11\1\0\6\6\4\0\2\6\2\0\26\6\1\0"+
        "\7\6\1\0\2\6\1\0\2\6\1\0\2\6\2\0\1\11\1\0"+
        "\5\11\4\0\2\11\2\0\3\11\3\0\1\11\7\0\4\6\1\0"+
        "\1\6\7\0\14\11\3\6\1\11\13\0\3\11\1\0\11\6\1\0"+
        "\3\6\1\0\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0"+
        "\1\11\1\6\10\11\1\0\3\11\1\0\3\11\2\0\1\6\17\0"+
        "\2\6\2\11\2\0\12\11\1\0\1\6\17\0\3\11\1\0\10\6"+
        "\2\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0\5\6"+
        "\2\0\1\11\1\6\7\11\2\0\2\11\2\0\3\11\10\0\2\11"+
        "\4\0\2\6\1\0\3\6\2\11\2\0\12\11\1\0\1\6\20\0"+
        "\1\11\1\6\1\0\6\6\3\0\3\6\1\0\4\6\3\0\2\6"+
        "\1\0\1\6\1\0\2\6\3\0\2\6\3\0\3\6\3\0\14\6"+
        "\4\0\5\11\3\0\3\11\1\0\4\11\2\0\1\6\6\0\1\11"+
        "\16\0\12\11\11\0\1\6\7\0\3\11\1\0\10\6\1\0\3\6"+
        "\1\0\27\6\1\0\12\6\1\0\5\6\3\0\1\6\7\11\1\0"+
        "\3\11\1\0\4\11\7\0\2\11\1\0\2\6\6\0\2\6\2\11"+
        "\2\0\12\11\22\0\2\11\1\0\10\6\1\0\3\6\1\0\27\6"+
        "\1\0\12\6\1\0\5\6\2\0\1\11\1\6\7\11\1\0\3\11"+
        "\1\0\4\11\7\0\2\11\7\0\1\6\1\0\2\6\2\11\2\0"+
        "\12\11\1\0\2\6\17\0\2\11\1\0\10\6\1\0\3\6\1\0"+
        "\51\6\2\0\1\6\7\11\1\0\3\11\1\0\4\11\1\6\10\0"+
        "\1\11\10\0\2\6\2\11\2\0\12\11\12\0\6\6\2\0\2\11"+
        "\1\0\22\6\3\0\30\6\1\0\11\6\1\0\1\6\2\0\7\6"+
        "\3\0\1\11\4\0\6\11\1\0\1\11\1\0\10\11\22\0\2\11"+
        "\15\0\60\6\1\11\2\6\7\11\4\0\10\6\10\11\1\0\12\11"+
        "\47\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2\0\1\6"+
        "\6\0\4\6\1\0\7\6\1\0\3\6\1\0\1\6\1\0\1\6"+
        "\2\0\2\6\1\0\4\6\1\11\2\6\6\11\1\0\2\11\1\6"+
        "\2\0\5\6\1\0\1\6\1\0\6\11\2\0\12\11\2\0\2\6"+
        "\42\0\1\6\27\0\2\11\6\0\12\11\13\0\1\11\1\0\1\11"+
        "\1\0\1\11\4\0\2\11\10\6\1\0\44\6\4\0\24\11\1\0"+
        "\2\11\5\6\13\11\1\0\44\11\11\0\1\11\71\0\53\6\24\11"+
        "\1\6\12\11\6\0\6\6\4\11\4\6\3\11\1\6\3\11\2\6"+
        "\7\11\3\6\4\11\15\6\14\11\1\6\17\11\2\0\46\6\12\0"+
        "\53\6\1\0\1\6\3\0\u0149\6\1\0\4\6\2\0\7\6\1\0"+
        "\1\6\1\0\4\6\2\0\51\6\1\0\4\6\2\0\41\6\1\0"+
        "\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\17\6\1\0"+
        "\71\6\1\0\4\6\2\0\103\6\2\0\3\11\40\0\20\6\20\0"+
        "\125\6\14\0\u026c\6\2\0\21\6\1\0\32\6\5\0\113\6\3\0"+
        "\3\6\17\0\15\6\1\0\4\6\3\11\13\0\22\6\3\11\13\0"+
        "\22\6\2\11\14\0\15\6\1\0\3\6\1\0\2\11\14\0\64\6"+
        "\40\11\3\0\1\6\3\0\2\6\1\11\2\0\12\11\41\0\3\11"+
        "\2\0\12\11\6\0\130\6\10\0\51\6\1\11\1\6\5\0\106\6"+
        "\12\0\35\6\3\0\14\11\4\0\14\11\12\0\12\11\36\6\2\0"+
        "\5\6\13\0\54\6\4\0\21\11\7\6\2\11\6\0\12\11\46\0"+
        "\27\6\5\11\4\0\65\6\12\11\1\0\35\11\2\0\13\11\6\0"+
        "\12\11\15\0\1\6\130\0\5\11\57\6\21\11\7\6\4\0\12\11"+
        "\21\0\11\11\14\0\3\11\36\6\12\11\3\0\2\6\12\11\6\0"+
        "\46\6\16\11\14\0\44\6\24\11\10\0\12\11\3\0\3\6\12\11"+
        "\44\6\122\0\3\11\1\0\25\11\4\6\1\11\4\6\1\11\15\0"+
        "\300\6\47\11\25\0\4\11\u0116\6\2\0\6\6\2\0\46\6\2\0"+
        "\6\6\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0"+
        "\37\6\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0"+
        "\7\6\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0"+
        "\7\6\16\0\5\11\32\0\5\11\20\0\2\6\23\0\1\6\13\0"+
        "\5\11\5\0\6\11\1\0\1\6\15\0\1\6\20\0\15\6\3\0"+
        "\32\6\26\0\15\11\4\0\1\11\3\0\14\11\21\0\1\6\4\0"+
        "\1\6\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0"+
        "\1\6\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0"+
        "\5\6\4\0\1\6\21\0\51\6\u0a77\0\57\6\1\0\57\6\1\0"+
        "\205\6\6\0\4\6\3\11\16\0\46\6\12\0\66\6\11\0\1\6"+
        "\17\0\1\11\27\6\11\0\7\6\1\0\7\6\1\0\7\6\1\0"+
        "\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0"+
        "\40\11\57\0\1\6\u01d5\0\3\6\31\0\11\6\6\11\1\0\5\6"+
        "\2\0\5\6\4\0\126\6\2\0\2\11\2\0\3\6\1\0\132\6"+
        "\1\0\4\6\5\0\51\6\3\0\136\6\21\0\33\6\65\0\20\6"+
        "\u0200\0\u19b6\6\112\0\u51cc\6\64\0\u048d\6\103\0\56\6\2\0\u010d\6"+
        "\3\0\20\6\12\11\2\6\24\0\57\6\1\11\14\0\2\11\1\0"+
        "\31\6\10\0\120\6\2\11\45\0\11\6\2\0\147\6\2\0\4\6"+
        "\1\0\2\6\16\0\12\6\120\0\10\6\1\11\3\6\1\11\4\6"+
        "\1\11\27\6\5\11\20\0\1\6\7\0\64\6\14\0\2\11\62\6"+
        "\21\11\13\0\12\11\6\0\22\11\6\6\3\0\1\6\4\0\12\11"+
        "\34\6\10\11\2\0\27\6\15\11\14\0\35\6\3\0\4\11\57\6"+
        "\16\11\16\0\1\6\12\11\46\0\51\6\16\11\11\0\3\6\1\11"+
        "\10\6\2\11\2\0\12\11\6\0\27\6\3\0\1\6\1\11\4\0"+
        "\60\6\1\11\1\6\3\11\2\6\2\11\5\6\2\11\1\6\1\11"+
        "\1\6\30\0\3\6\43\0\6\6\2\0\6\6\2\0\6\6\11\0"+
        "\7\6\1\0\7\6\221\0\43\6\10\11\1\0\2\11\2\0\12\11"+
        "\6\0\u2ba4\6\14\0\27\6\4\0\61\6\u2104\0\u012e\6\2\0\76\6"+
        "\2\0\152\6\46\0\7\6\14\0\5\6\5\0\1\6\1\11\12\6"+
        "\1\0\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6"+
        "\1\0\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6"+
        "\3\0\20\11\20\0\7\11\14\0\2\6\30\0\3\6\31\0\1\6"+
        "\6\0\5\6\1\0\207\6\2\0\1\11\4\0\1\6\13\0\12\11"+
        "\7\0\32\6\4\0\1\6\1\0\32\6\13\0\131\6\3\0\6\6"+
        "\2\0\6\6\2\0\6\6\2\0\3\6\3\0\2\6\3\0\2\6"+
        "\22\0\3\11\4\0";

    /** 
    * Translates characters to character classes
    */
    private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /** 
    * Translates DFA states to action switch labels.
    */
    private static final int [] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
        "\2\0\1\1\2\2\1\3\1\4\2\5\2\6\21\5"+
        "\1\7\1\10\1\11\1\12\2\1\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\2\1\3\1\4\2\6\1\10\1\11"+
        "\1\12\2\27\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\1\21\1\22\1\23\1\24\1\25\1\26\1\30\15\0"+
        "\1\31\1\32\12\0\1\33\1\34\1\35\1\36\1\37"+
        "\1\40\2\27\1\33\1\34\1\35\1\36\1\37\1\40"+
        "\1\41\1\42\1\43\1\44\2\0\1\45\2\0\1\46"+
        "\4\0\1\47\16\0\2\27\5\0\1\50\1\51\7\0"+
        "\1\52\1\53\1\54\2\0\1\55\2\0\1\56\1\27"+
        "\5\0\1\57\4\0\1\60\1\0\1\61\3\0\1\62"+
        "\1\0\1\63\1\0\1\64\1\65\1\66\1\0\1\67"+
        "\1\0\1\70\2\0\1\71\1\72\1\0\1\73\5\0"+
        "\1\74\12\0\1\75\1\76";

    private static int [] zzUnpackAction() {
        int [] result = new int[215];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
        int count = packed.charAt(i++);
        int value = packed.charAt(i++);
        do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /** 
    * Translates a state to a row index in the transition table
    */
    private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
        "\0\0\0\100\0\200\0\300\0\200\0\u0100\0\200\0\200"+
        "\0\u0140\0\200\0\u0180\0\u01c0\0\u0200\0\u0240\0\u0280\0\u02c0"+
        "\0\u0300\0\u0340\0\u0380\0\u03c0\0\u0400\0\u0440\0\u0480\0\u04c0"+
        "\0\u0500\0\u0540\0\u0580\0\u05c0\0\200\0\u0600\0\200\0\200"+
        "\0\u0640\0\u0680\0\u06c0\0\u0700\0\u0740\0\200\0\200\0\200"+
        "\0\200\0\200\0\200\0\200\0\200\0\200\0\u0780\0\u0780"+
        "\0\u07c0\0\u0780\0\u0780\0\u0800\0\u0840\0\u0780\0\u0780\0\u0880"+
        "\0\u08c0\0\u0900\0\u0940\0\u0980\0\u0780\0\u0780\0\u0780\0\u0780"+
        "\0\u0780\0\u0780\0\u0780\0\u0780\0\u0780\0\u09c0\0\u0a00\0\u0a40"+
        "\0\u0a80\0\u0ac0\0\u0b00\0\u0b40\0\u0b80\0\u0bc0\0\u0c00\0\u0c40"+
        "\0\u0c80\0\u0cc0\0\u0d00\0\200\0\200\0\u0d40\0\u0d80\0\u0dc0"+
        "\0\u0e00\0\u0e40\0\u0e80\0\u0ec0\0\u0f00\0\u0f40\0\u0f80\0\200"+
        "\0\200\0\200\0\200\0\200\0\200\0\u0fc0\0\u1000\0\u0780"+
        "\0\u0780\0\u0780\0\u0780\0\u0780\0\u0780\0\200\0\200\0\200"+
        "\0\200\0\u1040\0\u1080\0\u10c0\0\u1100\0\u1140\0\200\0\u1180"+
        "\0\u11c0\0\u1200\0\u1240\0\200\0\u1280\0\u12c0\0\u1300\0\u1340"+
        "\0\u1380\0\u13c0\0\u1400\0\u1440\0\u1480\0\u14c0\0\u1500\0\u1540"+
        "\0\u1580\0\u15c0\0\u1600\0\u1640\0\u1680\0\u16c0\0\u1700\0\u1740"+
        "\0\u1780\0\200\0\200\0\u17c0\0\u1800\0\u1840\0\u1880\0\u18c0"+
        "\0\u1900\0\u1940\0\200\0\200\0\200\0\u1980\0\u19c0\0\200"+
        "\0\u1a00\0\u1a40\0\200\0\u1a80\0\u1ac0\0\u1b00\0\u1b40\0\u1b80"+
        "\0\u1bc0\0\200\0\u1c00\0\u1c40\0\u1c80\0\u1cc0\0\200\0\u1d00"+
        "\0\200\0\u1d40\0\u1d80\0\u1dc0\0\u1e00\0\u1e40\0\200\0\u1e80"+
        "\0\200\0\200\0\200\0\u1ec0\0\200\0\u1f00\0\200\0\u1f40"+
        "\0\u1f80\0\200\0\200\0\u1fc0\0\200\0\u2000\0\u2040\0\u2080"+
        "\0\u20c0\0\u2100\0\200\0\u2140\0\u2180\0\u21c0\0\u2200\0\u2240"+
        "\0\u2280\0\u22c0\0\u2300\0\u2340\0\u2380\0\200\0\200";

    private static int [] zzUnpackRowMap() {
        int [] result = new int[215];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int [] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
        int high = packed.charAt(i++) << 16;
        result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /** 
    * The transition table of the DFA
    */
    private static final int [] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
        "\1\3\1\4\2\5\1\6\1\7\2\10\1\11\1\3"+
        "\1\12\1\13\1\14\2\10\1\15\2\10\1\16\1\17"+
        "\1\20\1\21\1\10\1\22\1\23\1\24\1\25\1\26"+
        "\1\27\1\30\1\10\1\31\1\10\1\32\1\33\11\10"+
        "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
        "\1\54\1\55\1\56\1\3\1\57\1\4\1\5\1\60"+
        "\1\61\1\62\4\57\1\63\1\64\41\57\1\35\1\65"+
        "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\102\0\1\5\101\0\1\107\1\110\100\0\47\11"+
        "\35\0\2\13\101\0\1\111\100\0\1\112\104\0\1\113"+
        "\112\0\1\114\66\0\1\115\76\0\1\116\17\0\1\117"+
        "\60\0\1\120\76\0\1\121\107\0\1\122\16\0\1\123"+
        "\53\0\1\124\3\0\1\125\5\0\1\126\64\0\1\127"+
        "\106\0\1\130\2\0\1\131\64\0\1\132\112\0\1\133"+
        "\65\0\1\134\106\0\1\135\1\136\64\0\1\137\132\0"+
        "\1\140\102\0\1\141\100\0\1\142\73\0\1\143\77\0"+
        "\1\144\77\0\1\145\21\0\1\57\2\0\52\57\1\0"+
        "\21\57\1\0\1\57\2\0\1\57\1\146\1\147\47\57"+
        "\1\0\21\57\1\0\1\57\2\0\7\57\2\64\41\57"+
        "\1\0\21\57\1\0\1\57\2\0\52\57\1\0\1\150"+
        "\20\57\1\0\1\57\2\0\52\57\1\0\3\57\1\151"+
        "\15\57\1\0\1\57\2\0\52\57\1\0\4\57\1\152"+
        "\14\57\1\0\1\57\2\0\52\57\1\0\1\153\20\57"+
        "\1\0\1\57\2\0\52\57\1\0\1\154\20\57\1\0"+
        "\1\57\2\0\52\57\1\0\1\155\20\57\30\0\1\156"+
        "\4\0\1\157\1\160\17\0\1\161\22\0\1\107\1\4"+
        "\1\5\75\107\5\162\1\163\72\162\16\0\1\164\101\0"+
        "\1\165\102\0\1\166\110\0\1\167\72\0\1\170\101\0"+
        "\1\171\100\0\1\172\1\0\1\173\102\0\1\174\66\0"+
        "\1\175\77\0\1\176\102\0\1\177\110\0\1\200\61\0"+
        "\1\201\111\0\1\202\73\0\1\203\73\0\1\204\5\0"+
        "\1\205\75\0\1\206\77\0\1\207\77\0\1\210\67\0"+
        "\1\211\107\0\1\212\45\0\1\146\1\4\1\5\52\146"+
        "\1\107\21\146\1\107\1\213\2\162\2\213\1\214\47\213"+
        "\1\162\21\213\6\162\1\215\72\162\4\0\1\5\1\163"+
        "\141\0\1\216\44\0\1\217\107\0\1\220\121\0\1\221"+
        "\56\0\1\222\106\0\1\223\70\0\1\224\103\0\1\225"+
        "\102\0\1\226\77\0\1\227\66\0\1\230\1\231\104\0"+
        "\1\232\73\0\1\233\103\0\1\234\113\0\1\235\70\0"+
        "\1\236\65\0\1\237\102\0\1\240\77\0\1\241\74\0"+
        "\1\242\120\0\1\243\32\0\1\213\2\162\2\213\1\244"+
        "\47\213\1\162\21\213\1\162\1\57\2\0\1\57\1\60"+
        "\1\214\47\57\1\0\21\57\1\0\4\162\1\5\1\215"+
        "\72\162\21\0\1\245\73\0\1\246\107\0\1\247\106\0"+
        "\1\250\72\0\1\251\101\0\1\252\100\0\1\253\72\0"+
        "\1\254\107\0\1\255\67\0\1\256\77\0\1\257\107\0"+
        "\1\260\67\0\1\261\106\0\1\262\75\0\1\263\45\0"+
        "\1\213\2\162\1\213\1\60\1\244\47\213\1\162\21\213"+
        "\1\162\47\0\1\264\51\0\1\265\104\0\1\266\111\0"+
        "\1\267\104\0\1\270\75\0\1\271\75\0\1\272\72\0"+
        "\1\273\104\0\1\274\65\0\1\275\74\0\1\276\116\0"+
        "\1\277\54\0\1\300\66\0\1\301\117\0\1\302\101\0"+
        "\1\303\73\0\1\304\101\0\1\305\57\0\1\306\120\0"+
        "\1\307\103\0\1\310\113\0\1\311\101\0\1\312\56\0"+
        "\1\313\62\0\1\314\100\0\1\315\100\0\1\316\100\0"+
        "\1\317\127\0\1\320\46\0\1\321\101\0\1\322\130\0"+
        "\1\323\77\0\1\324\43\0\1\325\132\0\1\326\45\0"+
        "\1\327\61\0";

    private static int [] zzUnpackTrans() {
        int [] result = new int[9152];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
        int count = packed.charAt(i++);
        int value = packed.charAt(i++);
        value--;
        do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
        "Unkown internal scanner error",
        "Error: could not match input",
        "Error: pushback value was too large"
    };

    /**
    * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
    */
    private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
        "\2\0\1\11\1\1\1\11\1\1\2\11\1\1\1\11"+
        "\22\1\1\11\1\1\2\11\5\1\11\11\30\1\15\0"+
        "\2\11\12\0\6\11\10\1\4\11\2\0\1\1\2\0"+
        "\1\11\4\0\1\11\16\0\2\1\5\0\2\11\7\0"+
        "\3\11\2\0\1\11\2\0\1\11\1\1\5\0\1\11"+
        "\4\0\1\11\1\0\1\11\3\0\1\1\1\0\1\11"+
        "\1\0\3\11\1\0\1\11\1\0\1\11\2\0\2\11"+
        "\1\0\1\11\5\0\1\11\12\0\2\11";

    private static int [] zzUnpackAttribute() {
        int [] result = new int[215];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int [] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
        int count = packed.charAt(i++);
        int value = packed.charAt(i++);
        do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /** the input device */
    private java.io.Reader zzReader;

    /** the current state of the DFA */
    private int zzState;

    /** the current lexical state */
    private int zzLexicalState = YYINITIAL;

    /** this buffer contains the current text to be matched and is
        the source of the yytext() string */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /** the textposition at the last accepting state */
    private int zzMarkedPos;

    /** the current text position in the buffer */
    private int zzCurrentPos;

    /** startRead marks the beginning of the yytext() string in the buffer */
    private int zzStartRead;

    /** endRead marks the last character in the buffer, that has been read
        from input */
    private int zzEndRead;

    /** number of newlines encountered up to the start of the matched text */
    private int yyline;

    /** the number of characters up to the start of the matched text */
    private int yychar;

    /**
    * the number of characters from the last newline up to the start of the 
    * matched text
    */
    private int yycolumn;

    /** 
    * zzAtBOL == true <=> the scanner is currently at the beginning of a line
    */
    private boolean zzAtBOL = true;

    /** zzAtEOF == true <=> the scanner is at the EOF */
    private boolean zzAtEOF;

    /** denotes if the user-EOF-code has already been executed */
    private boolean zzEOFDone;

    /* user code: */
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


    /**
    * Creates a new scanner
    * There is also a java.io.InputStream version of this constructor.
    *
    * @param   in  the java.io.Reader to read input from.
    */
    Scanner(java.io.Reader in) {
        this.zzReader = in;
    }

    /**
    * Creates a new scanner.
    * There is also java.io.Reader version of this constructor.
    *
    * @param   in  the java.io.Inputstream to read input from.
    */
    Scanner(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
    }

    /** 
    * Unpacks the compressed character translation table.
    *
    * @param packed   the packed character translation table
    * @return         the unpacked character translation table
    */
    private static char [] zzUnpackCMap(String packed) {
        char [] map = new char[0x10000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 2246) {
        int  count = packed.charAt(i++);
        char value = packed.charAt(i++);
        do map[j++] = value; while (--count > 0);
        }
        return map;
    }


    /**
    * Refills the input buffer.
    *
    * @return      <code>false</code>, iff there was new input.
    * 
    * @exception   java.io.IOException  if any I/O-Error occurs
    */
    private boolean zzRefill() throws java.io.IOException {

        /* first: make room (if you can) */
        if (zzStartRead > 0) {
        System.arraycopy(zzBuffer, zzStartRead,
                        zzBuffer, 0,
                        zzEndRead-zzStartRead);

        /* translate stored positions */
        zzEndRead-= zzStartRead;
        zzCurrentPos-= zzStartRead;
        zzMarkedPos-= zzStartRead;
        zzStartRead = 0;
        }

        /* is the buffer big enough? */
        if (zzCurrentPos >= zzBuffer.length) {
        /* if not: blow it up */
        char newBuffer[] = new char[zzCurrentPos*2];
        System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
        zzBuffer = newBuffer;
        }

        /* finally: fill the buffer with new input */
        int numRead = zzReader.read(zzBuffer, zzEndRead,
                                                zzBuffer.length-zzEndRead);

        if (numRead > 0) {
        zzEndRead+= numRead;
        return false;
        }
        // unlikely but not impossible: read 0 characters, but not at end of stream    
        if (numRead == 0) {
        int c = zzReader.read();
        if (c == -1) {
            return true;
        } else {
            zzBuffer[zzEndRead++] = (char) c;
            return false;
        }     
        }

    // numRead < 0
        return true;
    }


    /**
    * Closes the input stream.
    */
    public final void yyclose() throws java.io.IOException {
        zzAtEOF = true;            /* indicate end of file */
        zzEndRead = zzStartRead;  /* invalidate buffer    */

        if (zzReader != null)
        zzReader.close();
    }


    /**
    * Resets the scanner to read from a new input stream.
    * Does not close the old reader.
    *
    * All internal variables are reset, the old input stream 
    * <b>cannot</b> be reused (internal buffer is discarded and lost).
    * Lexical state is set to <tt>ZZ_INITIAL</tt>.
    *
    * @param reader   the new input stream 
    */
    public final void yyreset(java.io.Reader reader) {
        zzReader = reader;
        zzAtBOL  = true;
        zzAtEOF  = false;
        zzEOFDone = false;
        zzEndRead = zzStartRead = 0;
        zzCurrentPos = zzMarkedPos = 0;
        yyline = yychar = yycolumn = 0;
        zzLexicalState = YYINITIAL;
    }


    /**
    * Returns the current lexical state.
    */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
    * Enters a new lexical state
    *
    * @param newState the new lexical state
    */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
    * Returns the text matched by the current regular expression.
    */
    public final String yytext() {
        return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
    }


    /**
    * Returns the character at position <tt>pos</tt> from the 
    * matched text. 
    * 
    * It is equivalent to yytext().charAt(pos), but faster
    *
    * @param pos the position of the character to fetch. 
    *            A value from 0 to yylength()-1.
    *
    * @return the character at position pos
    */
    public final char yycharat(int pos) {
        return zzBuffer[zzStartRead+pos];
    }


    /**
    * Returns the length of the matched text region.
    */
    public final int yylength() {
        return zzMarkedPos-zzStartRead;
    }


    /**
    * Reports an error that occured while scanning.
    *
    * In a wellformed scanner (no or only correct usage of 
    * yypushback(int) and a match-all fallback rule) this method 
    * will only be called with things that "Can't Possibly Happen".
    * If this method is called, something is seriously wrong
    * (e.g. a JFlex bug producing a faulty scanner etc.).
    *
    * Usual syntax/scanner level error handling should be done
    * in error fallback rules.
    *
    * @param   errorCode  the code of the errormessage to display
    */
    private void zzScanError(int errorCode) {
        String message;
        try {
        message = ZZ_ERROR_MSG[errorCode];
        }
        catch (ArrayIndexOutOfBoundsException e) {
        message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    } 


    /**
    * Pushes the specified amount of characters back into the input stream.
    *
    * They will be read again by then next call of the scanning method
    *
    * @param number  the number of characters to be read again.
    *                This number must not be greater than yylength()!
    */
    public void yypushback(int number)  {
        if ( number > yylength() )
        zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
    * Resumes scanning until the next regular expression is matched,
    * the end of input is encountered or an I/O-Error occurs.
    *
    * @return      the next token
    * @exception   java.io.IOException  if any I/O-Error occurs
    */
    public Symbol nextToken() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char [] zzBufferL = zzBuffer;
        char [] zzCMapL = ZZ_CMAP;

        int [] zzTransL = ZZ_TRANS;
        int [] zzRowMapL = ZZ_ROWMAP;
        int [] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
        zzMarkedPosL = zzMarkedPos;

        boolean zzR = false;
        for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                                zzCurrentPosL++) {
            switch (zzBufferL[zzCurrentPosL]) {
            case '\u000B':
            case '\u000C':
            case '\u0085':
            case '\u2028':
            case '\u2029':
            yyline++;
            yycolumn = 0;
            zzR = false;
            break;
            case '\r':
            yyline++;
            yycolumn = 0;
            zzR = true;
            break;
            case '\n':
            if (zzR)
                zzR = false;
            else {
                yyline++;
                yycolumn = 0;
            }
            break;
            default:
            zzR = false;
            yycolumn++;
            }
        }

        if (zzR) {
            // peek one character ahead if it is \n (if we have counted one line too much)
            boolean zzPeek;
            if (zzMarkedPosL < zzEndReadL)
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
            else if (zzAtEOF)
            zzPeek = false;
            else {
            boolean eof = zzRefill();
            zzEndReadL = zzEndRead;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            if (eof) 
                zzPeek = false;
            else 
                zzPeek = zzBufferL[zzMarkedPosL] == '\n';
            }
            if (zzPeek) yyline--;
        }
        zzAction = -1;

        zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

        zzState = ZZ_LEXSTATE[zzLexicalState];


        zzForAction: {
            while (true) {

            if (zzCurrentPosL < zzEndReadL)
                zzInput = zzBufferL[zzCurrentPosL++];
            else if (zzAtEOF) {
                zzInput = YYEOF;
                break zzForAction;
            }
            else {
                // store back cached positions
                zzCurrentPos  = zzCurrentPosL;
                zzMarkedPos   = zzMarkedPosL;
                boolean eof = zzRefill();
                // get translated positions and possibly new buffer
                zzCurrentPosL  = zzCurrentPos;
                zzMarkedPosL   = zzMarkedPos;
                zzBufferL      = zzBuffer;
                zzEndReadL     = zzEndRead;
                if (eof) {
                zzInput = YYEOF;
                break zzForAction;
                }
                else {
                zzInput = zzBufferL[zzCurrentPosL++];
                }
            }
            int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
            if (zzNext == -1) break zzForAction;
            zzState = zzNext;

            int zzAttributes = zzAttrL[zzState];
            if ( (zzAttributes & 1) == 1 ) {
                zzAction = zzState;
                zzMarkedPosL = zzCurrentPosL;
                if ( (zzAttributes & 8) == 8 ) break zzForAction;
            }

            }
        }

        // store back cached position
        zzMarkedPos = zzMarkedPosL;

        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
            case 2: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [129] { /* ignore */ }");
            { /* ignore */
            }
            case 63: break;
            case 61: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [64] { return symbol(sym.INTEGER_LITERAL); }");
            { return symbol(sym.INTEGER_LITERAL);
            }
            case 64: break;
            case 41: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [75] { return symbol(sym.Exit); }");
            { return symbol(sym.Exit);
            }
            case 65: break;
            case 8: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [91] { return symbol(sym.Igual_Asig); }");
            { return symbol(sym.Igual_Asig);
            }
            case 66: break;
            case 51: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [63] { return symbol(sym.Lenght); }");
            { return symbol(sym.Lenght);
            }
            case 67: break;
            case 42: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [56] { return symbol(sym.True); }");
            { return symbol(sym.True);
            }
            case 68: break;
            case 46: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [72] { return symbol(sym.Void); }");
            { return symbol(sym.Void);
            }
            case 69: break;
            case 58: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [62] { return symbol(sym.Extends); }");
            { return symbol(sym.Extends);
            }
            case 70: break;
            case 16: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [116] { return symbol(sym.Corchete_on); }");
            { return symbol(sym.Corchete_on);
            }
            case 71: break;
            case 45: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [59] { return symbol(sym.Main); }");
            { return symbol(sym.Main);
            }
            case 72: break;
            case 34: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [136] { string.append(\'\\t\'); }");
            { string.append('\t');
            }
            case 73: break;
            case 15: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [115] { return symbol(sym.PARENT_off); }");
            { return symbol(sym.PARENT_off);
            }
            case 74: break;
            case 48: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [57] { return symbol(sym.False); }");
            { return symbol(sym.False);
            }
            case 75: break;
            case 40: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [54] { return symbol(sym.Else); }");
            { return symbol(sym.Else);
            }
            case 76: break;
            case 19: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [119] { return symbol(sym.Llave_off); }");
            { return symbol(sym.Llave_off);
            }
            case 77: break;
            case 14: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [114] { return symbol(sym.PARENT_on); }");
            { return symbol(sym.PARENT_on);
            }
            case 78: break;
            case 7: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [87] { string.setLength(0); yybegin(STRING); }");
            { string.setLength(0); yybegin(STRING);
            }
            case 79: break;
            case 37: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [50] { return symbol(sym.INT); }");
            { return symbol(sym.INT);
            }
            case 80: break;
            case 22: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [122] { return symbol(sym.Punto); }");
            { return symbol(sym.Punto);
            }
            case 81: break;
            case 59: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [68] { return symbol(sym.Println); }");
            { return symbol(sym.Println);
            }
            case 82: break;
            case 10: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [95] { return symbol(sym.Resta); }");
            { return symbol(sym.Resta);
            }
            case 83: break;
            case 47: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [53] { return symbol(sym.Class); }");
            { return symbol(sym.Class);
            }
            case 84: break;
            case 39: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [66] { return symbol(sym.New); }");
            { return symbol(sym.New);
            }
            case 85: break;
            case 29: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [100] { return symbol(sym.AND); }");
            { return symbol(sym.AND);
            }
            case 86: break;
            case 56: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [60] { return symbol(sym.Public); }");
            { return symbol(sym.Public);
            }
            case 87: break;
            case 43: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [71] { return symbol(sym.This); }");
            { return symbol(sym.This);
            }
            case 88: break;
            case 53: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [70] { return symbol(sym.System); }");
            { return symbol(sym.System);
            }
            case 89: break;
            case 24: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [141] { string.append(\'\\\\\'); }");
            { string.append('\\');
            }
            case 90: break;
            case 35: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [139] { string.append(\'\\r\'); }");
            { string.append('\r');
            }
            case 91: break;
            case 32: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [110] { return symbol(sym.Mayor_Igual); }");
            { return symbol(sym.Mayor_Igual);
            }
            case 92: break;
            case 20: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [120] { return symbol(sym.DOTCOMMA); }");
            { return symbol(sym.DOTCOMMA);
            }
            case 93: break;
            case 1: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [145] { System.out.println(\"Error caracter inválido: <\" + yytext() + \"> en fila: \" + yyline + \" columna: \" + yycolumn );"+ZZ_NL+"\t\t\t\t   /*throw new Error(\"Caracter no permitido <\"+"+ZZ_NL+"                                                    yytext()+\">\");*/ }");
            { System.out.println("Error caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );
        /*throw new Error("Caracter no permitido <"+
                                                        yytext()+">");*/
            }
            case 94: break;
            case 5: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [82] { return symbol(sym.ID,yytext()); }");
            { return symbol(sym.ID,yytext());
            }
            case 95: break;
            case 13: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [108] { return symbol(sym.Mayor); }");
            { return symbol(sym.Mayor);
            }
            case 96: break;
            case 36: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [140] { string.append(\'\\\"\'); }");
            { string.append('\"');
            }
            case 97: break;
            case 44: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [77] { return symbol(sym.Read); }");
            { return symbol(sym.Read);
            }
            case 98: break;
            case 6: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [86] { return symbol(sym.NUM); }");
            { return symbol(sym.NUM);
            }
            case 99: break;
            case 4: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [92] { return symbol(sym.MULT); }");
            { return symbol(sym.MULT);
            }
            case 100: break;
            case 12: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [107] { return symbol(sym.Menor); }");
            { return symbol(sym.Menor);
            }
            case 101: break;
            case 55: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [69] { return symbol(sym.Return); }");
            { return symbol(sym.Return);
            }
            case 102: break;
            case 30: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [105] { return symbol(sym.Diferencia); }");
            { return symbol(sym.Diferencia);
            }
            case 103: break;
            case 28: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [99] { return symbol(sym.OR); }");
            { return symbol(sym.OR);
            }
            case 104: break;
            case 21: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [121] { return symbol(sym.COMA); }");
            { return symbol(sym.COMA);
            }
            case 105: break;
            case 17: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [117] { return symbol(sym.Corchete_off); }");
            { return symbol(sym.Corchete_off);
            }
            case 106: break;
            case 31: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [109] { return symbol(sym.Menor_Igual); }");
            { return symbol(sym.Menor_Igual);
            }
            case 107: break;
            case 62: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [65] { return symbol(sym.STRING_CONSTANT); }");
            { return symbol(sym.STRING_CONSTANT);
            }
            case 108: break;
            case 33: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [137] { string.append(\'\\n\'); }");
            { string.append('\n');
            }
            case 109: break;
            case 3: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [93] { return symbol(sym.Div); }");
            { return symbol(sym.Div);
            }
            case 110: break;
            case 18: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [118] { return symbol(sym.Llave_on); }");
            { return symbol(sym.Llave_on);
            }
            case 111: break;
            case 49: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [58] { return symbol(sym.While); }");
            { return symbol(sym.While);
            }
            case 112: break;
            case 52: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [61] { return symbol(sym.Static); }");
            { return symbol(sym.Static);
            }
            case 113: break;
            case 27: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [106] { return symbol(sym.Igual_Comp); }");
            { return symbol(sym.Igual_Comp);
            }
            case 114: break;
            case 57: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [52] { return symbol(sym.BOOLEAN); }");
            { return symbol(sym.BOOLEAN);
            }
            case 115: break;
            case 11: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [101] { return symbol(sym.Negacion); }");
            { return symbol(sym.Negacion);
            }
            case 116: break;
            case 54: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [73] { return symbol(sym.Import); }");
            { return symbol(sym.Import);
            }
            case 117: break;
            case 26: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [55] { return symbol(sym.If); }");
            { return symbol(sym.If);
            }
            case 118: break;
            case 50: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [51] { return symbol(sym.STRING); }");
            { return symbol(sym.STRING);
            }
            case 119: break;
            case 38: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [67] { return symbol(sym.Out); }");
            { return symbol(sym.Out);
            }
            case 120: break;
            case 60: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [74] { return symbol(sym.Implements); }");
            { return symbol(sym.Implements);
            }
            case 121: break;
            case 9: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [94] { return symbol(sym.Suma); }");
            { return symbol(sym.Suma);
            }
            case 122: break;
            case 25: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [76] { return symbol(sym.In); }");
            { return symbol(sym.In);
            }
            case 123: break;
            case 23: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
            System.out.println("action [135] { string.append( yytext() ); }");
            { string.append( yytext() );
            }
            case 124: break;
            default: 
            if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                zzAtEOF = true;
                return null;
            } 
            else {
                zzScanError(ZZ_NO_MATCH);
            }
        }
        }
    }

    /**
    * Runs the scanner on input files.
    *
    * This main method is the debugging routine for the scanner.
    * It prints debugging information about each returned token to
    * System.out until the end of file is reached, or an error occured.
    *
    * @param argv   the command line, contains the filenames to run
    *               the scanner on.
    */
    public static void main(String argv[]) {
        if (argv.length == 0) {
            System.out.println("Usage : java Scanner <inputfile>");
        } else {
            for (int i = 0; i < argv.length; i++) {
                Scanner scanner = null;
                try {
                scanner = new Scanner( new java.io.FileReader(argv[i]) );
                do {
                    System.out.println(scanner.nextToken());
                } while (!scanner.zzAtEOF);

                }
                catch (java.io.FileNotFoundException e) {
                System.out.println("File not found : \""+argv[i]+"\"");
                }
                catch (java.io.IOException e) {
                System.out.println("IO error scanning file \""+argv[i]+"\"");
                System.out.println(e);
                }
                catch (Exception e) {
                System.out.println("Unexpected exception:");
                e.printStackTrace();
                }
            }
        }
    }
    
    public static void analisis (String argv[]){
        if (argv.length == 0) {
            System.out.println("Usage : java Scanner <inputfile>");
        } else {
            for (int i = 0; i < argv.length; i++) {
                Scanner scanner = null;
                try {
                scanner = new Scanner( new java.io.FileReader(argv[i]) );
                do {
                    System.out.println(scanner.nextToken());
                } while (!scanner.zzAtEOF);

                }
                catch (java.io.FileNotFoundException e) {
                System.out.println("File not found : \""+argv[i]+"\"");
                }
                catch (java.io.IOException e) {
                System.out.println("IO error scanning file \""+argv[i]+"\"");
                System.out.println(e);
                }
                catch (Exception e) {
                System.out.println("Unexpected exception:");
                e.printStackTrace();
                }
            }
        }
    
    }
    
    
    
}

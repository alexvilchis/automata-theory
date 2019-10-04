/* The following code was generated by JFlex 1.4.3 on 5/9/19 2:26 PM */

package lexer;
import static lexer.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/9/19 2:26 PM from the specification file
 * <tt>src/lexer/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\36\1\57\1\4\3\0"+
    "\1\55\1\0\1\54\1\53\1\42\1\40\1\51\1\41\1\37\1\34"+
    "\12\2\1\52\1\46\1\45\1\43\1\44\2\0\1\13\1\27\1\14"+
    "\1\33\1\20\1\17\1\11\1\30\1\15\1\31\1\1\1\22\1\24"+
    "\1\16\1\10\1\6\1\1\1\7\1\23\1\21\1\32\1\12\1\1"+
    "\1\25\1\26\1\1\1\50\1\35\1\47\3\0\1\13\1\27\1\14"+
    "\1\33\1\20\1\17\1\11\1\30\1\15\1\31\1\1\1\22\1\24"+
    "\1\16\1\10\1\6\1\1\1\7\1\23\1\21\1\32\1\12\1\1"+
    "\1\25\1\26\1\1\1\0\1\56\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\14\2"+
    "\1\6\1\7\1\4\1\5\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\2\1\1\25\1\0\1\1\2\2\3\1\1\26"+
    "\1\1\2\2\1\27\12\2\1\30\4\2\3\4\3\1"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\3\2\1\37"+
    "\1\0\1\26\3\2\1\40\1\2\1\41\1\2\1\42"+
    "\15\2\1\0\1\26\1\0\1\43\1\44\1\2\1\45"+
    "\1\46\5\2\1\47\1\50\2\2\1\51\3\2\2\26"+
    "\10\2\1\52\1\2\1\53\1\54\1\55\3\2\1\56"+
    "\1\2\2\1\1\57\1\60\1\1\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450"+
    "\0\u0480\0\u04b0\0\60\0\u04e0\0\u0510\0\60\0\60\0\60"+
    "\0\60\0\u0540\0\60\0\60\0\u0570\0\u05a0\0\60\0\60"+
    "\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\360\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0600\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u05d0\0\u0450\0\u0480\0\u04b0"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\u0ab0\0\u0ae0"+
    "\0\u0b10\0\u0690\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0ab0"+
    "\0\u0c30\0\u0ab0\0\u0c60\0\u0ab0\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20"+
    "\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0"+
    "\0\u0ed0\0\u0f00\0\u0b40\0\u0f30\0\u0e70\0\u0e70\0\u0f60\0\u0e70"+
    "\0\u0e70\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u0e70\0\u0e70"+
    "\0\u1080\0\u10b0\0\u0e70\0\u10e0\0\u1110\0\u1140\0\u05d0\0\u0f00"+
    "\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260\0\u1290\0\u12c0"+
    "\0\u1110\0\u12f0\0\u12f0\0\u12f0\0\u12f0\0\u1320\0\u1350\0\u1380"+
    "\0\u12f0\0\u13b0\0\u12f0\0\u13e0\0\u12f0\0\u12f0\0\u1410\0\u12f0"+
    "\0\u12f0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\3\1\15\1\3\1\16"+
    "\1\17\1\3\1\20\1\21\1\22\3\3\1\23\3\3"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\4\50\1\51\1\0\30\50"+
    "\1\0\22\50\1\52\1\53\1\50\1\51\1\0\26\52"+
    "\2\50\1\0\1\54\21\50\1\54\1\4\1\50\1\51"+
    "\1\0\26\54\2\50\1\0\1\55\23\50\1\5\1\51"+
    "\1\7\30\50\1\7\21\50\4\56\1\57\1\0\27\56"+
    "\1\60\22\56\3\0\1\7\1\0\1\7\30\0\1\7"+
    "\21\0\1\50\1\52\1\53\1\50\1\51\1\0\1\52"+
    "\1\61\24\52\2\50\1\0\1\54\21\50\1\52\1\53"+
    "\1\50\1\51\1\0\12\52\1\62\13\52\2\50\1\0"+
    "\1\54\21\50\1\52\1\53\1\50\1\51\1\0\1\52"+
    "\1\63\24\52\2\50\1\0\1\54\21\50\1\52\1\53"+
    "\1\50\1\51\1\0\5\52\1\64\4\52\1\65\13\52"+
    "\2\50\1\0\1\54\21\50\1\52\1\53\1\50\1\51"+
    "\1\0\10\52\1\66\15\52\2\50\1\0\1\54\21\50"+
    "\1\52\1\53\1\50\1\51\1\0\10\52\1\67\15\52"+
    "\2\50\1\0\1\54\21\50\1\52\1\53\1\50\1\51"+
    "\1\0\7\52\1\70\16\52\2\50\1\0\1\54\21\50"+
    "\1\52\1\53\1\50\1\51\1\0\10\52\1\71\4\52"+
    "\1\72\5\52\1\73\2\52\2\50\1\0\1\54\21\50"+
    "\1\52\1\53\1\50\1\51\1\0\7\52\1\74\2\52"+
    "\1\75\13\52\2\50\1\0\1\54\21\50\1\52\1\53"+
    "\1\50\1\51\1\0\7\52\1\76\3\52\1\77\12\52"+
    "\2\50\1\0\1\54\21\50\1\52\1\53\1\50\1\51"+
    "\1\0\7\52\1\100\16\52\2\50\1\0\1\54\21\50"+
    "\1\52\1\53\1\50\1\51\1\0\2\52\1\101\2\52"+
    "\1\102\20\52\2\50\1\0\1\54\24\50\1\51\1\0"+
    "\26\50\1\103\1\50\1\0\21\50\5\25\1\0\52\25"+
    "\3\0\1\7\1\0\1\7\30\0\1\7\1\104\20\0"+
    "\1\50\2\54\1\50\1\51\1\0\26\54\2\50\1\105"+
    "\1\54\24\50\1\51\1\0\30\50\1\0\1\50\1\106"+
    "\23\50\1\51\1\0\30\50\1\0\2\50\1\107\22\50"+
    "\1\51\1\0\30\50\1\0\3\50\1\110\21\50\1\51"+
    "\1\0\30\50\1\0\4\50\1\111\20\50\1\51\1\0"+
    "\30\50\1\0\4\50\1\112\1\113\17\50\1\51\1\0"+
    "\30\50\1\0\4\50\1\114\20\50\1\51\1\0\30\50"+
    "\1\0\16\50\1\115\6\50\1\51\1\0\30\50\1\0"+
    "\17\50\1\116\1\50\60\0\1\50\1\117\1\120\1\50"+
    "\1\51\1\0\26\117\2\50\1\0\1\54\21\50\1\121"+
    "\1\120\1\50\1\51\1\0\26\121\2\50\1\0\1\54"+
    "\21\50\2\54\1\50\1\51\1\0\26\54\2\50\1\0"+
    "\1\54\21\50\1\54\1\122\1\50\1\51\1\0\26\54"+
    "\2\50\1\0\1\54\20\50\4\0\1\123\53\0\4\56"+
    "\1\124\1\0\27\56\1\60\22\56\1\50\1\117\1\120"+
    "\1\50\1\51\1\0\2\117\1\125\23\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\1\126"+
    "\4\117\1\127\20\117\2\50\1\0\1\54\21\50\1\117"+
    "\1\120\1\50\1\51\1\0\1\117\1\130\24\117\2\50"+
    "\1\0\1\54\21\50\1\117\1\120\1\50\1\51\1\0"+
    "\17\117\1\131\6\117\2\50\1\0\1\54\21\50\1\117"+
    "\1\120\1\50\1\51\1\0\25\117\1\132\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\7\117"+
    "\1\133\16\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\10\117\1\134\15\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\13\117"+
    "\1\135\12\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\6\117\1\136\17\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\12\117"+
    "\1\137\13\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\16\117\1\140\7\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\12\117"+
    "\1\141\13\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\10\117\1\142\15\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\1\117"+
    "\1\143\24\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\12\117\1\144\13\117\2\50\1\0"+
    "\1\54\21\50\1\117\1\120\1\50\1\51\1\0\14\117"+
    "\1\145\11\117\2\50\1\0\1\54\21\50\1\117\1\120"+
    "\1\50\1\51\1\0\15\117\1\146\10\117\2\50\1\0"+
    "\1\54\20\50\5\103\1\0\52\103\36\0\1\105\21\0"+
    "\1\50\1\147\1\150\1\50\1\51\1\0\26\147\2\50"+
    "\1\0\1\54\21\50\1\151\1\150\1\50\1\51\1\0"+
    "\26\151\2\50\1\0\1\54\21\50\2\151\1\50\1\51"+
    "\1\0\26\151\2\50\1\0\21\50\4\123\1\57\1\0"+
    "\52\123\4\152\1\153\1\0\27\152\1\154\22\152\1\50"+
    "\1\147\1\150\1\50\1\51\1\0\3\147\1\155\2\147"+
    "\1\156\17\147\2\50\1\0\1\54\21\50\1\147\1\150"+
    "\1\50\1\51\1\0\7\147\1\157\16\147\2\50\1\0"+
    "\1\54\21\50\1\147\1\150\1\50\1\51\1\0\14\147"+
    "\1\160\11\147\2\50\1\0\1\54\21\50\1\147\1\150"+
    "\1\50\1\51\1\0\20\147\1\161\5\147\2\50\1\0"+
    "\1\54\21\50\1\147\1\150\1\50\1\51\1\0\6\147"+
    "\1\162\17\147\2\50\1\0\1\54\21\50\1\147\1\150"+
    "\1\50\1\51\1\0\12\147\1\163\13\147\2\50\1\0"+
    "\1\54\21\50\1\147\1\150\1\50\1\51\1\0\1\147"+
    "\1\164\24\147\2\50\1\0\1\54\21\50\1\147\1\150"+
    "\1\50\1\51\1\0\6\147\1\165\17\147\2\50\1\0"+
    "\1\54\21\50\1\147\1\150\1\50\1\51\1\0\1\166"+
    "\25\147\2\50\1\0\1\54\21\50\1\147\1\150\1\50"+
    "\1\51\1\0\1\147\1\167\24\147\2\50\1\0\1\54"+
    "\21\50\1\147\1\150\1\50\1\51\1\0\2\147\1\170"+
    "\23\147\2\50\1\0\1\54\21\50\1\147\1\150\1\50"+
    "\1\51\1\0\7\147\1\171\16\147\2\50\1\0\1\54"+
    "\21\50\1\147\1\150\1\50\1\51\1\0\10\147\1\172"+
    "\15\147\2\50\1\0\1\54\21\50\1\147\1\150\1\50"+
    "\1\51\1\0\5\147\1\173\20\147\2\50\1\0\1\54"+
    "\21\50\1\147\1\150\1\50\1\51\1\0\13\147\1\174"+
    "\12\147\2\50\1\0\1\54\21\50\2\175\1\50\1\51"+
    "\1\0\26\175\2\50\1\0\1\54\21\50\1\176\1\175"+
    "\1\50\1\51\1\0\26\176\2\50\1\0\1\54\21\50"+
    "\2\176\1\50\1\51\1\0\26\176\2\50\1\0\21\50"+
    "\4\152\1\177\1\0\27\152\1\154\26\152\1\200\1\0"+
    "\27\152\1\154\22\152\1\50\2\175\1\50\1\51\1\0"+
    "\13\175\1\201\12\175\2\50\1\0\1\54\21\50\2\175"+
    "\1\50\1\51\1\0\7\175\1\202\16\175\2\50\1\0"+
    "\1\54\21\50\2\175\1\50\1\51\1\0\1\175\1\203"+
    "\24\175\2\50\1\0\1\54\21\50\2\175\1\50\1\51"+
    "\1\0\7\175\1\204\16\175\2\50\1\0\1\54\21\50"+
    "\2\175\1\50\1\51\1\0\24\175\1\205\1\175\2\50"+
    "\1\0\1\54\21\50\2\175\1\50\1\51\1\0\7\175"+
    "\1\206\16\175\2\50\1\0\1\54\21\50\2\175\1\50"+
    "\1\51\1\0\10\175\1\207\15\175\2\50\1\0\1\54"+
    "\21\50\2\175\1\50\1\51\1\0\13\175\1\210\12\175"+
    "\2\50\1\0\1\54\21\50\2\175\1\50\1\51\1\0"+
    "\5\175\1\211\20\175\2\50\1\0\1\54\21\50\2\212"+
    "\1\50\1\51\1\0\26\212\2\50\1\0\1\54\21\50"+
    "\2\212\1\50\1\51\1\0\26\212\2\50\1\0\22\50"+
    "\2\212\1\50\1\51\1\0\12\212\1\213\13\212\2\50"+
    "\1\0\1\54\21\50\2\212\1\50\1\51\1\0\2\212"+
    "\1\214\23\212\2\50\1\0\1\54\21\50\2\212\1\50"+
    "\1\51\1\0\2\212\1\215\23\212\2\50\1\0\1\54"+
    "\21\50\2\212\1\50\1\51\1\0\21\212\1\216\4\212"+
    "\2\50\1\0\1\54\21\50\2\212\1\50\1\51\1\0"+
    "\13\212\1\217\12\212\2\50\1\0\1\54\21\50\2\212"+
    "\1\50\1\51\1\0\5\212\1\220\20\212\2\50\1\0"+
    "\1\54\21\50\2\212\1\50\1\51\1\0\3\212\1\221"+
    "\22\212\2\50\1\0\1\54\21\50\2\212\1\50\1\51"+
    "\1\0\1\212\1\222\24\212\2\50\1\0\1\54\20\50"+
    "\4\223\1\51\1\0\30\223\1\0\25\223\1\51\1\0"+
    "\7\223\1\224\20\223\1\0\25\223\1\51\1\0\5\223"+
    "\1\225\22\223\1\0\25\223\1\51\1\0\1\223\1\226"+
    "\26\223\1\0\25\223\1\51\1\0\5\223\1\227\22\223"+
    "\1\0\25\223\1\51\1\0\1\223\1\230\26\223\1\0"+
    "\25\223\1\51\1\0\15\223\1\231\12\223\1\0\21\223";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5184];
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
    "\1\0\46\1\1\0\1\11\33\1\1\11\15\1\1\0"+
    "\26\1\1\0\1\1\1\0\22\1\1\11\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
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
    public int getLine() {
    return yyline;
    }
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
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
    while (i < 172) {
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
  public Token yylex() throws java.io.IOException {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
          { lexeme=yytext(); return Identificador;
          }
        case 51: break;
        case 13: 
          { lexeme=yytext(); return Menor;
          }
        case 52: break;
        case 25: 
          { lexeme=yytext(); return MayorIgual;
          }
        case 53: break;
        case 14: 
          { lexeme=yytext(); return PuntoYComa;
          }
        case 54: break;
        case 27: 
          { lexeme=yytext(); return Diferente;
          }
        case 55: break;
        case 44: 
          { lexeme=yytext(); return Inicio;
          }
        case 56: break;
        case 40: 
          { lexeme=yytext(); return SiNo;
          }
        case 57: break;
        case 50: 
          { lexeme=yytext(); return Mientras;
          }
        case 58: break;
        case 18: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 59: break;
        case 15: 
          { lexeme=yytext(); return CierraCorchete;
          }
        case 60: break;
        case 26: 
          { lexeme=yytext(); return MenorIgual;
          }
        case 61: break;
        case 46: 
          { lexeme=yytext(); return String;
          }
        case 62: break;
        case 16: 
          { lexeme=yytext(); return AbreCorchete;
          }
        case 63: break;
        case 23: 
          { lexeme=yytext(); return Or;
          }
        case 64: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 65: break;
        case 49: 
          { lexeme=yytext(); return Escribir;
          }
        case 66: break;
        case 7: 
          { lexeme=yytext(); return Comentario;
          }
        case 67: break;
        case 35: 
          { lexeme=yytext(); return Prog;
          }
        case 68: break;
        case 5: 
          { /* Ignore */
          }
        case 69: break;
        case 20: 
          { lexeme=yytext(); return AbreParentesis;
          }
        case 70: break;
        case 32: 
          { lexeme=yytext(); return Var;
          }
        case 71: break;
        case 38: 
          { lexeme=yytext(); return Vexy;
          }
        case 72: break;
        case 37: 
          { lexeme=yytext(); return Real;
          }
        case 73: break;
        case 21: 
          { lexeme=yytext(); return Negacion;
          }
        case 74: break;
        case 31: 
          { lexeme=yytext(); return Reales;
          }
        case 75: break;
        case 22: 
          { lexeme=yytext(); return Cadena;
          }
        case 76: break;
        case 42: 
          { lexeme=yytext(); return Hasta;
          }
        case 77: break;
        case 29: 
          { lexeme=yytext(); return LogicoAND;
          }
        case 78: break;
        case 3: 
          { lexeme=yytext(); return Enteros;
          }
        case 79: break;
        case 41: 
          { lexeme=yytext(); return Hola;
          }
        case 80: break;
        case 9: 
          { lexeme=yytext(); return Resta;
          }
        case 81: break;
        case 12: 
          { lexeme=yytext(); return Mayor;
          }
        case 82: break;
        case 36: 
          { lexeme=yytext(); return Proc;
          }
        case 83: break;
        case 39: 
          { lexeme=yytext(); return Leer;
          }
        case 84: break;
        case 48: 
          { lexeme=yytext(); return Limpiar;
          }
        case 85: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 86: break;
        case 24: 
          { lexeme=yytext(); return Si;
          }
        case 87: break;
        case 10: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 88: break;
        case 19: 
          { lexeme=yytext(); return CierraParentesis;
          }
        case 89: break;
        case 45: 
          { lexeme=yytext(); return Entero;
          }
        case 90: break;
        case 30: 
          { lexeme=yytext(); return LogicoOR;
          }
        case 91: break;
        case 33: 
          { lexeme=yytext(); return And;
          }
        case 92: break;
        case 28: 
          { lexeme=yytext(); return DosPuntosIgual;
          }
        case 93: break;
        case 11: 
          { lexeme=yytext(); return Igual;
          }
        case 94: break;
        case 17: 
          { lexeme=yytext(); return Coma;
          }
        case 95: break;
        case 47: 
          { lexeme=yytext(); return Ejecuta;
          }
        case 96: break;
        case 4: 
          { /*Ignore*/
          }
        case 97: break;
        case 34: 
          { lexeme=yytext(); return Final;
          }
        case 98: break;
        case 8: 
          { lexeme=yytext(); return Suma;
          }
        case 99: break;
        case 43: 
          { lexeme=yytext(); return Repite;
          }
        case 100: break;
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


}

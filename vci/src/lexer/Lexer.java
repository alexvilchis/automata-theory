/* The following code was generated by JFlex 1.4.3 on 10/11/19, 8:35 AM */

package lexer;
import static lexer.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/11/19, 8:35 AM from the specification file
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
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\20\1\37\1\4\3\0"+
    "\1\35\1\0\1\34\1\33\1\24\1\22\1\31\1\23\1\21\1\16"+
    "\12\2\1\32\1\30\1\27\1\25\1\26\2\0\1\13\2\1\1\15"+
    "\1\6\6\1\1\14\1\1\1\7\1\12\2\1\1\11\1\1\1\10"+
    "\6\1\1\0\1\17\4\0\1\13\2\1\1\15\1\6\6\1\1\14"+
    "\1\1\1\7\1\12\2\1\1\11\1\1\1\10\6\1\1\0\1\36"+
    "\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\4\2"+
    "\1\6\1\7\1\4\1\5\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\2\1"+
    "\1\23\1\0\1\1\2\2\3\1\1\24\1\1\2\2"+
    "\1\25\1\2\3\4\3\1\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\3\2\1\34\1\0\1\24\2\2\1\35"+
    "\3\2\1\0\1\24\1\0\1\2\1\36\2\2\2\24"+
    "\2\2\1\37\1\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
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
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0\0\u01c0\0\u01e0"+
    "\0\u0200\0\u0220\0\u0240\0\u0260\0\u0280\0\40\0\40\0\40"+
    "\0\40\0\40\0\u02a0\0\u02c0\0\40\0\40\0\u02e0\0\u0300"+
    "\0\u0320\0\u0340\0\u0360\0\240\0\u0380\0\u03a0\0\u03c0\0\u03e0"+
    "\0\u0300\0\u0400\0\u0420\0\u0440\0\u02e0\0\u01e0\0\u0200\0\u0220"+
    "\0\40\0\40\0\40\0\40\0\40\0\40\0\u0460\0\u0480"+
    "\0\u04a0\0\u0360\0\u04c0\0\u04e0\0\u0500\0\u0520\0\u0460\0\u0540"+
    "\0\u0560\0\u0580\0\u05a0\0\u04c0\0\u05c0\0\u05e0\0\u0540\0\u0600"+
    "\0\u0620\0\u02e0\0\u05a0\0\u0640\0\u0660\0\u0660\0\u0680";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\3"+
    "\1\11\1\12\1\13\2\3\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\4\36\1\37"+
    "\1\0\12\36\1\0\20\36\1\40\1\41\1\36\1\37"+
    "\1\0\10\40\2\36\1\0\1\42\17\36\1\42\1\4"+
    "\1\36\1\37\1\0\10\42\2\36\1\0\1\43\21\36"+
    "\1\5\1\37\1\7\12\36\1\7\17\36\4\44\1\45"+
    "\1\0\11\44\1\46\20\44\3\0\1\7\1\0\1\7"+
    "\12\0\1\7\17\0\1\36\1\40\1\41\1\36\1\37"+
    "\1\0\1\40\1\47\6\40\2\36\1\0\1\42\17\36"+
    "\1\40\1\41\1\36\1\37\1\0\1\50\7\40\2\36"+
    "\1\0\1\42\17\36\1\40\1\41\1\36\1\37\1\0"+
    "\3\40\1\51\4\40\2\36\1\0\1\42\17\36\1\40"+
    "\1\41\1\36\1\37\1\0\1\40\1\52\6\40\2\36"+
    "\1\0\1\42\22\36\1\37\1\0\10\36\1\53\1\36"+
    "\1\0\17\36\5\15\1\0\32\15\3\0\1\7\1\0"+
    "\1\7\12\0\1\7\1\54\16\0\1\36\2\42\1\36"+
    "\1\37\1\0\10\42\2\36\1\55\1\42\22\36\1\37"+
    "\1\0\12\36\1\0\1\36\1\56\21\36\1\37\1\0"+
    "\12\36\1\0\2\36\1\57\20\36\1\37\1\0\12\36"+
    "\1\0\3\36\1\60\17\36\1\37\1\0\12\36\1\0"+
    "\4\36\1\61\16\36\1\37\1\0\12\36\1\0\4\36"+
    "\1\62\16\36\1\37\1\0\12\36\1\0\4\36\1\63"+
    "\1\64\15\36\1\37\1\0\12\36\1\0\14\36\1\65"+
    "\6\36\1\37\1\0\12\36\1\0\15\36\1\66\1\36"+
    "\40\0\1\36\1\67\1\70\1\36\1\37\1\0\10\67"+
    "\2\36\1\0\1\42\17\36\1\71\1\70\1\36\1\37"+
    "\1\0\10\71\2\36\1\0\1\42\17\36\2\42\1\36"+
    "\1\37\1\0\10\42\2\36\1\0\1\42\17\36\1\42"+
    "\1\72\1\36\1\37\1\0\10\42\2\36\1\0\1\42"+
    "\16\36\4\0\1\73\33\0\4\44\1\74\1\0\11\44"+
    "\1\46\20\44\1\36\1\67\1\70\1\36\1\37\1\0"+
    "\2\67\1\75\5\67\2\36\1\0\1\42\17\36\1\67"+
    "\1\70\1\36\1\37\1\0\5\67\1\76\2\67\2\36"+
    "\1\0\1\42\17\36\1\67\1\70\1\36\1\37\1\0"+
    "\7\67\1\77\2\36\1\0\1\42\16\36\5\53\1\0"+
    "\32\53\20\0\1\55\17\0\1\36\1\100\1\101\1\36"+
    "\1\37\1\0\10\100\2\36\1\0\1\42\17\36\1\102"+
    "\1\101\1\36\1\37\1\0\10\102\2\36\1\0\1\42"+
    "\17\36\2\102\1\36\1\37\1\0\10\102\2\36\1\0"+
    "\17\36\4\73\1\45\1\0\32\73\4\103\1\104\1\0"+
    "\11\103\1\105\20\103\1\36\1\100\1\101\1\36\1\37"+
    "\1\0\1\106\7\100\2\36\1\0\1\42\17\36\1\100"+
    "\1\101\1\36\1\37\1\0\6\100\1\107\1\100\2\36"+
    "\1\0\1\42\17\36\2\110\1\36\1\37\1\0\10\110"+
    "\2\36\1\0\1\42\17\36\1\111\1\110\1\36\1\37"+
    "\1\0\10\111\2\36\1\0\1\42\17\36\2\111\1\36"+
    "\1\37\1\0\10\111\2\36\1\0\17\36\4\103\1\112"+
    "\1\0\11\103\1\105\24\103\1\113\1\0\11\103\1\105"+
    "\20\103\1\36\2\110\1\36\1\37\1\0\3\110\1\114"+
    "\4\110\2\36\1\0\1\42\17\36\2\115\1\36\1\37"+
    "\1\0\10\115\2\36\1\0\1\42\17\36\2\115\1\36"+
    "\1\37\1\0\10\115\2\36\1\0\20\36\2\115\1\36"+
    "\1\37\1\0\4\115\1\116\3\115\2\36\1\0\1\42"+
    "\16\36\1\117\2\115\1\117\1\37\1\0\10\115\2\117"+
    "\1\0\23\117\1\37\1\0\12\117\1\0\17\117";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1696];
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
    "\1\0\34\1\1\0\1\11\15\1\1\11\15\1\1\0"+
    "\7\1\1\0\1\1\1\0\4\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
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
    while (i < 122) {
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
        case 17: 
          { lexeme=yytext(); return CierraParentesis;
          }
        case 32: break;
        case 5: 
          { /* Ignore */
          }
        case 33: break;
        case 18: 
          { lexeme=yytext(); return AbreParentesis;
          }
        case 34: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 35: break;
        case 31: 
          { lexeme=yytext(); return Entero;
          }
        case 36: break;
        case 28: 
          { lexeme=yytext(); return Reales;
          }
        case 37: break;
        case 19: 
          { lexeme=yytext(); return Negacion;
          }
        case 38: break;
        case 20: 
          { lexeme=yytext(); return Cadena;
          }
        case 39: break;
        case 8: 
          { lexeme=yytext(); return Suma;
          }
        case 40: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 41: break;
        case 30: 
          { lexeme=yytext(); return Real;
          }
        case 42: break;
        case 16: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 43: break;
        case 23: 
          { lexeme=yytext(); return MayorIgual;
          }
        case 44: break;
        case 26: 
          { lexeme=yytext(); return LogicoAND;
          }
        case 45: break;
        case 15: 
          { lexeme=yytext(); return Coma;
          }
        case 46: break;
        case 11: 
          { lexeme=yytext(); return Igual;
          }
        case 47: break;
        case 7: 
          { lexeme=yytext(); return Comentario;
          }
        case 48: break;
        case 13: 
          { lexeme=yytext(); return Menor;
          }
        case 49: break;
        case 29: 
          { lexeme=yytext(); return And;
          }
        case 50: break;
        case 22: 
          { lexeme=yytext(); return IgualIgual;
          }
        case 51: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 52: break;
        case 24: 
          { lexeme=yytext(); return MenorIgual;
          }
        case 53: break;
        case 10: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 54: break;
        case 12: 
          { lexeme=yytext(); return Mayor;
          }
        case 55: break;
        case 25: 
          { lexeme=yytext(); return Diferente;
          }
        case 56: break;
        case 4: 
          { /*Ignore*/
          }
        case 57: break;
        case 21: 
          { lexeme=yytext(); return Or;
          }
        case 58: break;
        case 14: 
          { lexeme=yytext(); return PuntoYComa;
          }
        case 59: break;
        case 27: 
          { lexeme=yytext(); return LogicoOR;
          }
        case 60: break;
        case 3: 
          { lexeme=yytext(); return Enteros;
          }
        case 61: break;
        case 9: 
          { lexeme=yytext(); return Resta;
          }
        case 62: break;
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

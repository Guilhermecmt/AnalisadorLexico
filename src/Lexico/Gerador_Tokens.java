package Lexico;

public class Gerador_Tokens {

        //  INDEPENDENTES
	public static final int PONTO_VIRGULA = 0;
	public static final int NUMERO_INTEIRO = 1;
        public static final int ABRE_PARENTESES = 2;
        public static final int FECHA_PARENTESES = 3;
        public static final int PONTO = 4;
        public static final int ARROBA = 5;
        public static final int TIL = 6;
        public static final int ASTERISCO = 7;
        public static final int BARRA_NORMAL = 8;
        public static final int ADICAO = 9;
        public static final int SUBTRACAO = 10;
        public static final int MENOR_IGUAL = 11;
        public static final int MENOR = 12;
        public static final int IGUAL = 13;
        public static final int MENOR_SUB = 14;
        public static final int ABRE_CHAVES = 15;
        public static final int FECHA_CHAVES = 16;
        public static final int DOIS_PONTOS = 17;
        public static final int VIRGULA = 18;
        public static final int MAIOR_IGUAL = 19;
        //PALAVRAS RESERVADAS
        public static final int INT = 20;
	public static final int MAIN = 21;
	public static final int IDENTIFICADOR = 22;
        public static final int BOOL = 23;
        public static final int IF = 24;
        public static final int ELSE = 25;
        public static final int CLASS = 26;
        public static final int FI = 27;
        public static final int IN = 28;
        public static final int INHERITS = 29;
        public static final int LET = 30;
        public static final int LOOP = 31;
        public static final int POOL = 32;
        public static final int THEN = 33;
        public static final int WHILE = 34;
        public static final int CASE = 35;
        public static final int ESAC = 36;
        public static final int NEW = 37;
        public static final int OF = 38;
        public static final int NOT = 39;
        public static final int TRUE = 40;
        public static final int STRING = 41;
        public static final int LENGTH = 42;
        public static final int CONCAT = 43;
        public static final int SUBSTR = 44;
        public static final int ISVOID = 45;
        //FIM DAS PALAVRAS RESERVADAS
        public static final int ASPAS_SIMPLES = 46;
                

	public static void lookUp(Token token) {

		if (token.getLexema().equals("int")) {
			token.setCodigo(INT);
		} else if (token.getLexema().equals("main")) {
			token.setCodigo(MAIN);
		}else if (token.getLexema().equals("(")) {
			token.setCodigo(ABRE_PARENTESES);
		}else if (token.getLexema().equals(")")) {
			token.setCodigo(FECHA_PARENTESES);
		}else if (token.getLexema().equals(";")) {
			token.setCodigo(PONTO_VIRGULA);
		}else if (token.getLexema().equals(".")) {
			token.setCodigo(PONTO);
		}else if (token.getLexema().equals("@")) {
			token.setCodigo(ARROBA);
		}else if (token.getLexema().equals("~")) {
			token.setCodigo(TIL);
		}else if (token.getLexema().equals("*")) {
			token.setCodigo(ASTERISCO);
		}else if (token.getLexema().equals("/")) {
			token.setCodigo(BARRA_NORMAL);
		}else if (token.getLexema().equals("+")) {
			token.setCodigo(ADICAO);
		}else if (token.getLexema().equals("-")) {
			token.setCodigo(SUBTRACAO);
		}else if (token.getLexema().equals("<")) {
			token.setCodigo(MENOR);
		}else if (token.getLexema().equals("=")) {
			token.setCodigo(IGUAL);
		}else if (token.getLexema().equals("{")) {
			token.setCodigo(ABRE_CHAVES);
		}else if (token.getLexema().equals("}")) {
			token.setCodigo(FECHA_CHAVES);
		}else if (token.getLexema().equals(":")) {
			token.setCodigo(DOIS_PONTOS);
		}else if (token.getLexema().equals(",")) {
			token.setCodigo(VIRGULA);
		}else if (token.getLexema().equals("bool")) {
			token.setCodigo(BOOL);
		}else if (token.getLexema().equals("if")) {
			token.setCodigo(IF);
		}else if (token.getLexema().equals("else")) {
			token.setCodigo(ELSE);
		}else if (token.getLexema().equals("class")) {
			token.setCodigo(CLASS);
		}else if (token.getLexema().equals("fi")) {
			token.setCodigo(FI);
		}else if (token.getLexema().equals("in")) {
			token.setCodigo(IN);
		}else if (token.getLexema().equals("inherits")) {
			token.setCodigo(INHERITS);
		}else if (token.getLexema().equals("isvoid")) {
			token.setCodigo(ISVOID);
		}else if (token.getLexema().equals("let")) {
			token.setCodigo(LET);
		}else if (token.getLexema().equals("loop")) {
			token.setCodigo(LOOP);
		}else if (token.getLexema().equals("pool")) {
			token.setCodigo(POOL);
		}else if (token.getLexema().equals("then")) {
			token.setCodigo(THEN);
		}else if (token.getLexema().equals("while")) {
			token.setCodigo(WHILE);
		}else if (token.getLexema().equals("case")) {
			token.setCodigo(CASE);
		}else if (token.getLexema().equals("esac")) {
			token.setCodigo(ESAC);
		}else if (token.getLexema().equals("new")) {
			token.setCodigo(NEW);
		}else if (token.getLexema().equals("of")) {
			token.setCodigo(OF);
		}else if (token.getLexema().equals("not")) {
			token.setCodigo(NOT);
		}else if (token.getLexema().equals("true")) {
			token.setCodigo(TRUE);
		}else if (token.getLexema().equals("string")) {
			token.setCodigo(STRING);
		}else if (token.getLexema().equals("length")) {
			token.setCodigo(LENGTH);
		}else if (token.getLexema().equals("concat")) {
			token.setCodigo(CONCAT);
		}else if (token.getLexema().equals("substr")) {
			token.setCodigo(SUBSTR);
		}else if (token.getLexema().equals("'")) {
			token.setCodigo(ASPAS_SIMPLES);
		}
                
                
		else {
			token.setCodigo(IDENTIFICADOR);
		}
	}
}

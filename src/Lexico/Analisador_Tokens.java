package Lexico;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import exceptions.EOFException;

public class Analisador_Tokens {

	private FileInputStream fis;
	private InputStreamReader isr;
	private PushbackReader pbr;

	public Analisador_Tokens(String path) throws FileNotFoundException {

		this.fis = new FileInputStream(path);
		this.isr = new InputStreamReader(this.fis);
		this.pbr = new PushbackReader(this.isr);
	}

	public Character obterCaracter() throws IOException {

		Character c = null;
		int i = this.pbr.read();

		if (i != -1) {
			c = (char) i;
		}
		return c;
	}

	public void devolverCaracter(Character c) throws IOException {

		this.pbr.unread(c);
	}

	public Token getToken() throws IOException, EOFException {

		Token token = null;
		Character c;

		do {
			String lexema = new String();
			c = this.obterCaracter();

			if (c == null) {
				throw new EOFException();
			}

			if (Character.isLetter(c) || c.equals('_')) {
				lexema = lexema + c;
				c = this.obterCaracter();
				while (Character.isLetter(c) || Character.isDigit(c)
						|| c.equals('_')) {
					lexema = lexema + c;
					c = this.obterCaracter();
				}
				this.devolverCaracter(c);
				token = new Token(lexema);
				Gerador_Tokens.lookUp(token);
				break;
			}
			// ...
			if (Character.isDigit(c)) {
				lexema = lexema + c;
				c = this.obterCaracter();
				while (Character.isDigit(c)) {
					lexema = lexema + c;
					c = this.obterCaracter();
				}
				this.devolverCaracter(c);
				token = new Token(Gerador_Tokens.NUMERO_INTEIRO, lexema);
				break;
			}
			// ...
			if (c.equals(';')) {
				token = new Token(Gerador_Tokens.PONTO_VIRGULA, c.toString());
				break;
			}else if (c.equals('(')) {
				token = new Token(Gerador_Tokens.ABRE_PARENTESES, c.toString());
				break;
			}else if (c.equals(')')) {
				token = new Token(Gerador_Tokens.FECHA_PARENTESES, c.toString());
				break;
			}else if (c.equals('.')) {
				token = new Token(Gerador_Tokens.PONTO, c.toString());
				break;
			}else if (c.equals('@')) {
				token = new Token(Gerador_Tokens.ARROBA, c.toString());
				break;
			}else if (c.equals('~')) {
				token = new Token(Gerador_Tokens.TIL, c.toString());
				break;
			}else if (c.equals('*')) {
				token = new Token(Gerador_Tokens.ASTERISCO, c.toString());
				break;
			}else if (c.equals('/')) {
				token = new Token(Gerador_Tokens.BARRA_NORMAL, c.toString());
				break;
			}else if (c.equals('+')) {
				token = new Token(Gerador_Tokens.ADICAO, c.toString());
				break;
			}else if (c.equals('-')) {
				token = new Token(Gerador_Tokens.SUBTRACAO, c.toString());
				break;
			}else if (c.equals('<')) {
				token = new Token(Gerador_Tokens.MENOR, c.toString());
				break;
			}else if (c.equals('=')) {
				token = new Token(Gerador_Tokens.IGUAL, c.toString());
				break;
			}else if (c.equals('{')) {
				token = new Token(Gerador_Tokens.ABRE_CHAVES, c.toString());
				break;
			}else if (c.equals('}')) {
				token = new Token(Gerador_Tokens.FECHA_CHAVES, c.toString());
				break;
			}else if (c.equals(':')) {
				token = new Token(Gerador_Tokens.DOIS_PONTOS, c.toString());
				break;
			}else if (c.equals(',')) {
				token = new Token(Gerador_Tokens.VIRGULA, c.toString());
				break;
			}else if (c.equals("'")) {
				token = new Token(Gerador_Tokens.ASPAS_SIMPLES, c.toString());
				
			}
                        
		} while (Character.isSpace(c));

		return token;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public InputStreamReader getIsr() {
		return isr;
	}

	public void setIsr(InputStreamReader isr) {
		this.isr = isr;
	}

	public PushbackReader getPbr() {
		return pbr;
	}

	public void setPbr(PushbackReader pbr) {
		this.pbr = pbr;
	}

}

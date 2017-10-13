package Lexico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Token {

	private Integer codigo;
	private String lexema;
        private String TipoLexico;
   

    public String getTipoLexico() {
        return TipoLexico;
    }

    public void setTipoLexico(String TipoLexico) {
        this.TipoLexico = TipoLexico;
    }

	public Token() {
	}

	public Token(String lexema) {
		this.lexema = lexema;
	}

	public Token(Integer codigo, String lexema) {
		this.codigo = codigo;
		this.lexema = lexema;
                 if (codigo == 0){
                     TipoLexico = "PONTO E VIRGULA";
                }else if(codigo == 1){
                     TipoLexico = "NUMERO INTEIRO";
                 }else if(codigo == 2){
                     TipoLexico = "ABRE PARENTESES";
                 }else if(codigo == 3){
                     TipoLexico = "FECHA PARENTESES";
                 }else if(codigo == 4){
                     TipoLexico = "PONTO";
                 }else if(codigo == 5){
                     TipoLexico = "ARROBA";
                 }else if(codigo == 6){
                     TipoLexico = "TIL";
                 }else if(codigo == 7){
                     TipoLexico = "ASTERISCO";
                 }else if(codigo == 8){
                     TipoLexico = "BARRA NORMAL";
                 }else if(codigo == 9){
                     TipoLexico = "ADIÇÃO";
                 }else if(codigo == 10){
                     TipoLexico = "SUBTRAÇÃO";
                 }else if(codigo == 11){
                     TipoLexico = "MENOR IGUAL";
                 }else if(codigo == 12){
                     TipoLexico = "MENOR";
                 }else if(codigo == 13){
                     TipoLexico = "IGUAL";
                 }else if(codigo == 14){
                     TipoLexico = "MENOR SUB";
                 }else if(codigo == 15){
                     TipoLexico = "ABRE CHAVES";
                 }else if(codigo == 16){
                     TipoLexico = "FECHA CHAVES";
                 }else if(codigo == 17){
                     TipoLexico = "DOIS PONTOS";
                 }else if(codigo == 18){
                     TipoLexico = "VIRGULA";
                 }else if(codigo == 19){
                     TipoLexico = "MAIOR IGUAL";
                 }else if(codigo == 20){
                     TipoLexico = "NUMERO INTEIRO";
                 }
                 else if(codigo == 46){
                     TipoLexico = "NUMERO INTEIRO";
                 }
	      
                
        }

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

        
        public void escritor(String path) throws IOException {
      
    }
 
	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();
                

                
		buffer.append("*********************\n");
                
                 if (codigo > 20 && codigo < 46){
                    TipoLexico = "Palavra Reservada";
                }
	
                buffer.append("Tipo Lexico: "); 
                buffer.append(this.getTipoLexico()); 
                buffer.append("\n");
                buffer.append("Codigo Do Tipo: ");
		buffer.append(this.getCodigo());
		buffer.append("\n");
		buffer.append("Lexema: ");
		buffer.append(this.getLexema());
		buffer.append("\n*********************\n");

		return buffer.toString();
	}

}

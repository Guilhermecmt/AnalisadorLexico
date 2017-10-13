package Lexico;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
         ArrayList tokens = new ArrayList();
		String path = "entrada.txt";
                String path2 = "saida.txt";
		try {
			Analisador_Tokens scan = new Analisador_Tokens(path);
			Token token = scan.getToken();
                           
			while (token != null) {
                                
				System.out.println(token);                                                             
				token = scan.getToken();
                                tokens.add(token);
                                
			}
                         
                         
                        
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

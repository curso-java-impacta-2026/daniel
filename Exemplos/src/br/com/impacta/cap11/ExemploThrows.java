package br.com.impacta.cap11;
import java.io.FileNotFoundException;

public class ExemploThrows {
    public static void main(String[] args) {
        
            try {
				metodo1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
    }

    public static void metodo1() throws Exception {
        try {
            metodo2();
        } catch (Exception e) {
            throw new Exception("Exceção enviada no metodo1", e);
        }
    }

    public static void metodo2() throws Exception {
        throw new Exception("Exceção enviada no metodo2");
    }	
}

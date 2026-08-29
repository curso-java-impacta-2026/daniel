package laboratorios.capitulo9;

public class Cap9_Lab1 {
	public static void main(String[] args) {
		Pessoa b = new Professor("Manuel", 45, 'm', 45678912, "16/08/1999", 0, "Java");
		Pessoa a = new Aluno("Rafael", 10, 'm', 123456789, "20/02/2020", 1, "Java");
		Pessoa c = new Aluno("Claudia", 1, 'f', 123456789, "01/01/0001", 2, "Python");
		
		a.falar("Rafael?");
		b.falar("Presente");
		a.falar("Claudia?");
		c.falar("Presente");
		
		a.mostrarDados();
		b.mostrarDados();
		c.mostrarDados();
		
	}
		

}
	

package desafioContador;

public class ParametroInvalidosException {
	
	public static void parametro(int prm1, int prm2) {
		try {
			
		
		if (prm2 > prm1) {
			int a = prm2 - prm1;
			for (int i =1; i <= a; i++) {
				System.out.println("Imprimindo o número "+i);
			}
		} else {
			throw new Exception();
		} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("O número dois deve ser maior que o número um");
	}

} 
}

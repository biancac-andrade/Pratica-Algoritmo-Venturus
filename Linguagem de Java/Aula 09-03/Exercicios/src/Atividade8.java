public class Atividade8 {
   public static void main(String[] args){
    int[] numeros = new int[6];
		int valor;
		int novoValor;
		int i;
		int z;
		int menor = 20;

		for (i = 0; i <= 5; i++) {

			valor = (int) (1 + Math.random() * 60); //
			numeros[i] = valor; // guarda na primeira posicao

			novoValor = (int) (1 + Math.random() * 60);

			for (z = 0; z <= 5; z++) {

				
				if (numeros[z] == novoValor) {
					novoValor = (int) (1 + Math.random() * 60);
					z = 0;
				}
			}

			numeros[i] = novoValor;

			System.out.println("Numeros sorteados : " + numeros[i]);
		}
		System.out.println("\nNumero 1 é : " + numeros[0] + "\nNumero 2 é : "
				+ numeros[1] + "\nNumero 3 é : " + numeros[2]
				+ "\nNumero 4 é : " + numeros[3] + "\nNumero 5 é : "
				+ numeros[4] + "\nNumero 6 é : " + numeros[5]);
	}

}
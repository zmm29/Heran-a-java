
public class Main {

	public static void main(String[] args) {
		Vetor vet1 = new Vetor(3); 
		Vetor vet2 = new Vetor(3);
		
		vet1.adiciona(0, 10);
		vet1.adiciona(1, 20);
		vet1.adiciona(2, 30);
		
		vet2.adiciona(0, 10);
		vet2.adiciona(1, 20);
		vet2.adiciona(2, 30);
		
		int soma = vet1.soma();
		int maior = vet1.maiorValor();
		int menor = vet1.menorValor();
		
		Vetor resultado = vet1.somaVetor(vet2);
		for(int valor : resultado.getItens()) {
			System.out.println(valor);
		}
		
		
		System.out.println(soma);
		System.out.println(menor);
		System.out.println(maior);
	}

}

public class MediaAluno {

	public static void main(String[] args) {
		double notaAluno[][] = new double [2][4];
		double [] media = new double [2]; 
		
		notaAluno [0][0] = 2;
		notaAluno [0][1] = 2;
		notaAluno [0][2] = 10;
		notaAluno [0][3] = 10;
		
		notaAluno [1][0] = 5;
		notaAluno [1][1] = 5;
		notaAluno [1][2] = 7;
		notaAluno [1][3] = 10;
		
		for (int linha=0; linha<notaAluno.length; linha++ ) {
			System.out.print("Notas Aluno " +  (linha+1) + " = ");
			
			for (int coluna=0; coluna<notaAluno[0].length; coluna++) {
				System.out.print(notaAluno[linha][coluna] + " ");
				media[linha] += notaAluno[linha][coluna];
			}
			media[linha] = media[linha]/notaAluno[0].length;
			
			System.out.println();
			System.out.println();
		}
		
		for (int linhaMedia = 0; linhaMedia<media.length; linhaMedia++) {
			System.out.println();
			System.out.println("A média do Aluno " + (linhaMedia+1) + " é de " + media[linhaMedia]);
			
		}
	}

}

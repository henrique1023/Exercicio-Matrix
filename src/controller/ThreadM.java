package controller;

public class ThreadM extends Thread{
	private int op, vetor[][];
	public ThreadM(int op, int [][] vetor) {
		this.vetor = vetor;
		this.op = op;
	}
	@Override
	public void run() {
		matriz(op, vetor);
	}
	private void matriz(int op, int[][] vetor) {
		int soma=0;
		try {
			sleep(500); // faz os threads darem uma pausa programada
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (op) {
		case 0:
			for(int i=0;i<5;i++) {
				soma += vetor[0][i];
			}
		case 1:
			for(int i=0;i<5;i++) {
				soma += vetor[1][i];
			}
		case 2:
			for(int i=0;i<5;i++) {
				soma += vetor[2][i];
			}
			break;
		}
		System.out.println("O vetor na posição " + op + " a soma da linha deu: " + soma);
	}
}

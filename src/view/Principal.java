package view;

import java.util.Random;

import controller.ThreadM;

public class Principal {

	public static void main(String[] args) {
		Random item = new Random();
		int vetor [][]= new int[3][5];
		for(int i = 0 ; i<3; i++) {
			for(int t = 0;t<5;t++) {
			vetor[i][t] = (int) Math.ceil(item.nextInt(100)+1);
			}
		}
		for(int op = 0; op < 3; op++ ) {
			ThreadM tNano = new ThreadM(op, vetor);
			tNano.start();
		}
	}

}

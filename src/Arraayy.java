/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herda
 */
public class Arraayy {
    public static void main(String[] args){
	int[] angka = new int[100];

	int x = 1;
	for (int i = 0; i < angka.length; i++) {
	angka[i] = x;
	x++;
	}
	int total = 0;
	for (int i = 0; i < angka.length; i++) {
	total+=angka[i];
	}
	System.out.println(total);
	}
}

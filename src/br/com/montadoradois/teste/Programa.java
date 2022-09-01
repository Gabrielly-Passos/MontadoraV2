package br.com.montadoradois.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadodois.beans.Veiculo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Veiculo v1 = new Veiculo("Civic", 500.00);
		Veiculo v2 = new Veiculo("Fiesta", 900.00);
		Veiculo v3 = new Veiculo("Jetta", 100.00);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		veiculos.add(v1);
		veiculos.add(v2);
		veiculos.add(v3);
		
		
		
		
	}

}

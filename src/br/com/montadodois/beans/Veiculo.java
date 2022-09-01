package br.com.montadodois.beans;

public class Veiculo {
   
	private String nome; 
	private double capacidadeCombustivel;
	
    public Veiculo(String nome, double capacidadeCombustivel) {
		setNome(nome);
		setCapacidadeCombustivel(capacidadeCombustivel);
	
	}

	public Veiculo() {
	  }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	} 
	public String mostrarAtributos() {
		
	return " O nome do Veiculo é " + getNome() +
			" e a capacidade do combustivel é " + getCapacidadeCombustivel();
	
	}
	
}

package br.com.db1start.classes;

public class Esporte {
	private Boolean usaBola;
	
	public boolean isUsaBola() {
		return usaBola;
	}

	public void setUsaBola(boolean usaBola) {
		this.usaBola = usaBola;
	}

	public Integer getTempoDeJogo() {
		return tempoDeJogo;
	}

	public void setTempoDeJogo(Integer tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}

	public String getRegras() {
		return regras;
	}

	public void setRegras(String regras) {
		this.regras = regras;
	}

	private Integer tempoDeJogo;
	
	private String regras;

}

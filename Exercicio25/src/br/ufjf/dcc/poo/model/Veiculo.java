package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Veiculo {

	private String numPlaca;
	private String modelo;
	private Date dataUltimaRevisao;
	private Date proximaRevisao;
	
	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDataUltimaRevisao() {
		return dataUltimaRevisao;
	}
	public void setDataUltimaRevisao(Date dataUltimaRevisao) {
		this.dataUltimaRevisao = dataUltimaRevisao;
	}
	public Date getProximaRevisao() {
		return proximaRevisao;
	}
	public void setProximaRevisao(Date proximaRevisao) {
		this.proximaRevisao = proximaRevisao;
	}
	
}

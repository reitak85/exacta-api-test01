package br.com.exacta.desafio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gasto")
public class Gasto implements Serializable{
	
	private static final long serialVersionUID = -4421890485174964405L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGasto;
	
	@Column
	private String nomePessoa;
	@Column
	private String descricao;	
	@Column
	private Date dataHora;
	@Column
	private double valor;
	@Column
	private String tags;
	
	public Gasto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Gasto(String nomePessoa, String descricao, Date dataHora, double valor, String tags) {
		super();
		this.nomePessoa = nomePessoa;
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.valor = valor;
		this.tags = tags;
	}

	public long getIdGasto() {
		return idGasto;
	}
	public void setIdGasto(long idGasto) {
		this.idGasto = idGasto;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataHora, descricao, idGasto, nomePessoa, tags, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gasto other = (Gasto) obj;
		return Objects.equals(dataHora, other.dataHora) && Objects.equals(descricao, other.descricao)
				&& idGasto == other.idGasto && Objects.equals(nomePessoa, other.nomePessoa)
				&& Objects.equals(tags, other.tags)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	@Override
	public String toString() {
		return "Gasto [idGasto=" + idGasto + ", nomePessoa=" + nomePessoa + ", descricao=" + descricao + ", dataHora="
				+ dataHora + ", valor=" + valor + ", tags=" + tags + "]";
	}

}

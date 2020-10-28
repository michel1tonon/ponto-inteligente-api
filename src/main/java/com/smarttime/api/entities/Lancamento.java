package com.smarttime.api.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.smarttime.api.enums.TipoEnum;

@Entity
@Table(name = "lancamento")
public class Lancamento {
	
	private Long id;
	private Date data;
	private String descricao;
	private String localizacao;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private TipoEnum tipo;
	private Funcionario funcionario;
	
	public Lancamento() {
		
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the data
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data", nullable = false)
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the descricao
	 */
	@Column(name = "descricao", nullable = true)
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the localizacao
	 */
	@Column(name = "localizacao", nullable = false)
	public String getLocalizacao() {
		return localizacao;
	}

	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	/**
	 * @return the dataCriacao
	 */
	@Column(name = "data_criacao", nullable = false)
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	@Column(name = "data_atualizacao", nullable = false)
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	/**
	 * @return the tipo
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo", nullable = false)
	public TipoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the funcionario
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

}

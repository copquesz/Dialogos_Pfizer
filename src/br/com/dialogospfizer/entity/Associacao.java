package br.com.dialogospfizer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "associacao")
public class Associacao implements Serializable{
	
	
	private static final long serialVersionUID = -6174536719816340297L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_fundacao")
	private Date dataFundacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "periodo_gestao")
	private Date periodoGestao;
	
	@Column(name = "razao_social")
	private String razaoSocial;
	
	@Column(name = "nome_fantasia")
	private String nomeFantasia;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "area_atuacao")
	private String areaAtuacao;
	
	@Column(name = "qtd_pacientes")
	private Integer qtdPacientes;
	
	@Column(name = "qtd_funcionarios")
	private Integer qtdFuncionarios;
	
	@Column(name = "qtd_voluntarios")
	private Integer qtdVoluntarios;
	
	@JoinColumn(name = "endereco_id")
	@ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	private Endereco endereco;
	
	@JoinColumn(name = "usuario_id")
	@ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	private Usuario usuario;

}

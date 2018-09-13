package br.com.dialogospfizer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.dialogospfizer.enumerated.CategoriaProjeto;
import br.com.dialogospfizer.utility.DocumentosProjeto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "projeto", indexes = { @Index(name = "nome_projeto_index", columnList = "nome_projeto") })
public class Projeto implements Serializable {

	private static final long serialVersionUID = -5835438567472594561L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;
	
	@Column(name = "nome_projeto")
	private String nomeProjeto;
	
	@Column(name = "orcamento")
	private Double orcamento;
	
	@Column(name = "qtd_beneficiarios_direto")
	private Double qtdBeneficiariosDireto;
	
	@Column(name = "qtd_beneficiarios_indireto")
	private Double qtdBeneficiariosIndireto;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "categoria_projeto")
	private CategoriaProjeto categoriaProjeto;
	
	@Column(name = "objetivo")
	private String objetivo;
	
	@JoinColumn(name = "associacao_id")
	@ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private Associacao associacao;
	
	@JoinColumn(name = "documentos_projeto_id")
	@ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private DocumentosProjeto documentos;

}

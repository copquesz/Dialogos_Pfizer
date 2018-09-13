package br.com.dialogospfizer.utility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "documentos_associacao")
public class DocumentosAssociacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "url_cartao_cnpj")
	private String urlCartaoCnpj;

	@Transient
	private MultipartFile cartaoCnpj;

	@Column(name = "url_estatuto_social")
	private String urlEstatutoSocial;

	@Transient
	private MultipartFile estatutoSocial;

	@Column(name = "url_comprovante")
	private String urlAtaEleicao;

	@Transient
	private MultipartFile ataEleicao;
	
	@Column(name = "url_ata_eleicao")
	private String urlComprovanteEndereco;
	
	@Transient
	private MultipartFile comprovanteEndereco;
	
	@Column(name = "url_demonstracao_resultados")
	private String urlDemonstracaoResultados;
	
	@Transient
	private MultipartFile demonstracaoResultados;

}

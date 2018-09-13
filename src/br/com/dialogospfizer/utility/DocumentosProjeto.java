package br.com.dialogospfizer.utility;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import br.com.dialogospfizer.entity.Associacao;
import br.com.dialogospfizer.enumerated.CategoriaProjeto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "documentos_projeto")
public class DocumentosProjeto implements Serializable{
	
	private static final long serialVersionUID = -7414721786864099762L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "endereco_imagem")
	private String enderecoImagem;
	
	@Transient
	private MultipartFile imagem;
	
	@Column(name = "endereco_apresentacao")
	private String enderecoApresentacao;
	
	@Transient
	private MultipartFile apresentacao;
	

}

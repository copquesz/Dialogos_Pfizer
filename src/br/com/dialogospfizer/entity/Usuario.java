package br.com.dialogospfizer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.dialogospfizer.enumerated.TipoUsuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "usuario")
/**
 * Classe responsável por possui o modelo do objeto Usuário
 * 
 * @author Lucas Copque
 *
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 2357710625085133022L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sobrenome")
	private String sobrenome;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private String senha;

	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "telefone_residencial")
	private String telefoneResidencial;
	
	@Column(name = "telefone_celular")
	private String telefoneCelular;

	@JoinColumn(name = "endereco_id")
	@ManyToOne
	private Endereco endereco;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_usuario")
	private TipoUsuario tipoUsuario;

}

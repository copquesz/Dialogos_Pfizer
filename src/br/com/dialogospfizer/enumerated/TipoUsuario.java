package br.com.dialogospfizer.enumerated;

import lombok.Getter;

@Getter
/**
 * Enum que cont�m os tipos de Usu�rios da aplica��o.
 * @author Yab�
 *
 */
public enum TipoUsuario{
	
	COMUM(0, "Usu�rio Comum"),
	YABA(1, "Usu�rio Yab�"),
	PFIZER(2, "Usu�rio Pfizer");
	
	private Integer id;
	private String descricao;
	
	TipoUsuario(Integer id, String descricao){
		this.id = id;
		this.descricao = descricao;
		
	}

}

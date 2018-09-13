package br.com.dialogospfizer.enumerated;

import lombok.Getter;

@Getter
/**
 * Enum que contém os tipos de Usuários da aplicação.
 * @author Yabá
 *
 */
public enum TipoUsuario{
	
	COMUM(0, "Usuário Comum"),
	YABA(1, "Usuário Yabá"),
	PFIZER(2, "Usuário Pfizer");
	
	private Integer id;
	private String descricao;
	
	TipoUsuario(Integer id, String descricao){
		this.id = id;
		this.descricao = descricao;
		
	}

}

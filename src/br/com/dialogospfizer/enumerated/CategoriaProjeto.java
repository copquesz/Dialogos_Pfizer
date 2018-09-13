package br.com.dialogospfizer.enumerated;

import lombok.Getter;

@Getter
public enum CategoriaProjeto {
	
	PSIORIASE(0, "Psioriase"),
	DOENCAS_REUMATICAS(1, "Doenças Reumáticas"),
	DOENCAS_INFLAMATORIAS(2, "Doenças Inflamatórias");
	
	private int id;
	private String descricao;
	
	CategoriaProjeto(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

}

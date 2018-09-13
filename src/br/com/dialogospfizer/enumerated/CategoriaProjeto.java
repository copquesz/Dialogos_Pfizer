package br.com.dialogospfizer.enumerated;

import lombok.Getter;

@Getter
public enum CategoriaProjeto {
	
	PSIORIASE(0, "Psioriase"),
	DOENCAS_REUMATICAS(1, "Doen�as Reum�ticas"),
	DOENCAS_INFLAMATORIAS(2, "Doen�as Inflamat�rias");
	
	private int id;
	private String descricao;
	
	CategoriaProjeto(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

}

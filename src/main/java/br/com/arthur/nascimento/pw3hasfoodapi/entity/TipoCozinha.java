package br.com.arthur.nascimento.pw3hasfoodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


@Table(name = "TBL_TIPO_COZINHA")
public class TipoCozinha {

	
	@Column(name = "ID_TIPO_COZINHA")
	@Id
	private long ID_TIPO_COZINHA;
	
	@Column(name = "TX_NOME")
	private long TX_NOME;
	
	@Column(name = "DT_ECLUSAO")
	private long DT_EXCLUSAO;
}

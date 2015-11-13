package br.com.schimidtsolutions.estudo.dto;

import java.io.Serializable;

public class AlertMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	private String mensagem;
	private String link;
	
	public AlertMessage(String mensagem, String link) {
		this.mensagem = mensagem;
		this.link = link;
	}

	public String getMensagem() {
		return mensagem;
	}
	
	public boolean isLinkExiste(){
		return link != null ? true : false;
	}
	
	public String getLink() {
		return link;
	}
	
	@Override
	public String toString() {
		return String.format("AlertMessage [mensagem=%s, link=%s]", mensagem, link);
	}
}

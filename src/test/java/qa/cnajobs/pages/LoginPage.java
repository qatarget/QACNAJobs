package qa.cnajobs.pages;

import org.openqa.selenium.By;

import qa.cnajobs.core.DSL;

public class LoginPage {
	
	private DSL dsl = new DSL();
	
	public void SetEscreveEmail(String email) {
		dsl.escreveId("Username", email);
	}
	
	public void SetEscreverSenha(String senha) {
		dsl.escreveId("Password", senha);
	}
	
	public void SetClicarEntrar() {
		dsl.clicarBotaoBy(By.cssSelector("button"));
	}
	
	public void url(String url) {
		dsl.maximizaJanela();
		dsl.url(url);
	}
	
	public void SetValidarAcesso(String texto) {
		dsl.validarAcesso(texto, By.cssSelector(".click-animate .cna-local"));
	}
	
	public void AguardarCarregarPagina(int tempo) throws InterruptedException {
		dsl.esperaCarregar(tempo);
	}

}

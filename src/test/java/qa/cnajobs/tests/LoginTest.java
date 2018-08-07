package qa.cnajobs.tests;

import org.junit.Test;

import qa.cnajobs.pages.LoginPage;

public class LoginTest {
	
	private LoginPage page = new LoginPage();
	
	@Test
	public void DeveRealizarAcessoUsuario() throws InterruptedException {
		
		page.url("http://server.target1.com.br:8882");
		page.SetEscreveEmail("danilozanutto@gmail.com");
		page.SetEscreverSenha("123456");
		page.SetClicarEntrar();
		page.AguardarCarregarPagina(3000);
		page.SetValidarAcesso("ADMINISTRAÇÃO NACIONAL CNA");
	}

}

package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PortalSteps {
	String url = "https://auditeste.com.br/";
	WebDriver driver;

	@Before
	public void iniciar(){
		System.setProperty("webdriver.chrome.driver","drivers/chrome/88.2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@After
	public void encerrar(){
		driver.quit();
	}


	//Metodo Espera
	public void espera(){
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	}

	@Dado("que esteja na home da pagina")
	public void queEstejaNaHomeDaPagina() {
			driver.get(url);
			espera();
			driver.findElement(By.cssSelector("img[class*=button]")).click();

	}

	@Quando("eu clico no Menu e escolho {string}")
	public void euClicoNoMenuEEscolhoTitulo(String escolha) {

			espera();
			driver.findElement(By.id("menu-item-290")).findElement(By.cssSelector("a[title^=Ser]")).click();
			espera();
			driver.findElement(By.linkText(escolha)).click();
	}

	@Entao("deve ir para {string} e mostrar {string}")
	public void deveIrParaUrlEMostrarTexto(String urlLink,String textoEsperado) {
			String urlAtual = driver.getCurrentUrl();
			espera();
			String textoAtual = driver.findElement(By.cssSelector("h1[class*=titulo]")).getText();

			Assert.assertEquals(urlLink,urlAtual);
			Assert.assertEquals(textoEsperado,textoAtual);
	}

}

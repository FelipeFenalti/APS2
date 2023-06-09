package APS_2;

import junit.framework.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio1 {
	    
	static WebDriver driver = null;
	      
	private static String namePaginaPrincipal ;
	    
	public Exercicio1() {
	      
	}
	    
	@BeforeAll
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		        
	        driver = new ChromeDriver();

	        driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	    
	        namePaginaPrincipal = driver.getWindowHandle();
	}
	    
	    
	    @Test
	      public void testValidaTitulo(){
	    	// arrange
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");      
	    	String tituloEsperado = "Trabalho 2-1"; 
	        
	    	// act, assert
	    	Assert.assertEquals(tituloEsperado, driver.getTitle());
	      }
	    
	    @Test
	    public void validaNomeCorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	        WebElement nome = driver.findElement(By.id("nome"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        nome.sendKeys("Pedro");
	        
	        String resultadoEsperado = "Preencha o campo endereco"; 
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    
	    @Test
	    public void validaNomeIncorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	        WebElement nome = driver.findElement(By.id("nome"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        nome.sendKeys("");
	        
	        String resultadoEsperado = "Preencha o campo nome"; 
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    @Test
	    public void validaEnderecoIncorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Preencha o campo endereco";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    @Test
	    public void validaEnderecoCorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Selecione um valor para o campo sexo";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    
	    @Test
	    public void validaSexoIncorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement sexo = driver.findElement(By.id("sexo"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Selecione um valor para o campo sexo";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        sexo.sendKeys("");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    
	    @Test
	    public void validaSexoCorreto(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement sexo = driver.findElement(By.id("sexo"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Preencha o campo idade, somente com numeros";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        sexo.sendKeys("Masculino");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	     }
	    
	    @Test
	    public void validaIdadeNumeros(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement sexo = driver.findElement(By.id("sexo"));
	        WebElement idade = driver.findElement(By.id("idade"));
	        
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Preencha o campo idade, somente com numeros";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        sexo.sendKeys("Masculino");
	        idade.sendKeys("");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	         
	     }
	    
	    @Test
	    public void validaIdadePositiva(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement sexo = driver.findElement(By.id("sexo"));
	        WebElement idade = driver.findElement(By.id("idade"));
	        
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        WebElement resultado = driver.findElement(By.id("resultado"));
	        
	        String resultadoEsperado = "Preencha o campo idade com valores acima de 0";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        sexo.sendKeys("Masculino");
	        idade.sendKeys("-12");
	        botao.click();
	        
	        Assert.assertEquals(resultadoEsperado, resultado.getText());
	         
	     }
	         
	    @Test
	    public void validaIdadeCorreta(){
	    	driver.get("C:\\Users\\fenal\\Downloads\\qts-main\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
	        
	    	WebElement nome = driver.findElement(By.id("nome"));	        
	        WebElement endereco = driver.findElement(By.id("endereco"));
	        WebElement sexo = driver.findElement(By.id("sexo"));
	        WebElement idade = driver.findElement(By.id("idade"));
	        WebElement botao = driver.findElement(By.id("botao_somar"));
	        
	        String resultadoEsperado = "Cadastro realizado com sucesso";
	        nome.sendKeys("Felipe");
	        endereco.sendKeys("Felizardo 232");
	        sexo.sendKeys("Masculino");
	        idade.sendKeys("23");
	        botao.click();
	        
	        Alert alert = driver.switchTo().alert();
	        Assert.assertTrue(alert.getText().equals(resultadoEsperado));
	        alert.accept();
	         
	     }	     
	     

	    
	    @AfterAll
	    public static void tearDown() {
	        driver.quit();
	    	}
	    
		
	}


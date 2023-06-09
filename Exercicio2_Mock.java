package APS_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import integracao.BancoDados;
import junit.framework.Assert;


public class Exercicio2_Mock {
    
    private CorreioService correio;
	
    @BeforeAll
    public static void init(){
       
    }
    
    @BeforeEach
    public void beforeEach() {
    	correio = Mockito.mock(CorreioService.class);
    }
    
    @Test
    public void testPortoAlegre(){
    	// arrange    	
    	when(correio.buscaEndereco("9000000")).
    		thenReturn("Porto Alegre");
       
    	String resultadoEsperado = "Porto Alegre";
        Assert.assertEquals(resultadoEsperado, correio.buscaEndereco("9000000"));
        
    }
    
    @Test
    public void testAssisBrasil(){
    	// arrange    	
    	when(correio.buscaEndereco("8000000")).
    		thenReturn("Av. Assis Brasil");
       
    	String resultadoEsperado = "Av. Assis Brasil";
        Assert.assertEquals(resultadoEsperado, correio.buscaEndereco("8000000"));
        
    }
    

	
}

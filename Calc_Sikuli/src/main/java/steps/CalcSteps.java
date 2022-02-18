package steps;
import static org.junit.Assert.assertNotNull;
import org.sikuli.script.*;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.*;
import object.CalcObjects;


public class CalcSteps {
		
	@Dado("que eu abro a calculadora")
	public void que_eu_abro_a_calculadora() throws FindFailed {
		ImagePath.add(System.getProperty("user.dir"));	
	}

	@Quando("eu realizar uma {string} e ver o resultado correto")
	public void eu_realizar_algumas_operacoes(String operacoes) throws FindFailed {
		Screen s = new Screen();
		CalcObjects obj = new CalcObjects();
		
		switch(operacoes) {
		  case "multiplicacao":
			 obj.mult();
		     break;		    
		  case "adicao":
			 obj.adc();
			 break;		    
		  case "subtracao":
			 obj.sub();
		     break;		      
		  case "divisao":
			 obj.div();
			 break;
		  case "raiz":
			 obj.raiz();
			 break;
		  case "potencia":
			 obj.potencia();
			 break;
		  case "porcentagem":
			 obj.porcentagem();
			 break;
		}			
	}

	
	@Quando("eu realizar uma {string} invalida e ver o resultado final")
	public void eu_realizar_uma__operacao_invalida_e_ver_o_resultado_final(String operacoes_inv) throws FindFailed {
		Screen s = new Screen();
		CalcObjects obj = new CalcObjects();
		
		switch(operacoes_inv) {
		  case "divisao por zero":
			 obj.divisao_zero();
		     break;		    
		  case "raiz de num negativo":
			 obj.raiz_num_neg();
			 break;		    
		  case "inserir muitos numeros":
			 obj.inserir_muitos_numeros();
		     break;	
		}
	}	
		
	
	@Entao("o resultado devera ser apagado")
	public void devo_ver_o_resultado_correto() throws FindFailed {
		Screen s = new Screen();
		s.click("images/limpar.png");

		
		
		
	
		
		
		
		
//		
//	
//		
//		
//		
//		void limpar_campos() throws FindFailed {
//			s.click("images/5.png");
//			s.click("images/limpar.png");
//			assertNotNull(s.exists("images/zero.png"));
//		}
//		
//		void verificar_historico() throws FindFailed{
//			s.click("images/hist.png");
//			assertNotNull(s.exists("images/hist_tudo.png"));
//			s.click("images/clicar_aqui.png");
//		}
//		
//		void clicar_menu() throws FindFailed{
//			s.click("images/menu.png");
//			assertNotNull(s.exists("images/menu_clicado.png"));
//			s.click("images/menu.png");
//		}
	
	}
}


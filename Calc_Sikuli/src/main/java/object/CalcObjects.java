package object;

import static org.junit.Assert.assertNotNull;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class CalcObjects {
	Screen s = new Screen();
	
	public void mult() throws FindFailed {
		App.open("C:\\Windows\\System32\\calc.exe");
		s.wait("images/5.png");
		s.click("images/5.png");
		s.click("images/x.png");
		s.click("images/5.png");
		s.click("images/igual.png");
		assertNotNull(s.exists("images/resul_mult.png"));				
	}
	
	public void adc() throws FindFailed {
		s.click("images/5.png");
		s.click("images/+.png");
		s.click("images/5.png");
		s.click("images/igual.png");
		assertNotNull(s.exists("images/resul_adc.png"));	
	}
	
	public void div() throws FindFailed {
		s.click("images/5.png");
		s.click("images/div.png");
		s.click("images/5.png");
		s.click("images/igual.png");
		assertNotNull(s.exists("images/resul_div.png"));
	}
	
	public void sub() throws FindFailed {
		s.click("images/5.png");
		s.click("images/-.png");
		s.click("images/5.png");
		s.click("images/igual.png");
		assertNotNull(s.exists("images/resul_sub.png"));
	}
	
	public void raiz() throws FindFailed {
		s.click("images/5.png");
		s.click("images/raiz.png");
		assertNotNull(s.exists("images/resul_raiz.png"));
	}
	
	public void potencia() throws FindFailed {
		s.click("images/5.png");
		s.click("images/potencia.png");
		assertNotNull(s.exists("images/resul_potencia.png"));
	}
	
	public void porcentagem() throws FindFailed {
		s.click("images/5.png");
		s.click("images/-.png");
		s.click("images/5.png");
		s.click("images/porcentagem.png");
		s.click("images/igual.png");
		assertNotNull(s.exists("images/resul_porcentagem.png"));
	}
	
	public void divisao_zero() throws FindFailed {
		s.wait("images/div_zero.png");
		s.click("images/div_zero.png");
		assertNotNull(s.exists("images/div_zero_res.png"));
	}
	
	public void raiz_num_neg() throws FindFailed {
		s.click("images/5.png");
		s.click("images/mudar_sinal.png");
		s.click("images/raiz.png");
		assertNotNull(s.exists("images/resul_raiz_num_neg.png"));
	}
	
	public void inserir_muitos_numeros() throws FindFailed {
		s.wait("images/potencia.png");
		s.type("9.999.999.999.999.999");
		
		for(int i = 0; i < 11; i++) {
			s.click("images/potencia.png");
		}
		assertNotNull(s.exists("images/estouro.png"));
	}
}


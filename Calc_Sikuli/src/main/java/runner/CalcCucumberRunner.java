package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features"
		,glue = {"steps"}
		,tags= {"@caminho_feliz or @fluxo_alternativo"})

public class CalcCucumberRunner {

	public static void main(String[] args) {
		Main.main(new String[]{
				"classpath:features",
				 "-t", "@caminho_feliz or @fluxo_alternativo",
			     "-g", "steps" 					  
	        }
	        );   
	}
}

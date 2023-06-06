package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources",
        glue= {"stepdefinitions","hooks"},//step defi nin adini yaziyoruz
        tags= "@api",//calisacak senaryolari belirtir
        dryRun= false //bunu true yaparsak "eksik step definitionslari arar"
)

public class Runner {
}
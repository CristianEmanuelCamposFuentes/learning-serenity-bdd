// ParameterDefinitions.java
package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.helpers.TodoListPage;

public class ParameterDefinitions {

    // Este método define un tipo de parámetro personalizado para los actores en los escenarios de Cucumber.
    @ParameterType(".*")
    public Actor actor(String actorName) {
        // Crea y retorna un nuevo Actor con el nombre proporcionado.
        return OnStage.theActorCalled(actorName);
    }

    // Este método se ejecuta antes de cada escenario y configura el escenario para la ejecución de pruebas.
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        // Configura el escenario con un nuevo elenco de actores en línea.
        TodoListPage.setBaseUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}


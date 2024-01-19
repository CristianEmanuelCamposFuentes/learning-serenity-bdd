// CucumberTestSuite.java
package starter;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

// Esta anotación marca la clase como una suite de pruebas que utiliza el motor de ejecución de Cucumber.
@Suite
// Indica que se deben incluir los motores especificados en la ejecución de la suite.
@IncludeEngines("cucumber")
// Especifica la ubicación de los archivos de características de Cucumber.
@SelectClasspathResource("/features")
// Configura la suite con parámetros, como el plugin de informes de Serenity y otros parámetros de ejecución.
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
public class CucumberTestSuite {
    // Esta clase no requiere más lógica, ya que las anotaciones proporcionan la configuración necesaria.
}


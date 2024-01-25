// TodoListPage.java
package starter.helpers;

import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

// Esta anotación establece la URL predeterminada para la página de la lista de tareas.
@DefaultUrl("https://todomvc.com/examples/angular/dist/browser/#/all")
public class TodoListPage extends PageObject {

        private static final String DEFAULT_BASE_URL = "https://todomvc.com/examples/angular/dist/browser/#/all";

        @Getter
        private static String baseUrl = DEFAULT_BASE_URL;

        // Elemento que representa el campo para agregar un nuevo ítem a la lista de tareas.
        public static Target ITEM_NAME_FIELD = Target.the("item name field").locatedBy(".new-todo");

        // Elemento que representa la lista de ítems en la página de la lista de tareas.
        public static Target ITEMS_LIST = Target.the("item list").locatedBy(".todo-list li");

        public static void setBaseUrl(String url){
                baseUrl = url;
        }

}



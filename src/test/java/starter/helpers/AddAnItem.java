// AddAnItem.java
package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddAnItem {

    // Acción: El actor agrega un ítem con un nombre específico a la lista de tareas.
    public static Performable withName(String itemName) {
        return Task.where("{0} adds an item with name " + itemName,

                // Acción: El actor ingresa el nombre del ítem en el campo correspondiente.
                Enter.theValue(itemName)
                        .into(TodoListPage.ITEM_NAME_FIELD)
                        // Acción: El actor presiona la tecla Enter para confirmar la adición del ítem.
                        .thenHit(Keys.ENTER)
        );
    }
}


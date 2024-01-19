# feature/AddItem.feature
Feature: Add new item to TODO list

  Scenario: Add buying milk to the list
    # Este escenario describe el proceso de agregar "Buy some milk" a la lista de tareas.
    Given Taba is looking at his TODO list
    When he adds "Buy some milk" to the list
    Then he sees "Buy some milk" as an item in the TODO list
    # Se verifica que "Buy some milk" está presente en la lista de tareas.

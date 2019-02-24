/**
 * * Evitar pistas falsas que dificulten el significado del código
 */

// * La ortografía similar de conceptos parecidos es información; el uso de
// ortografía incoherente es desinformación

public class EvitarDesinformacion {
    // ! No dar pistas falsas
    // * Quién lea el código pensará que List == List<>
    public String accountList;

    // * Más correcto
    public String accountGroup;
    public String accounts;

    // ! Evitar nombres con variaciones mínimas
    public String XYZControllerForEfficientHandlingOfStrings;
    public String xYZControllerForEfficientStorageOfStrings;

}
class RealizarDistincionesConSentido {

    // * Los nombres de series numéricas(a1, a2,... aN) son lo contrario a los
    // * nombres intencionados. No desinforman, simplemente no ofrecen información;
    // * son una pista sobre la intención del autor

    public static void copyChars(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    public static void copyCharsRefactor(char source[], char destination[]) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    // ! Palabras adicionales son redundantes.
    public String variableNombre;
    public String nameString;

    // * No es incorrecto usar prefijos como a y the mientras la distinción tenga
    // sentido: a = variables locales; for = argumentos funciones.

    // ! Ejemplo:
    /**
     * getActiveAccount(); getActiveAccounts(); getActiveAccountInfo();
     */

    // ? En ausencia de convenciones concretas:
    // * moneyAccount no se distingue de money
    // * customerInfo no se distingue de customer
    // * accountData no se distingue de account
    // * theMessage no se distingue de message

}
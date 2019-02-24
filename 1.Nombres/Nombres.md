# Nombres con sentido

#### Nombres que revelen intenciones

El nombre de una variable, función o clase debe responder una serie de cuestiones básicas. Debe indicar por qué existe, qué hace y cómo se usa. Si un nombre requiere un comentario, significa que no revela su cometido.

```java
int d; //tiempo transcurrido en días
int elapsedTimeInDays;
int daysSinceCreation;
int fileAgeInDays;
```

En este ejemplo se observa que se necesita un nombre que especifique lo que se mide y la unidad de dicha medida.

```java
public List<Cell> getFlaggedCells() {
    List<Cell> flaggedCells = new ArrayList<Cell>();
    for (Cell cell : gameBoard)
        if (cell.isFlagged())
            flaggedCells.add(Cell);
        return flaggedCells;
}
```

### Evitar la desinformación

> Hay que evitar dejar pistas falsas que dificulten el significado del código.

1. Nombres de **variables de entorno del sistema**
2. Nombres de un **tipo de dato** cuando esa variable no es de ese tipo
3. **Nombres casi iguales con variaciones mínimas**. Por ejemplo: `cambiarPosicionCuadradoArriba` con `cambiarPosicionTrianguloArriba`.
4. **Nombre desinformativo**. Usar **l** minúcula o la **O** mayúscula como nombre de variable puede llevar a la confusión con constantes.

No usar la palabra `list` en una variable salvo que esa variable represente una colección de tipo `List`. Cambiar: `accountList` por `accounts` o `accountGroup`.

#### Realizar distinciones con sentido

No basta con añadir series de números o palabras adicionales con el único objetivo de que el código compile.

> Si los nombres tienen que ser distintos, también deben tener un significado diferente.

1. **Palabras sin información**. Series numéricas(a1, a2, ... aN).

2. **Palabras adicionales**. Clase `Product` con clase `ProductInfo` o `ProductData`. **Info** y **Data** son palabras adicionales, como **a**, **and** y **the**.

3. **Prefijos**. Cuando no siguen un convenio pueden desinformar. Usar por ejemplo `theZork` para nombrar una variable porque en ese ámbito ya está cogida la variable `zork`.

4. **Palabras adicionales redundantes**. La palabra `variable` no debe incluirse nunca en el nombre de una variable.

Sin convención:

-   `moneyAmount` no se distingue de `money`
-   `customerInfo` no se distingue de `customer`
-   `accountData` no se distingue de `account`
-   `theMessage` no se distingue de message

> Se deben diferenciar los nombres de forma que el lector del código aprecie las diferencias.

#### Nombres de clase

> El nombre de una clase no deber ser un verbo

#### Nombres de métodos

> Los métodos deben tener nombres de verbo como `postPayment` , `deletePage` o `save`. Los métodos de acceso, de modificación y los predicados deben tener como nombre su valor y usar como prefijo `get`, `set` e `is`.

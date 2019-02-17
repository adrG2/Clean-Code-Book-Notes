import java.util.ArrayList;
import java.util.List;

/**
 * El nombre de una variable, función o clase debe responder a una serie de
 * cuestiones básicas. Debe indicar por qué existe, qué hace y cómo se usa. Si
 *  un nombre requiere un comentario, significa que no revela su cometido.
 */

class NombresExplicacion {

    /*
     * TABLERO. Compuesto de una lista de celdas. Cada celda del tablero se
     * representa por una matriz.
     */
    private List<int[]> gameBoard;
    private List<Cell> gameBoardRefactor;

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    /**
     * *Ejemplo 1: Buscaminas Devuelve una lista de celdas marcadas(flagged
     * =marcadas)
     */
    public List<int[]> getFlaggedCells() {
        ArrayList<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

    public List<Cell> getFlaggedCellsRefactor() {
        ArrayList<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoardRefactor) {
            if (cell.isFlagged())
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

}

final class Cell {

    public boolean isFlagged() {
        return false;
    }

}
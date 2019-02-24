class NombresBuscables {

    // ! Si una variable o constante se usa en varios puntos del código -> nombre
    // buscable

    public static int WORK_DAYS_PER_WEEK = 5;
    public static int NUMBER_OF_TASKS = 3;

    public int getRealTaskWeeks() {
        int realDaysPerIdealDay = 4;
        int sum = 0;

        for (int j = 0; j < NUMBER_OF_TASKS; J++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;
    }

    // * Sum no es nombre útil pero es buscable.
    // * WORK_DAYS_PER_WEEK mejor que buscar el 5 y filtrar los casos
}
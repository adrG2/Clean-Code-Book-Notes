class NombresPronunciables {
    // ! Error
    class DtaRcrd102 {
        private Date genymdhms;
        private Date modymdhms;
        private final String pszquint = "102";
    }

    // * Bien
    class Customer {
        private Date generationTimestamp;
        private Date modificationTimestamp;
        private final String recordId = "102";
    }

    // * Ahora se puede hablar sobre la clase Customer sin parecer tonto
}
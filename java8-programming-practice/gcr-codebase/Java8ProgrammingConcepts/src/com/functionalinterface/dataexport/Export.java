package com.functionalinterface.dataexport;

interface Exporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class CSVExporter implements Exporter {
    public void export() {
        System.out.println("Exported to CSV");
    }
}

public class Export {
    public static void main(String[] args) {
        Exporter e = new CSVExporter();
        e.export();
        e.exportToJSON();
    }
}

module org.example.szfm_masodik_ora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.szfm_masodik_ora to javafx.fxml;
    exports org.example.szfm_masodik_ora;
}
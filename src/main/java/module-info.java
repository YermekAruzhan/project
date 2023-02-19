module com.lodin.login {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens com.lodin.login to javafx.fxml;
    exports com.lodin.login;
}
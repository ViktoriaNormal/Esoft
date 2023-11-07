open module com.example.esoftcompany {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    exports com.example.esoftcompany;
    exports com.example.esoftcompany.container;
}
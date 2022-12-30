package tp.software.traceability.ui.gui.controllers.graphics.utils;
import java.time.LocalDate;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Getter;
import lombok.Setter;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductModel {
    private SimpleLongProperty id;

    private SimpleStringProperty name;

    private SimpleDoubleProperty price;

    private SimpleStringProperty expirationDate;

    public ProductModel(Long id, String name, double price, LocalDate expirationDate) {
        this.id = new SimpleLongProperty(id);
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleDoubleProperty(price);
        this.expirationDate = new SimpleStringProperty(expirationDate.toString());
    }
}
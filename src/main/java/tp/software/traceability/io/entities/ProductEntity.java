package tp.software.traceability.io.entities;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document(collection = "products")
public class ProductEntity implements Serializable {
    private static final long serialVersionUID = -215182597052086112L;

    @Id
    private Long id;

    private String name;

    private double price;

    private Date expirationDate;
}
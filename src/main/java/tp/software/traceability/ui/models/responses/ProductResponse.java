package tp.software.traceability.ui.models.responses;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductResponse {
    private Long id;

    private String name;

    private double price;

    private Date expirationDate;
}
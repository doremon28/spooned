package tp.software.traceability.shared.dto;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductDto implements Serializable {
    private static final long serialVersionUID = -8578362746153635789L;

    private Long id;

    private String name;

    private double price;

    private Date expirationDate;
}
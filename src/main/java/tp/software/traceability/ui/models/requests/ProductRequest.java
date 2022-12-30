package tp.software.traceability.ui.models.requests;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Builder
public class ProductRequest {
    private Long userId;

    private String name;

    private double price;

    private Date expirationDate;
}
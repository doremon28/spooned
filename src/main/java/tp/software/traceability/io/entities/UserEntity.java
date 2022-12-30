package tp.software.traceability.io.entities;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document(collection = "users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3902895360827267956L;

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;

    private String name;

    private int age;

    private String email;

    private String password;
}
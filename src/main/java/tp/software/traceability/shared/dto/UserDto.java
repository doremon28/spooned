package tp.software.traceability.shared.dto;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserDto implements Serializable {
    private static final long serialVersionUID = 4524673998592433343L;

    private Long id;

    private String name;

    private int age;

    private String email;

    private String password;
}
package tp.software.traceability.events;
import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;
import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;
public class StageReadyEvent extends ApplicationEvent {
    public StageReadyEvent(Stage source) {
        super(source);
    }

    public Stage getStage() {
        return ((Stage) (getSource()));
    }
}
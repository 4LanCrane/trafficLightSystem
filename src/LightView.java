import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightView implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent event) {

        String propertyName = event.getPropertyName();
        String oldValue = (String) event.getOldValue();
        String newValue = (String) event.getNewValue();

        switch (propertyName) {
            case "NAME":
                System.out.println("Name changed from " + oldValue + " to " + newValue);
                break;
            case "STATE":
                System.out.println(oldValue);
                break;
        }

    }
}

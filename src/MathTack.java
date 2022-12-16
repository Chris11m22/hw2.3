import java.util.HashMap;
import java.util.Objects;

public class MathTack {

   HashMap<String, Integer> taskMap = new HashMap<>();

    public void addInMathTack(String key, Integer value) {
        if (Objects.equals(this.taskMap.get(key), value)) {
            throw new IllegalArgumentException();
        }
        this.taskMap.put(key, value);
    }
}
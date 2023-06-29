package task2;

import java.util.Objects;
import java.util.Random;

public class Humidity {

    private int humidity;

    public int getHumidity() {
        Random humidity = new Random();
        return humidity.nextInt((100 - 0) + 1) + 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humidity humidity1 = (Humidity) o;
        return humidity == humidity1.humidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(humidity);
    }
}

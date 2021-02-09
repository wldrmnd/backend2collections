package collections;

import java.util.Objects;

public class Parrot {

    private String name;
    private int soundVolume;

    public Parrot(String name, int soundVolume) {
        this.name = name;
        this.soundVolume = soundVolume;
    }

    @Override
    public boolean equals(Object o) {
        Parrot anotherParrot = (Parrot) o;
        if (soundVolume == anotherParrot.soundVolume &&
                name.equals(anotherParrot.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, soundVolume);
    }
}

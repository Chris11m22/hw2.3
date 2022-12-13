import java.util.Objects;

public class MathTack {
    private int numberStart;
    private int numberEnd;

    public MathTack(int numberStart, int numberEnd) {
        this.numberStart = numberStart;
        this.numberEnd = numberEnd;
    }


    public int getNumberStart() {
        return numberStart;
    }

    public int getNumberEnd() {
        return numberEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathTack that = (MathTack) o;
        return numberStart == that.numberStart && numberEnd == that.numberEnd || numberStart == that.numberEnd && numberEnd == that.numberStart;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberStart) + Objects.hashCode(numberEnd);
    }

    @Override
    public String toString() {
        return numberStart + " * " + numberEnd + " = " + (numberStart * numberEnd);
    }
}

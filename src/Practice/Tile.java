package Practice;

import java.util.Objects;

public class Tile {

    int x;
    int y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return x == tile.x &&
                y == tile.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

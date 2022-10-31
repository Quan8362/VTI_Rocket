public class Position {
    int id;

    PositionName name;

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
    public Position position1() {
        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        return position;
    }
}


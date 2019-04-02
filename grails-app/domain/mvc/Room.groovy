package mvc

class Room {

    String description
    int    capacity

    @Override
    String toString() {
        return description + " (" + capacity + ")"
    }
    static constraints = {
        description unique: true
        capacity    min: 0
    }
}

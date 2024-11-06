package Door;

public enum DoorStates {

    OPEN(0),
    CLOSED(1),
    LOCKED(2);

    int state;
    DoorStates(int state){
        this.state = state;
    }
}

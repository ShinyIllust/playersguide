package Door;

public class Door {

    int doorState;
    int passCode;
    String doorFlavor;

    Door(int doorState, int passCode, int doorID){
        this.doorState = doorState;
        this.passCode = passCode;
    }

    public static Door constructDoor(int passCode){
        Door newDoor;
        newDoor = new Door(0, passCode, 0);
        return newDoor;
    }

    public String toString() {
        switch(doorState){
            case 0:
                doorFlavor = DoorStates.OPEN.name();
                break;
            case 1:
                doorFlavor = DoorStates.CLOSED.name();
                break;
            case 2:
                doorFlavor = DoorStates.LOCKED.name();
                break;
        }
        return "The door is: " + doorFlavor;
    }
}

package Fletcher;

public class Arrow {
    String arrowhead;
    String fletching;
    double length;
    double cost;

    Arrow(String arrowhead, String fletching, double length, double cost){
        //Define materials and length
        this.arrowhead = arrowhead;
        this.fletching = fletching;
        this.length = length;

        //Determine total cost
        switch(this.arrowhead) {
            case "STEEL":
                this.cost = this.cost + 10;
                break;
            case "WOOD":
                this.cost = this.cost + 3;
                break;
            case "OBSIDIAN":
                this.cost = this.cost + 5;
                break;
            default:
                System.out.println("Invalid arrowhead material.");
                return;
        }

        switch(this.fletching) {
            case "PLASTIC":
                this.cost = this.cost + 10;
                break;
            case "TURKEY":
                this.cost = this.cost + 5;
                break;
            case "GOOSE":
                this.cost = this.cost + 3;
                break;
            default:
                System.out.println("Invalid fletching material.");
                return;
        }

        if (this.length > 0) {
            this.cost = this.cost + (this.length * 0.05);
        } else {
            System.out.println("Invalid length.");
            return;
        }
    }
}

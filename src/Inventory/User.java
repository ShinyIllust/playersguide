package Inventory;

public class User {
    public static void main(String[] args){
        //Change
        Pack pack = new Pack(2,10,10);
        pack.add(new Arrow());
        pack.add(new Arrow());
        pack.add(new Bow());
        System.out.println(pack);
    }
}
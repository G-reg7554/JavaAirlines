public class Passenger {
    private String name;
    private int bagAmount;

    public Passenger(String name, int bagAmount){
        this.name = name;
        this.bagAmount = bagAmount;
    }

    public String getName() {
        return this.name;
    }

    public int checkBags(){
        return this.bagAmount;
    }
}

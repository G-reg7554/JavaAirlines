public enum Destination {
    MADRID("MAD"),
    ALICANTE("ALC"),
    MALAGA("AGP"),
    TENERIFE("BCN");

    public String arrival;

    Destination(String arrival){
        this.arrival = arrival;
    }
    public String getDestination(){
        return this.arrival;
    }
}

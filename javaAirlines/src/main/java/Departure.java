public enum Departure {
    HEATHROW("LHR"),
    GATWICK("LGW"),
    LONDON("STN"),
    MANCHESTER("MAN"),
    EDINBURGH("EDI"),
    GLASGOW("GLA");

    final public String leaving;

    Departure(String leaving){
        this.leaving = leaving;
    }

    public String getDeparture(){
        return this.leaving;
    }


}

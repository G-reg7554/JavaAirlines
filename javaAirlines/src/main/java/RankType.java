public enum RankType {
    CAPTAIN("Pilot",1),
    FIRSTOFFICER("Co pilot",2),
    LEADATTENDANT("Lead Attendant",3),
    FLIGHTATTENDANT("Flight Attendant",4);

    public final String position;
    public final int rankNo;

    RankType(String position, int rankNo){
        this.position = position;
        this.rankNo = rankNo;
    }

    public String getRank(){
        return this.position;
    }

    public int getRankNo(){
        return this.rankNo;
    }
}

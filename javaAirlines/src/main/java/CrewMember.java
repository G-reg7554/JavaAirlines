public class CrewMember {
   private RankType rankType;
    private String name;


    public CrewMember(String name, RankType rankType){
        this.name = name;
        this.rankType = rankType;
    }

    public String getName(){
        return this.name;
    }

    public RankType getRank(){
        return this.rankType;
    }

    public String crewMessage(){
        return "Slight turbulance please put seatbelts on";
    }

    public String getValueFromEnum(){
        return this.rankType.getRank();

    }

    public int getRankNo(){
        return this.rankType.getRankNo();

    }




}


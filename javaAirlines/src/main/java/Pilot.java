public class Pilot {

    private String name;
    private String licenseNumber;

    private RankType rankType;

    public Pilot(String name, String licenseNumber, RankType rankType){
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rankType = rankType;
    }

    public String getName(){
        return this.name;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public RankType getRank(){
        return this.rankType;
    }

    public String flyPlane(){
        return "The Plane Is Now flying!";
    }
}




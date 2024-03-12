package CustomClasses;

public class MusicianClient {
    private String name;
    private int members;
    private String type;
    private String bestHit;

    public MusicianClient(){
    this.name = "unknown";
    this.members = 0;
    this.bestHit = "unknown";
    this.setType(members);
    }
    public MusicianClient(String name, int members, String bestHit ){
    this.name = name;
    this.members = members;
    this.bestHit = bestHit;
    this.setType(members);
    }
    public void setName(String name){

    }
    public String getName(){
    return name;
    }
    public void setType(int members){
    if(members <1){
        this.type = "Invalid";
    }else if (members == 1){
        this.type = "Solo";
    }else if (members == 2) {
        this.type = "Duo";
    }else if (members == 3){
        this.type = "Trio";
    }else if (members >= 4 && members <=10){
        this.type = "Group";
    }else{
        this.type = "Way too many people";
    }
    }
    public String getType(){
    return this.type = type;
    }
    public void setBestHit(){
    this.bestHit = bestHit;
    }
    public String getBestHit(){
    return bestHit;
    }
    public String toString(){
    return String.format("%s is a %s act with %d members whose best hit is %s.", this.name, this.type, this.members, this.bestHit);
    }
}

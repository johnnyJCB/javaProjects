package CustomClasses;

public class SportTeam {
    private String teamName;
    private String sport;
    private int dateFounded;

    public SportTeam(){

    }

    public SportTeam(String teamName, String sport, int dateFounded){
        this.teamName = teamName;
        this.sport = sport;
        this.dateFounded = dateFounded;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return sport;
    }

    public void setDateFounded(int dateFounded){
        this.dateFounded = dateFounded;
    }
    public int getDateFounded(){
        return dateFounded;
    }

    @Override
    public String toString() {
        return String.format("The sport team is %s and was founded on %d.", this.teamName, this.dateFounded);
    }
}

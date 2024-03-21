package CustomClasses;

public class Football extends SportTeam{
    private int nflTrophy;

    public Football(){

    }
    public Football(String teamName, int dateFounded, int nflTrophy){
        setTeamName(teamName);
        setDateFounded(dateFounded);
        setSport("Football");
        setNflTrophy(nflTrophy);
    }
    public void setNflTrophy(int nflTrophy){
        this.nflTrophy = nflTrophy;
    }
    public int getNflTrophy(){
        return nflTrophy;
    }

    @Override
    public String toString() {
        return String.format("%s was founded on %s and has won %s lombardie trophies", this.getTeamName(), this.getDateFounded(), this.getNflTrophy());
    }
}

package CustomClasses;

public class Basketball extends SportTeam {
    private int nbaTrophy;

    public Basketball(){

    }
    public Basketball(String teamName, int dateFounded, int nbaTrophy){
        setTeamName(teamName);
        setDateFounded(dateFounded);
        setNbaTrophy(nbaTrophy);
    }

    public void setNbaTrophy(int nbaTrophy) {
        this.nbaTrophy = nbaTrophy;
    }
    public int getNbaTrophy(){
        return nbaTrophy;
    }
}

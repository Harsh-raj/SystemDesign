package FlyWeight.RolePlayingGame;

public class TeamSAS implements PlayerTeam {
    private TeamUniform uniform;
    private String teamName;

    public TeamSAS(TeamUniform uniform, String teamName) {
        this.uniform = uniform;
        this.teamName = teamName;
        System.out.println("SAS team created.");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("SAS Player at location ("+x+","+y+")");
    }

    @Override
    public Enum<TeamUniform> getUniform() {
        return uniform;
    }

    @Override
    public String getTeamName(){
        return this.teamName;
    }
}

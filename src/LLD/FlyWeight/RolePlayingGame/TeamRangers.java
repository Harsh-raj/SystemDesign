package LLD.FlyWeight.RolePlayingGame;

public class TeamRangers implements PlayerTeam{
    private TeamUniform uniform;
    private String teamName;

    public TeamRangers(TeamUniform uniform, String teamName) {
        this.uniform = uniform;
        this.teamName = teamName;
        System.out.println("Rangers team created.");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Rangers Player at location ("+x+","+y+")");
    }

    @Override
    public Enum<TeamUniform> getUniform() {
        System.out.println(this.uniform);
        return null;
    }

    @Override
    public String getTeamName(){
        return this.teamName;
    }
}

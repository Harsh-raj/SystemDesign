package FlyWeight.RolePlayingGame;

public class TeamOpFor implements PlayerTeam{
    private TeamUniform uniform;
    private String teamName;

    public TeamOpFor(TeamUniform uniform, String teamName) {
        this.uniform = uniform;
        this.teamName = teamName;
        System.out.println("OPFOR team created.");
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Op For Player at location ("+x+","+y+")");
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

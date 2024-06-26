package LLD.FlyWeight.RolePlayingGame;

public class TeamSpetsnaz implements PlayerTeam{

    private TeamUniform uniform;
    private String teamName;

    public TeamSpetsnaz(TeamUniform uniform, String teamName) {
        this.uniform = uniform;
        this.teamName = teamName;
        System.out.println("Spetsnaz team created.");
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Spetsnaz Player at location ("+x+","+y+")");
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

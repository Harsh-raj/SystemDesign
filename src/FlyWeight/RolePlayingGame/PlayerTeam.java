package FlyWeight.RolePlayingGame;

public interface PlayerTeam {
    void display(int x, int y);
    Enum<TeamUniform> getUniform(); //Uniform are supposed to be of large size maybe about 30 KB
    String getTeamName();
}
//if 500000 players are created for each fighting team in a simulated war, then the total memory required to accommodate
// those players in the simulation will be 31GB which will eventually crash the system if flyweight design pattern not
// applied.
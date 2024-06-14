package FlyWeight.RolePlayingGame;

public enum TeamUniform {
    SAS("SAS"),
    SPETSNAZ("SPETSNAZ"),
    RANGERS("RANGERS"),
    OP_FOR("OP-FOR");

    public String uniformName;

    TeamUniform(String uniformName) {
        this.uniformName = uniformName;
    }
}

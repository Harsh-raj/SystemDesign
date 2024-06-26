package LLD.FlyWeight.RolePlayingGame;

import java.util.HashMap;
import java.util.Map;

public class TeamBarracks {
    private static Map<String, PlayerTeam> playerTeamCache = new HashMap<>();
    public static PlayerTeam createPlayer(String playerTeam){
        if(playerTeamCache.containsKey(playerTeam)){
            return playerTeamCache.get(playerTeam);
        }else{
            switch (playerTeam) {
                case "SAS" -> {
                    PlayerTeam playerSASObject = new TeamSAS(TeamUniform.SAS, TeamUniform.SAS.name());
                    playerTeamCache.put(playerTeam, playerSASObject);
                    return playerSASObject;
                }
                case "SPETSNAZ" -> {
                    PlayerTeam playerSPETSNAZObject = new TeamSpetsnaz(TeamUniform.SPETSNAZ, TeamUniform.SPETSNAZ.name());
                    playerTeamCache.put(playerTeam, playerSPETSNAZObject);
                    return playerSPETSNAZObject;
                }
                case "RANGERS" -> {
                    PlayerTeam playerRANGERSObject = new TeamRangers(TeamUniform.RANGERS, TeamUniform.RANGERS.name());
                    playerTeamCache.put(playerTeam, playerRANGERSObject);
                    return playerRANGERSObject;
                }
                case "OPFOR" -> {
                    PlayerTeam playerOPFORObject = new TeamOpFor(TeamUniform.OP_FOR, TeamUniform.OP_FOR.name());
                    playerTeamCache.put(playerTeam, playerOPFORObject);
                    return playerOPFORObject;
                }
                case null, default -> {
                    return null;
                }
            }
        }
    }
}
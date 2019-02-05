package Exercise;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");


        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);

        // footballLeague.addTeam(baseballTeam);

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle, 2,1);

        footballLeague.showLeagueTable();


        // Issues with raw types - no compile errors, errors are at runtime
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);

        footballLeague.addTeam(rawTeam);

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addTeam(adelaideCrows);
        rawLeague.addTeam(baseballTeam);
        rawLeague.addTeam(rawTeam);

        League reallyRaw = new League("Really Raw");
        reallyRaw.addTeam(adelaideCrows);
        reallyRaw.addTeam(baseballTeam);
        reallyRaw.addTeam(rawTeam);

    }
}

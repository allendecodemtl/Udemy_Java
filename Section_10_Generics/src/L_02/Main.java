package L_02;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("Man Utd");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle, 2,1);
        //adelaideCrows.matchResult(baseballTeam, 1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}

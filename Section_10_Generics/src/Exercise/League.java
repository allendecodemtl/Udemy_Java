package Exercise;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private ArrayList<T> league;
    private String name;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<T>();
    }

    public boolean addTeam(T team){
        if (league.contains(team)){
            return false;
        }
        return this.league.add(team);
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}

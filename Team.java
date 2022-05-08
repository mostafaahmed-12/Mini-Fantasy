package com.fcis;


import java.util.ArrayList;

public class Team {
    private String name;
private ArrayList<Player> players=new ArrayList<Player>(11);

    public Team(String name) {
        this.name = name;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void setPlayers(Player p){
        this.players.add(p);
}


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String toString(){
        return name+"\n"+players;
    }

}

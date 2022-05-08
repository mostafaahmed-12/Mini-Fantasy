package com.fcis;
import java.util.*;

public class League {
    private ArrayList<User> users= new ArrayList<>(10);
    private  ArrayList<Player> players = new ArrayList<Player>(); //players in league

    public  ArrayList<Player> getPlayers() {
        return players;
    }

    public void setUsers(User u) {

        users.add(u);

    }

    public League() {
        GeneratePlayers();
    }
public void getTOP3(){
        Collections.sort(users);
    System.out.println(users.get(0).toString());
    System.out.println(users.get(1).toString());
    System.out.println(users.get(2).toString());


}
    public ArrayList<User> getUsers() {
        return users;
    }
    private void GeneratePlayers() {
        players.add(new Player("1", "liverpool", 20, "Striker"));
        players.add(new Player("2", "liverpool", 20, "Defender"));
        players.add(new Player("3", "liverpool", 20, "Striker"));
        players.add(new Player("4", "liverpool", 20, "Striker"));
        players.add(new Player("5", "liverpool", 20, "Goalkeeper"));
        players.add(new Player("6", "liverpool", 20, "Midfielder"));

        players.add(new Player("7", "ManCity", 20, "Midfielder"));
        players.add(new Player("8", "ManCity", 20, "Goalkeeper"));
        players.add(new Player("9", "ManCity", 20, "Striker"));
        players.add(new Player("10", "ManCity", 20, "Striker"));
        players.add(new Player("11", "ManCity", 20, "Striker"));
        players.add(new Player("12", "ManCity", 20, "Defender"));

        players.add(new Player("13", "Egypt", 20, "Striker"));
        players.add(new Player("14", "Egypt", 20, "Defender"));
        players.add(new Player("15", "Egypt", 20, "Striker"));
        players.add(new Player("16", "Egypt", 20, "Goalkeeper"));
        players.add(new Player("17", "Egypt", 20, "Midfielder"));
        players.add(new Player("18", "Egypt", 20, "Defender"));

        players.add(new Player("19", "ManUnited", 20, "Defender"));
        players.add(new Player("20", "ManUnited", 20, "Striker"));
        players.add(new Player("21", "ManUnited", 20, "Goalkeeper"));
        players.add(new Player("22", "ManUnited", 20, "Striker"));
        players.add(new Player("23", "ManUnited", 20, "Midfielder"));
        players.add(new Player("24", "ManUnited", 20, "Defender"));

        players.add(new Player("25", "Zamalek", 20, "Defender"));
        players.add(new Player("26", "Zamalek", 20, "Goalkeeper"));
        players.add(new Player("27", "Zamalek", 20, "Striker"));
        players.add(new Player("28", "Zamalek", 20, "Midfielder"));
        players.add(new Player("29", "Zamalek", 20, "Defender"));
        players.add(new Player("30", "Zamalek", 20, "Striker"));

        players.add(new Player("31", "Ahly", 20, "Defender"));
        players.add(new Player("32", "Ahly", 20, "Goalkeeper"));
        players.add(new Player("33", "Ahly", 20, "Striker"));
        players.add(new Player("34", "Ahly", 20, "Striker"));
        players.add(new Player("35", "Ahly", 20, "Midfielder"));
        players.add(new Player("36", "Ahly", 20, "Defender"));

        players.add(new Player("37", "p", 20, "Defender"));
        players.add(new Player("38", "p", 20, "Striker"));
        players.add(new Player("39", "p", 20, "Midfielder"));
        players.add(new Player("40", "p", 20, "Striker"));
        players.add(new Player("41", "p", 20, "Goalkeeper"));
        players.add(new Player("42", "p", 20, "Striker"));

        players.add(new Player("43", "r", 20, "Defender"));
        players.add(new Player("44", "r", 20, "Striker"));
        players.add(new Player("45", "r", 20, "Midfielder"));
        players.add(new Player("46", "r", 20, "Striker"));
        players.add(new Player("47", "r", 20, "Goalkeeper"));
        players.add(new Player("48", "r", 20, "Midfielder"));










    }
    public void DisplayPlayers() {
        System.out.println("ID" + " " + "Name" + " " + "ClubName" + " " + "Position" + "Statue");
        for (int i = 0; i < players.toArray().length; i++) {
            System.out.println(i + 1 + " " + players.get(i).getName()+" "+ players.get(i).getClub_name()+" " + players.get(i).getPosition()+" "+ players.get(i).isTaken());
        }
    }


}

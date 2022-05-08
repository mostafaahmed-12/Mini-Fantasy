package com.fcis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewUser extends User {
    Scanner input = new Scanner(System.in);

    public NewUser() {
        TakeInformation();
        SelectTeam();
    }

    @Override


    public void TakeInformation() {


        System.out.println("Enter your UserName");
        super.setName(input.next());
        System.out.println("Enter your password");
        super.setPassword(input.next());
    }


    private void SelectTeam() {
        League league =Main.league;
        ArrayList<Player>players=league.getPlayers();
        int o = 0;
        boolean f1 =false, f2 = false, f3 = true;
        Map<String, Integer> FrequencyChecker = new HashMap<>();
        for (int i = 0; i < players.size(); i++) {
            FrequencyChecker.put(players.get(i).getClub_name(), 0);
        }
        System.out.println("Enter The Team Name");
        Team team = new Team(input.next());
       league.DisplayPlayers();

        System.out.println("Choose Team Players");

        while (f3 && o < 11) {
            int id_player = input.nextInt();

            if (players.get(id_player - 1).isTaken()) {
                f1 = true;
                if (FrequencyChecker.get(players.get(id_player - 1).getClub_name()) < 3) {
                    team.setPlayers(players.get(id_player - 1));
                    FrequencyChecker.put(players.get(id_player - 1).getClub_name(), FrequencyChecker.get(players.get(id_player - 1).getClub_name()) + 1);
                    f2 = true;
                    players.get(id_player - 1).setTaken(false);
                    System.out.println(FrequencyChecker.get(players.get(id_player - 1).getClub_name()));
                } else {
                    System.out.println("you are not allowed to choose 3 players" + "" + players.get(id_player - 1).getClub_name());
                    f2 = false;
                }

            } else {
                System.out.println("Choose available player");
                f1 = false;
            }

            f3 = true;
            if (f1 && f2) {
                o++;
            }
        }
        setTeam(team);


    }
}
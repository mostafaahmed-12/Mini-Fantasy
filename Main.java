package com.fcis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
      public static League league =new League();
      int   fun(int x){
          this.fun(x=0);
          return x;
      }
    public static void main(String[] args) {

  /*      int n;
        System.out.println(league.getPlayers().size());
        System.out.println("DO you want sign:1 in or register:2");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while (n == 2) {
            NewUser newUser = new NewUser();
            league.setUsers(newUser);
            System.out.println("DO you want to sign:1 in or register:2");
            n = input.nextInt();

        }
        if (n == 1) {
            SignedUser s = new SignedUser();
            s.TakeInformation();

            }
        System.out.println("top 3 scores");
        n = input.nextInt();
            if (n == 3) {
                SignedUser s = new SignedUser();
                for(User u:league.getUsers()){
                    u.setTotal_points( s.CalculateTotalPoint(u.getTeam()));
                }
                league.getTOP3();
            }



    }

   */
        League l=new League();
        NewUser u=new NewUser();
        NewUser u1=new NewUser();
        SignedUser e=new SignedUser();



    }
}

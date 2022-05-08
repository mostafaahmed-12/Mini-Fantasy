package com.fcis;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SignedUser extends  User{
    Scanner input= new Scanner(System.in);
private Random r=new Random();
    @Override
    public  void TakeInformation() {
        System.out.println("Enter your name");

        super.setName(input.next());

        System.out.println("Enter your password");

        super.setPassword(input.next());

      if (Checker(super.getName(),super.getPassword())){

          System.out.println("successful");
      }
      else {

          System.out.println("please try again ");
          TakeInformation();

      }


    }



    private  boolean Checker(String name, String password){
           League league=Main.league;
           boolean checker=false;
            for(User users:league.getUsers()){
    if(name.equals(users.getName())&&password.equals(users.getPassword())){
        checker=true;
        break;

    }
    else {
        checker=false;

    }

}
         return checker;
    }


    public int CalculateTotalPoint(Team team)
    {
        ArrayList<Player>players;
        players=team.getPlayers();
        int sum=0;
        Performance performance;
        for(Player p:players){
            performance=new Performance(r.nextInt(6), r.nextInt(6), r.nextInt(6));
            sum+=p.Calculate_Points(performance,p.getPosition());
            p.setPerformance(performance);
          //  System.out.println(p.getPerformance().getAssists()+" "+p.getPerformance().getCleanSheet()+" "+p.getPerformance().getGoals()+" "+p.getPosition());
        }
//mainCaller();//call to test the program dose not stop until enter any number

        return sum;


    }
  public static void mainCaller()
    {
        System.out.println("mainCaller!");

Main.main(null);
    }

}
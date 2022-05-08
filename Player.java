package com.fcis;

public class Player {
    private String name;
    private String club_name;
    private int age;
    private String position;
    private boolean IsTaken=true;
    private Performance performance=new Performance();

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public boolean isTaken() {
        return IsTaken;
    }

    public void setTaken(boolean taken) {
        IsTaken = taken;
    }

    public Player(String name, String club_name, int age, String position) {
        super();
        this.name = name;
        this.club_name = club_name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public Player(){


}
    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float Calculate_Points(Performance performance, String position) {
        float score=0;
        if (position=="Goalkeeper")
        {
            score=performance.getGoals()*10+performance.getCleanSheet()*3+performance.getAssists()*7;
        }
        else if (position=="Defender")
        {
            score=performance.getGoals()*7+performance.getCleanSheet()*4+performance.getAssists()*5;
        }
        else if (position=="Midfielder")
        {
            score=performance.getGoals()*4+performance.getCleanSheet()*2+performance.getAssists()*3;
        }
        else if (position=="Striker")
        {
            score=performance.getGoals()*3+performance.getCleanSheet()*1+performance.getAssists()*4;
        }
        return score;
    }
}

package com.fcis;

import java.util.ArrayList;
import java.util.Scanner;

public abstract   class User implements Comparable<User> {
    private String name;
    private String password;
    private Team team ;
    private  int total_points;
    public User(){}
    public abstract void TakeInformation();
    public String getName() {
        return name;
    }
public String toString(){
        return this.name+" "+this.total_points;

}
    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public String getPassword() {
        return password;
    }

    public Team getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public int compareTo(User u) {

        int s=((User)u).getTotal_points();
return s-this.getTotal_points();
    }
}
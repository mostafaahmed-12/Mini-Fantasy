package com.fcis;

public  class Performance {

    private  int goals;
    private int Assists;
    private int cleanSheet;

    public Performance() {
    }

    public Performance(int goals, int assists, int cleanSheet) {
        this.goals = goals;
      this .Assists  = assists;
        this.cleanSheet = cleanSheet;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return Assists;
    }

    public void setAssists(int assists) {
        Assists = assists;
    }

    public int getCleanSheet() {
        return cleanSheet;
    }

    public void setCleanSheet(int cleanSheet) {
        this.cleanSheet = cleanSheet;
    }


}

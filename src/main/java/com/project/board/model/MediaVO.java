package com.project.board.model;

public class MediaVO {
    private int numNo;
    private String numTitle;
    private String numURL;
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getNumNo() {
        return numNo;
    }

    public void setNumNo(int numNo) {
        this.numNo = numNo;
    }

    public String getNumTitle() {
        return numTitle;
    }

    public void setNumTitle(String numTitle) {
        this.numTitle = numTitle;
    }

    public String getNumURL() {
        return numURL;
    }

    public void setNumURL(String numURL) {
        this.numURL = numURL;
    }
}

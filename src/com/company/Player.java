package com.company;

public class Player {

    String playerName;
    int playerRating;
    String position;

    public Player(String playerName, int playerRating, String position) {
        this.playerName = playerName;
        this.playerRating = playerRating;
        this.position = position;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(int playerRating) {
        this.playerRating = playerRating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

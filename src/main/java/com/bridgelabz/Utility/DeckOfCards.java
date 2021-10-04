package com.bridgelabz.Utility;

public class DeckOfCards {
    static int numOfPlayers = 4;
    static int cardsToEachPlayer = 9;

    public String[][] generateCards(String[] suits, String[] rank) {

        String[][] totalCards = new String[4][13];
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                totalCards[i][j] = suits[i]+rank[j];
            }
        }
        return totalCards;
    }
    public void printPlayerCard(String[][] player) {
        for (int i = 0; i<numOfPlayers; i++) {
            System.out.print("Player " + (i+1) + " : ");
            for (int j=0; j<cardsToEachPlayer; j++) {
                System.out.print(player[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_data;

/**
 *
 * @author patrickdaley1
 */
public class ScoreBoard {

    private int numEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];

    }

    public void add(GameEntry e) {

        if (numEntries < board.length) {

        }
        int j = numEntries;

        board[j] = e;
        numEntries++;
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > numEntries) {
            throw new IndexOutOfBoundsException("Invaild index: " + i);
        }
        GameEntry temp = board[i];
        board[i] = board[numEntries - 1];
        board[numEntries - 1] = null;
        numEntries--;
        return temp;

    }

    public String toString() {

        String scoreboard = "";
        
        for (int x = 0; x < numEntries; x++) {
          scoreboard += String.format( board[x].getName(),board[x].getScore());
         
        }
       return scoreboard;
    }
}

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
public class ScoreBoardTest {
    public static void main (String [] args){
        ScoreBoard scoreboard = new ScoreBoard(3);
      String [] player = {"Patrick \n","Sarah \n","Kyle \n"};
      int [] score  = {100,98,99};
      
     for(int y=0;y< player.length;y++){
         GameEntry gameEntry = new GameEntry(player[y],score[y]);
         scoreboard.add(gameEntry);
         System.out.println("Add Players and Scores: " + gameEntry);
       
        System.out.println(scoreboard);
       
         
        
     }
        for(int y=0;y< player.length;y++){
  System.out.println("Removing Player: "+scoreboard.remove(0));
        System.out.println(scoreboard);
        }
    }
    }

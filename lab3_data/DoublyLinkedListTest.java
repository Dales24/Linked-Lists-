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
public class DoublyLinkedListTest {
        public static void main (String [] args){
              
        String[] name = {"Pat1", "Pat2", "Pat3", "Pat4", "Pat5",
  "Pat6", "Pat7", "Pat8", "Pat9", "Pat10"};
        int[] score = {1, 3, 2, 5, 4
        , 12, 15, 4, 8, 11};
        DoublyLinkedList<GameEntry> board = new DoublyLinkedList();

        for (int x = 0; x < name.length; x++) {
            GameEntry game = new GameEntry(name[x], score[x]);
            // System.out.println("ScoreBoard:" + game);

            if (board.size() == 0) {
                board.addFirst(game);

            } else if (board.size() == 1) {
                if (game.getScore() > board.first().getScore()) {
                    board.addFirst(game);

                } else {
                    board.addLast(game);
                }
            } else if (game.getScore() > board.first().getScore()) {
                board.addFirst(game);

            } else if (game.getScore() < board.last().getScore()) {
                board.addLast(game);

            } else {
                GameEntry lastEntry = board.last();
                while (game.getScore() < board.first().getScore()) {

                    board.addLast(board.removeFirst());

                    //  System.out.println(board.first());
                }
                board.addFirst(game);

                while (lastEntry.getScore() != board.last().getScore()) {
                    board.addLast(board.removeFirst());

                }
            }
        }

        System.out.println(board);
        board.first().getScore();
             
         for (int y = 0; y < name.length; y++) {
            System.out.println("Removing players" + board.removeFirst());
            System.out.println(board);
        }
    }
}

        
             

// need to ask the user to remove each score. 
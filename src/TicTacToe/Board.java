package TicTacToe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Board {
    int[] boardState = {0,0,0,0,0,0,0,0,0,0};
    int winner;

    Board(){
        Arrays.fill(boardState, 3);
    }

    Board(HashMap<Integer, Integer> turnLog){
        Set<Integer> getKeys = turnLog.keySet();
        for (Integer i : getKeys) {
            if((i % 2) == 0){
                boardState[turnLog.get(i)] = 1;
            } else {
                boardState[turnLog.get(i)] = 2;
            }
        }

        // Check if a winner exists
        if (boardState[1] == boardState[2] && boardState[2] == boardState[3] && boardState[1] != 0){
            if(boardState[1] == 1){
                winner = 2;
            } else if(boardState[1] == 2){
                winner = 1;
            }
        }
        if (boardState[4] == boardState[5] && boardState[5] == boardState[6] && boardState[4] != 0){
            if(boardState[4] == 1){
                winner = 2;
            } else if(boardState[4] == 2){
                winner = 1;
            }
        }
        if (boardState[7] == boardState[8] && boardState[8] == boardState[9] && boardState[7] != 0){
            if(boardState[7] == 1){
                winner = 2;
            } else if(boardState[7] == 2){
                winner = 1;
            }
        }
        if (boardState[1] == boardState[4] && boardState[4] == boardState[7] && boardState[1] != 0){
            if(boardState[1] == 1){
                winner = 2;
            } else if(boardState[1] == 2){
                winner = 1;
            }
        }
        if (boardState[2] == boardState[5] && boardState[5] == boardState[8] && boardState[2] != 0){
            if(boardState[2] == 1){
                winner = 2;
            } else if(boardState[2] == 2){
                winner = 1;
            }
        }
        if (boardState[3] == boardState[6] && boardState[6] == boardState[9] && boardState[3] != 0){
            if(boardState[3] == 1){
                winner = 2;
            } else if(boardState[3] == 2){
                winner = 1;
            }
        }
        if (boardState[1] == boardState[5] && boardState[5] == boardState[9] && boardState[1] != 0){
            if(boardState[1] == 1){
                winner = 2;
            } else if(boardState[1] == 2){
                winner = 1;
            }
        }
        if (boardState[7] == boardState[5] && boardState[5] == boardState[3] && boardState[7] != 0){
            if(boardState[7] == 1){
                winner = 2;
            } else if(boardState[7] == 2){
                winner = 1;
            }
        }
    }

    public String toString(){
        String[] boardFields = {"  ","   ","   ","   ","   ","   ","   ","   ","   ","   "};
        String boardOutput;
        for(int i = 1; i < boardState.length; i++){
            //For each field on the board, set the value to an X, O or leave it blank.
            switch (boardState[i]){
                case 1:
                    boardFields[i] = " O ";
                    break;
                case 2:
                    boardFields[i] = " X ";
                    break;
                case 3:
                    boardFields[i] = " " + i + " ";
            }
        }

        //Construct the board output
        boardOutput = boardFields[7] + "|" + boardFields[8] + "|" + boardFields[9] + "\n---+---+---\n" + boardFields[4] + "|" + boardFields[5] + "|" + boardFields[6] + "\n---+---+---\n" + boardFields[1] + "|" + boardFields[2] + "|" + boardFields[3];

        return boardOutput;
    }
}

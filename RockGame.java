import javax.swing.*;
import java.util.Random;

public class RockGame {
    public static void main(String[] args) {
        String rock, scissor, paper, userSelect, pcSelect = null;
        int pcRandom;
        int userScore = 0;
        int pcScore = 0;

            JFrame f;

            f = new JFrame();
            JOptionPane.showMessageDialog(f, "The first player who reaches 5 points wins."
                    , "Let's Start", JOptionPane.INFORMATION_MESSAGE);
        do{
            Random random = new Random();
            pcRandom = random.nextInt(3) + 1;
            if (pcRandom == 1) {
                pcSelect = "Rock";
            } else if (pcRandom == 2) {
                pcSelect = "Scissor";
            } else if (pcRandom == 3) {
                pcSelect = "Paper";
            }
            pcSelect = pcSelect.substring(0,1).toUpperCase()+pcSelect.substring(1);
            userSelect = JOptionPane.showInputDialog(f,  "My score = " + pcScore + " -- " + "Your score = " + userScore + "\n Rock, paper or scissor? "
                    , "Round:1", JOptionPane.INFORMATION_MESSAGE);
            userSelect = userSelect.substring(0,1).toUpperCase()+userSelect.substring(1).toLowerCase();

            if (userSelect.equals(pcSelect)) {
                JOptionPane.showMessageDialog(f, "It's a tie."
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (userSelect.equals("Rock") && pcSelect.equals("Paper")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+pcSelect+" eats "+userSelect+". You lose!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                pcScore += 1;
            } else if (userSelect.equals("Rock") && pcSelect.equals("Scissor")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+userSelect+" eats "+pcSelect+". You win!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                userScore += 1;

            } else if (userSelect.equals("Paper") && pcSelect.equals("Rock")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+userSelect+" eats "+pcSelect+". You win!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                userScore += 1;

            } else if (userSelect.equals("Paper") && pcSelect.equals("Scissor")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+pcSelect+" eats "+userSelect+". You lose!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                pcScore += 1;

            } else if (userSelect.equals("Scissor") && pcSelect.equals("Rock")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+pcSelect+" eats "+userSelect+". You lose!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                pcScore += 1;

            } else if (userSelect.equals("Scissor") && pcSelect.equals("Paper")) {
                JOptionPane.showMessageDialog(f, "My answer is "+pcSelect+". "+userSelect+" eats "+pcSelect+". You win!!"
                        , "Message", JOptionPane.INFORMATION_MESSAGE);
                userScore += 1;

            }
            else    {
                JOptionPane.showMessageDialog(f,
                        "Please put a correct answer");
            }

        }while(pcScore < 5  &&  userScore < 5);
        if (userScore == 5 ) {
            JOptionPane.showMessageDialog(f, "Congratulations! You win!\n Scores:  You: "+userScore+"  Me: "+pcScore);
        }
        else if (pcScore == 5){
            JOptionPane.showMessageDialog(f, "I'm sorry! You lose!\n Scores:  You: "+userScore+"  Me: "+pcScore);
        }


    }
}
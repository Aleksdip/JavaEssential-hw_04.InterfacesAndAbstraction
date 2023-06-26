package task_02.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        Scanner in = new Scanner(System.in);
        System.out.println("Instruction for use: button 1 - play, 2 - pause, 3 - stop (exit), 4 - record");

        for (; ; ) {
            System.out.println("Press button");
            int button = in.nextInt();
            switch (button) {
                case 1 :
                    player.play();
                    continue;
                case 2:
                    player.pause();
                    continue;
                case 3:
                    player.stop();
                    break;
                case 4:
                    player.record();
                    continue;
            }
            break;
        }
    }
}

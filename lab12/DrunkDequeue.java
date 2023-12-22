package lab12;

import java.util.ArrayDeque;
import java.util.Deque;

public class DrunkDequeue {
    Deque<Integer> firstPlayer;
    Deque<Integer> secondPlayer;

    public DrunkDequeue(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new ArrayDeque<>();
        this.secondPlayer = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            this.firstPlayer.add(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.add(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count < 106) {
            if (firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0) {
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());

            } else {
                secondPlayer.add(firstPlayer.remove());
                secondPlayer.add(secondPlayer.remove());
            }
            count++;
        }
        if (count >= 106) return "botva";
        if (firstPlayer.isEmpty()) return "second " + count;
        else return "first ";
    }

    public static void main(String[] args) {
        System.out.println(new DrunkDequeue("13579", "24680").play());

    }

}
package lab12;

import java.util.LinkedList;
import java.util.Scanner;

public class DrunkDoubleList {
    private LinkedList<Integer> fp;
    private LinkedList<Integer> sp;

    public DrunkDoubleList(String fp, String sp) {
        this.fp = new LinkedList<>();
        this.sp = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            this.fp.add(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count <= 106) {
            if (fp.peek() > sp.peek() && sp.peek() != 0) {
                fp.add(fp.remove());
                fp.add(sp.remove());

            } else {
                sp.add(fp.remove());
                sp.add(sp.remove());
            }
            count++;
        }

        if (count >= 106) return "botva";
        if (fp.isEmpty()) return "second " + count;
        else return "first ";
    }

    public static void main(String[] args) {
        System.out.println(new DrunkDoubleList("13579", "24680").play());
    }

}

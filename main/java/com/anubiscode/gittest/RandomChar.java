package main.java.com.anubiscode.gittest;

import java.util.Random;

class RandomChar {

    static char getRandom() {
        Random random = new Random();
        char ch;
        do {
            ch = (char) (random.nextInt(122) + 33);
        } while (!(ch + "").matches("[A-Za-z]"));
        return ch;
    }
}

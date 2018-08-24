package com.howky.mike.libjokeprovider;

import java.util.Random;

public class JokeProvider {
    private static final String[] jokesBase = {
            " Anton, do you think I’m a bad mother?\n" +
                    "\n" +
                    "My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "I hate Russian dolls...so full of themselves.",
            "It is hard to explain puns to kleptomaniacs because they always take things literally.",
            "Time flies like an arrow, fruit flies like a banana."
    };

    public String getJoke() {
        Random random = new Random();
        int index = random.nextInt(5);
        return jokesBase[index];
    }

}

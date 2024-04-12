package CIT130;

import java.util.Random;

public class Jobs implements RoboJobs3000 {
    Random rand = new Random();

    public void comedian(){                             // Choice 1
        String[] jokes = {
            "What did one hat say to the other?...You wait here. I’ll go on a head.",
            "What’s orange and sounds like a carrot? ...A parrot", "What did the buffalo say when his son left for college?... Bison",
            "What did 0 say to 8?... Nice belt", "What do you call a pig that does karate?... A pork chop"};
        int index = rand.nextInt(jokes.length);

        System.out.println(jokes[index]);                // Print joke at random index from jokes list
        }

    public void politician(){                           // Choice 2
            System.out.println("Vote Robo100 for president 2024");
        }

    public void singer(){                               // Choice 3
        String[] sounds = {"aaa", "eee", "ooo", "beep boop", "yeh"};
        for(int i = 0; i < sounds.length; i++){         // iterate over list
            int index = rand.nextInt(sounds.length);    // randomly selects one of the strings from the sounds list
            System.out.print(sounds[index] + " ");      // prints the randomly selected string separated by a space
        }
        System.out.println();                           // prints empty line
        }

    public void mathTeacher(int n1, int n2){            // Choice 4
        int sumTotal = n1 + n2;
        System.out.printf("The sum total of %d and %d is %d\n", n1, n2, sumTotal);  // print sum of the 2 integer arguments given
    }

    public void madeUpFact(){                           // Choice 5
        String [] part1 = {"In 2025 ", "10 years ago ", "If you look closely", "Every Tuesday "};
        String [] part2 = {"we will be thinking ", "I wanted to ", "you will see that ", "I have to attend "};
        String [] part3 = {"about flying cars", "be a pilot", "it is in fact a prime number", "lectures on site"};

        int firstPart = rand.nextInt(part1.length);     // Randomly select 1 of strings in part1 list
        int secondPart = rand.nextInt(part2.length);    // Randomly select 1 of strings in part2 list
        int thirdPart = rand.nextInt(part3.length);     // Randomly select 1 of strings in part3 list

        String sentence = part1[firstPart] + part2[secondPart] + part3[thirdPart];
        System.out.println(sentence);                   // prints the random selections for every part concatenated
    }

    public void quit() {                                // Choice 6
        System.out.println("Program ending.");
        System.out.println("Robot quiet quitting job.");
        System.exit(0);
    }

}



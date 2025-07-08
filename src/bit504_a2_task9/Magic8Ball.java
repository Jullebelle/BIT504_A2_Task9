package bit504_a2_task9;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print shape
        System.out.println("     _______");
        System.out.println("   /       \\");
        System.out.println("  /  MAGIC  \\");
        System.out.println("  \\   8BALL /");
        System.out.println("   \\_______/");
        System.out.println();

        // Ask user for a question
        System.out.print("Ask the Magic 8-Ball your question: ");
        input.nextLine();

        // Randomly select one of four responses
        String[] responses = {
            "Yes – definitely.",
            "My sources say no.",
            "Concentrate and ask again.",
            "Cannot predict now."
        };

        Random rand = new Random();
        int index = rand.nextInt(responses.length);


        // Print answer
        System.out.println("🔮 " + responses[index]);

        input.close();
    }
}


package util;

import java.util.Random;

public class Utility {

    public static String getRandomFirstName() {
        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabella", "Jack"};
        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];

    }

    public static String getRandomLastName() {
        String[] lastNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabella", "Jack"};
        Random random = new Random();
        int index = random.nextInt(lastNames.length);
        return lastNames[index];

    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "hotmail.com", "yahoo.com"}; // Common TLDs (replace or add based on your needs)
        int randomDomainIndex = new Random().nextInt(domains.length);
        String randomDomain = domains[randomDomainIndex];

        int usernameLength = 8; // Adjust username length as needed
        StringBuilder usernameBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < usernameLength; i++) {
            int charType = random.nextInt(3); // Choose between letters or numbers
            if (charType == 0) {
                usernameBuilder.append((char) (random.nextInt(26) + 'a')); // Lowercase letter
            } else if (charType == 1) {
                usernameBuilder.append((char) (random.nextInt(26) + 'A')); // Uppercase letter
            } else {
                usernameBuilder.append((char) (random.nextInt(10) + '0')); // Number
            }
        }

        String username = usernameBuilder.toString();
        return username + "@" + randomDomain;
    }

    public static String generateRandomCompanyTitle() {
        String[] adjectives = {"Innovative", "Reliable", "Sustainable", "Cutting-Edge", "Streamlined"};
        String[] nouns = {"Solutions", "Technologies", "Services", "Consulting", "Marketing"};
        String[] suffixes = {"Inc.", "LLC", "Co."}; // Optional suffixes

        Random random = new Random();
        int adjectiveIndex = random.nextInt(adjectives.length);
        int nounIndex = random.nextInt(nouns.length);
        int suffixIndex = random.nextInt(suffixes.length); // Might not choose a suffix

        StringBuilder titleBuilder = new StringBuilder();
        titleBuilder.append(capitalizeFirstLetter(adjectives[adjectiveIndex]));
        titleBuilder.append(" ");
        titleBuilder.append(capitalizeFirstLetter(nouns[nounIndex]));

        if (suffixIndex > 0) { // Only append suffix if chosen randomly
            titleBuilder.append(" ");
            titleBuilder.append(suffixes[suffixIndex]);
        }

        return titleBuilder.toString();
    }

    private static String capitalizeFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static int generateRandomIntBetween1and7() {
        Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 6 (inclusive)
        int randomInt = random.nextInt(7);
        // Add 1 to ensure the range is 1 to 7 (inclusive)
        return randomInt + 1;
    }
}
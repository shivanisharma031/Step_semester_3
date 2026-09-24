package week1.assigment_problems;

public class MovieReviewWordProfiler {

    public static void classifyWordLengths(String review) {
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        String[] words = review.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            // Count only letters so punctuation like "!" or "," doesn't affect length
            String cleaned = words[i].replaceAll("[^a-zA-Z]", "");
            int len = cleaned.length();

            if (len == 0) {
                continue;
            } else if (len <= 4) {
                shortCount++;
            } else if (len <= 8) {
                mediumCount++;
            } else {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}


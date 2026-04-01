import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizProcessor {

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length)
            throw new InvalidQuizSubmissionException("Answer length mismatch");

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i]))
                score++;
        }
        return score;
    }

    static String getGrade(int score, int total) {
        if (score == total) return "A";
        if (score >= total / 2) return "B";
        return "C";
    }

    public static void main(String[] args) {

        String[] correctAns = {"A", "B", "C", "D"};
        List<Integer> scores = new ArrayList<>();

        try {
            int s1 = calculateScore(correctAns, new String[]{"A", "B", "C", "D"});
            int s2 = calculateScore(correctAns, new String[]{"A", "C", "C", "D"});

            scores.add(s1);
            scores.add(s2);

            System.out.println("User1 Grade: " + getGrade(s1, correctAns.length));
            System.out.println("User2 Grade: " + getGrade(s2, correctAns.length));

            System.out.println("All Scores: " + scores);

        } catch (InvalidQuizSubmissionException e) {
            System.out.println(e.getMessage());
        }
    }
}

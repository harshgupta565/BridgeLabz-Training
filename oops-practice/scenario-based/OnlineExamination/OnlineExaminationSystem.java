package OnlineExamination;

import java.util.*;

// ---------- OOP Classes ----------
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Question {
    String question;
    String correctAnswer;

    Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
}

class Exam {
    String examName;
    List<Question> questions = new ArrayList<>();

    Exam(String examName) {
        this.examName = examName;
    }

    void addQuestion(Question q) {
        questions.add(q);
    }
}

// ---------- Interface ----------
interface EvaluationStrategy {
    int evaluate(List<Question> questions, List<String> answers);
}

// ---------- Polymorphism ----------
class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> questions, List<String> answers) {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).correctAnswer.equals(answers.get(i))) {
                score++;
            }
        }
        return score;
    }
}

class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> questions, List<String> answers) {
        return answers.size(); // simple logic
    }
}

// ---------- Custom Exception ----------
class ExamTimeExpiredException extends Exception {
    ExamTimeExpiredException(String message) {
        super(message);
    }
}

// ---------- Main Class ----------
public class OnlineExaminationSystem {
    public static void main(String[] args) {

        Student student = new Student(1, "Harsh");

        Exam exam = new Exam("Java Online Test");
        exam.addQuestion(new Question("What is JVM?", "Java Virtual Machine"));
        exam.addQuestion(new Question("What is OOP?", "Object Oriented Programming"));

        List<String> answers = new ArrayList<>();
        answers.add("Java Virtual Machine");
        answers.add("Object Oriented Programming");

        EvaluationStrategy evaluation = new ObjectiveEvaluation(); // Polymorphism

        try {
            boolean timeExpired = false;
            if (timeExpired) {
                throw new ExamTimeExpiredException("Exam time expired!");
            }

            int score = evaluation.evaluate(exam.questions, answers);

            System.out.println("Student Name: " + student.name);
            System.out.println("Exam: " + exam.examName);
            System.out.println("Score: " + score);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}


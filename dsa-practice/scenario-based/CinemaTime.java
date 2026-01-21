import java.util.ArrayList;
import java.util.List;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

public class CinemaTime {

    List<String> movieTitles = new ArrayList<>();
    List<String> showTimes = new ArrayList<>();

    void addMovie(String title, String time) throws InvalidTimeFormatException {
        String[] parts = time.split(":");
        if (parts.length != 2) {
            throw new InvalidTimeFormatException("Time must be HH:MM");
        }
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new InvalidTimeFormatException("Invalid time " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Added: " + title + " at " + time);
    }

    void displayAllMovies() {
        System.out.println("\nAll Movies:");
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println((i + 1) + ". " + movieTitles.get(i) + " - " + showTimes.get(i));
        }
    }

    void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println((i + 1) + ". " + movieTitles.get(i) + " - " + showTimes.get(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No movies found for: " + keyword);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error accessing movie list");
        }
    }

    void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);
        System.out.println("\nMovie Report:");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println((i + 1) + ". " + titlesArray[i] + " - " + timesArray[i]);
        }
    }

    public static void main(String[] args) {
        CinemaTime cinema = new CinemaTime();
        try {
            cinema.addMovie("Avengers", "18:30");
            cinema.addMovie("Inception", "21:15");
            cinema.addMovie("Interstellar", "20:00");
        } catch (InvalidTimeFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        cinema.displayAllMovies();
        cinema.searchMovie("Incep");
        cinema.generateReport();
    }
}


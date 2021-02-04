import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoGame {
    private String name;
    private ArrayList<String> genre;
    private String ageRating;
    private String console;

    

    public VideoGame(String name, ArrayList<String> genre, String ageRating, String console) {
        setName(name);
        setGenre(genre);
        setAgeRating(ageRating);
        setConsole(console);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2)
            this.name = name;
        else
            throw new IllegalArgumentException("At least 2 letters");
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        List<String> ageRatingValues = Arrays.asList("E","M","18+","T","R","13+","E10","G");
        if (ageRatingValues.contains(ageRating))
            this.ageRating = ageRating;
        else
            throw new IllegalArgumentException((ageRating + " is not valid. Options are : " + ageRatingValues));
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        List<String> consoleNames = Arrays.asList("GameBoy", "PlayStation", "Sega", "PC");
        if (consoleNames.contains(console))
            this.console = console;
        else
            throw new IllegalArgumentException("Valid console names are: " + consoleNames);
    }
}

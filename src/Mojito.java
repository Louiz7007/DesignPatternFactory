import java.util.ArrayList;
import java.util.List;

public class Mojito implements Cocktail{

    private static final String DESCRIPTION = "Ich bin ein Mojito!";
    private static final ArrayList<String> zutaten = new ArrayList<>(List.of(
            "Rum",
            "Soda",
            "Limette",
            "Crushed Ice",
            "brauner Zucker",
            "Minze"
    ));

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void getZutaten() {
        zutaten.stream().forEach(System.out::println);
    }
}

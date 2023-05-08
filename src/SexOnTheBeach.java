import java.util.ArrayList;
import java.util.List;

public class SexOnTheBeach implements Cocktail{

    private static final String DESCRIPTION = "Ich bin ein Sex on the Beach!";
    private static final ArrayList<String> zutaten = new ArrayList<>(List.of(
            "Eiswürfel",
            "Wodka",
            "Pfirsichlikör",
            "Cranberry-Saft",
            "Zitronensaft",
            "Eiswürfel",
            "Orangensaft"
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

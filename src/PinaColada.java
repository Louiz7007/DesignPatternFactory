import java.util.ArrayList;
import java.util.List;

public class PinaColada implements Cocktail{

    private static final String DESCRIPTION = "Ich bin eine Pina Colada!";
    private static final ArrayList<String> zutaten = new ArrayList<>(List.of(
            "Zitronensaft",
            "Kokos-Sirup",
            "Schlagobers",
            "Rum",
            "Ananassaft",
            "Ananasscheibe"
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

public class BarKeeper {
    public static Cocktail mixCocktail(CocktailArt cocktailArt) {
        switch (cocktailArt) {
            case MOJITO -> {
                return new Mojito();
            }
            case PINA_COLADA -> {
                return new PinaColada();
            }
            case SEX_ON_THE_BEACH -> {
                return new SexOnTheBeach();
            }
        }
        return null;
    }
}

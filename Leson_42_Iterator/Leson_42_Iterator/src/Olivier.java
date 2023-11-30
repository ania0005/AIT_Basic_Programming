import java.util.Iterator;

public class Olivier implements Iterable<String> {

private  String [] ingredients;

    public Olivier(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public Iterator<String> iterator() {
        return new OlivierIterator();
    }
    private class OlivierIterator implements Iterator<String>{
        private int currentIndex = 0;
        String currentIngredients;

        @Override
        public boolean hasNext() {
            return currentIndex < ingredients.length;
        }

        @Override
        public String next() {
            if (hasNext()) {
                currentIngredients = ingredients[currentIndex];
                currentIndex++;
                return currentIngredients;
            }
            return null;
        }
    }
}

public class MagicWord {
    private static final String[] words = {"futbol","ribesalbes",
            "felicidad", "muerte","español", "hallowen", "nico", "feo", "cristiano", "ronaldo", "sergi", "juan", "mbappe", "pokemon", "gta", "madrid", "niga", "dictador", "reina", "calvo", "vini", "funeral", "virgen", "eugen", "alejandro", "chatgpt", "vox", "psoe", "spiderman", "programacion", "ordenador", "sandia", "melon", "ladron", "raton", "pereira", "komanche", "pache", "limpiar", "vaca", "museo", "fortnite", "hormiga", "pikachu", "homosexual", "dedos", "castellon", "mono", "fumar", "cigarro", "irene", "abecedario", "pizarra", "cabeza", "monitor", "madre", "array", "llorar", "cansancio", "examen", "perro", "sanchez"};
    private String word;
    private boolean[] rightLetters;
    public MagicWord() {
        int index = (int) (Math.random() * words.length);
        word = words[index];
        rightLetters = new boolean[word.length()];
        for (int i = 0; i < rightLetters.length; i++) {
            rightLetters[i] = false;
        }
    }
    public boolean check(String s) {
        if (s.length() == 1) {
            checkChar(s.charAt(0));
            return false;
        } else {
            return checkWord(s);
        }
    }
    private void checkChar(char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == Character.toLowerCase(ch)) {
                rightLetters[i] = true;
            }
        }
    }
    private boolean checkWord(String s) {
        if (s.equalsIgnoreCase(word)) {
            return true;
        }
        return false;
    }
    public String getUnderscoreString() {
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            if (rightLetters[i]) {
                s += word.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }
}

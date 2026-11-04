public class MagicWord {
    private static final String[] palabras = {"futbol","ribesalbes",
            "felicidad", "muerte","español", "hallowen", "nico", "feo", "cristiano", "ronaldo", "sergi", "juan", "mbappe", "pokemon", "gta", "madrid", "niga", "dictador", "reina", "calvo", "vini", "funeral", "virgen", "eugen", "alejandro", "chatgpt", "vox", "psoe", "spiderman", "programacion", "ordenador", "sandia", "melon", "ladron", "raton", "pereira", "komanche", "pache", "limpiar", "vaca", "museo", "fortnite", "hormiga", "pikachu", "homosexual", "dedos", "castellon", "mono", "fumar", "cigarro", "irene", "abecedario", "pizarra", "cabeza", "monitor", "madre", "array", "llorar", "cansancio", "examen", "perro", "sanchez"};
    private final String palabra;
    private final boolean[] rightLetters;
    public MagicWord() {
        int index = (int) (Math.random() * palabras.length);
        palabra = palabras[index];
        rightLetters = new boolean[palabra.length()];
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
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == Character.toLowerCase(ch)) {
                rightLetters[i] = true;
            }
        }
    }
    private boolean checkWord(String s) {
        return s.equalsIgnoreCase(palabra);
    }
    public String getUnderscoreString() {
        String s = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (rightLetters[i]) {
                s += palabra.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }
}

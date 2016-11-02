package Ingles;

import java.util.Random;

public abstract class SinImagen extends Words {

    public String Word2;

    public SinImagen(int IdWord, String Word) {
        super(IdWord, Word);
        Word2 = Word;
    }

    public final String Alterar(String entrada) {
        String salida = "";
        Random rnd = new Random();
        int b = (int) (rnd.nextDouble() * 4 + 0); //define donde empezara a modificarse

        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.substring(i, i + 1).equals(" ")) {
                salida += " ";
                b += 3;
            } else if (i == b) {
                salida += "*";
                b += 3;
            } else {
                salida += entrada.substring(i, i + 1);
            }
        }
        return salida;
    }

    @Override
    public String obtenerDatos() {
        return Alterar(Word2);
    }

}

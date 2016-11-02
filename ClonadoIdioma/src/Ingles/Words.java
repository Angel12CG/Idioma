package Ingles;
public abstract class Words implements NewInterface{
    
    private int IdWord;
    private String Word;

    public Words(int IdWord, String Word) {
        this.IdWord = IdWord;
        this.Word = Word;
    }

    @Override
    public int getIdWord() {
        return IdWord;
    }

    public void setIdWord(int IdWord) {
        this.IdWord = IdWord;
    }

    @Override
    public String getWord() {
        return Word;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }

    //se declara un metodo abstracto
    @Override
    public abstract String obtenerDatos();
    
}

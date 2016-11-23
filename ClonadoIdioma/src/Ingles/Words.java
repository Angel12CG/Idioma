package Ingles;
public abstract class Words implements NewInterface{
    
    private int IdWord;
    private String Word;
    private String traduccion;

    public Words(int IdWord, String Word, String traduccion) {
        this.IdWord = IdWord;
        this.Word = Word;
        this.traduccion=traduccion;
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

    @Override
    public String getTraduccion() {
        return traduccion;
    }
    
    public void setWord(String Word) {
        this.Word = Word;
    }

    //se declara un metodo abstracto
    @Override
    public abstract String obtenerDatos();    
}

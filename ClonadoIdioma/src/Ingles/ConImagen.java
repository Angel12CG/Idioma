package Ingles;
public abstract class ConImagen extends Words{
    public String NameImage;
    
    public ConImagen(int IdWord, String Word, String traduccion){
        super(IdWord,Word,traduccion);
        NameImage=IdWord+"_"+Word+".jpg";
    }

    @Override
    public String obtenerDatos(){
        return NameImage;
    }
}
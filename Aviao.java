public class Aviao implements Veiculo {
    private String barulho;
    private String id;
    @Override
    public String getTipo(){
        return "Aviao";
    }
    @Override
    public String getAmbiente(){
        return "Ar";
    }
    @Override
    public void setBarulho(String barulho){
        this.barulho = barulho;
    }

    public Aviao (){
        this.barulho = "turbina de aviao";
    }
    @Override
    public void setid(String id){
        this.id=id;

       }

       @Override
       public String getid(){
        return ("Aviao" + this.id);
       }
}

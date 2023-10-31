public class Carro implements Veiculo {
    private String barulho;
    private String id;
    @Override
    public String getTipo() {
     return "Carro";
    }
    @Override
    public String getAmbiente(){
        return "Terreste";

    }
    @Override
    public void setBarulho(String barulho){
        this.barulho = barulho;
    }
       public Carro() {
          this.barulho = "alto demais";

       }
       @Override
       public void setid(String id){
        this.id=id;

       }
       @Override
       public String getid(){
        return ("Carro" + this.id);

       }
      
}

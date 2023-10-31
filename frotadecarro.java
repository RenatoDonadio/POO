public class frotadecarro {
    public static void main(String[] args) {
        Carro[] frotacarro = new Carro [3];
        Carro c1 = new Carro();
        c1.setid("Carro 1");
        frotacarro[0] = c1;

        Carro c2 = new Carro();
        c2.setid("Carro 2");
        frotacarro[1] = c2;

        Carro c3 = new Carro();
        c3.setid("Carro 3");
        frotacarro[2] = c3;

       
          
        for (Carro c : frotacarro){
            System.out.println(c.getid());
        }

        Aviao [] frotaAviao = new Aviao[2];
        Aviao a1 = new Aviao();
        a1.setid("Aviao 1");
        frotaAviao[0] = a1;
        Aviao a2 = new Aviao();
        a2.setid("Aviao 2");
        frotaAviao[1] = a2;
        


        for (Aviao a : frotaAviao){
            System.out.println(a.getid());
        }

         //usando interface

         Veiculo [] frotaVeiculos = new Veiculo [3];
         Veiculo v1 = new Carro();
         v1.setid("v1");
         frotaVeiculos[0] = v1;
         Veiculo v2 = new Carro();
         v2.setid("v2");
         frotaVeiculos[1] = v2;
         Veiculo v3 = new Aviao();
         v3.setid("v3");
         frotaVeiculos[2] = v3;

         for (Veiculo v : frotaVeiculos){
            System.out.println(v.getid());
         }
         

     
    }
}

package ads.rpg;
public class RPG {
    String nome, raca, classe, arma;
    int forca, des, car, intelig, con, sab;
    char opRaca, opArma, opClasse;
    public void status(){
        System.out.println("-----------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Classe: " + this.classe);
        System.out.println("Arma: " + this.arma);
        System.out.println("-----------------------------------------------");
        
        System.out.println("------------------ ATRIBUTOS ------------------");
        System.out.println("Força = " + this.forca);
        System.out.println("Destreza = " + this.des);
        System.out.println("Constituição = " + this.con);
        System.out.println("Inteligência = " + this.intelig);
        System.out.println("Sabedoria = " + this.sab);
        System.out.println("Carisma = " + this.car);
        System.out.println("-----------------------------------------------");
    }
}

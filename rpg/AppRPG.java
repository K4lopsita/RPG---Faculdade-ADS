package ads.rpg;

import java.util.Scanner;

public class AppRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RPG personagem = new RPG();
        System.out.println("Digite o nome do personagem:");
        personagem.nome = sc.nextLine();
        
        System.out.println("-------------- Escolha sua Raça: --------------");
        System.out.println("1. Goblin");
        System.out.println("2. Humano");
        System.out.println("3. Elfo");
        System.out.println("4. Anão");
        System.out.println("-----------------------------------------------");
        personagem.opRaca = sc.next().charAt(0);
        switch(personagem.opRaca){
            case '1':
                personagem.raca = "Goblin";
                break;
            case '2':
                personagem.raca = "Humano";
                break;
            case '3':
                personagem.raca = "Elfo";
                break;
            case '4':
                personagem.raca = "Anão";
                break;
            default:
                personagem.raca = "Não Encontrada!";
        }
        
        System.out.println("------------- Escolha sua Classe: -------------");
        System.out.println("1. Mago");
        System.out.println("2. Cavaleiro");
        System.out.println("3. Arqueiro");
        System.out.println("4. Viking");
        System.out.println("5. Lutador");
        System.out.println("6. Sacerdote");
        System.out.println("-----------------------------------------------");
        personagem.opClasse = sc.next().charAt(0);
        switch(personagem.opClasse){
            case '1':
                personagem.classe = "Mago";
                break;
            case '2':
                personagem.classe = "Cavaleiro";
                break;
            case '3':
                personagem.classe = "Arqueiro";
                break;
            case '4':
                personagem.classe = "Viking";
                break;
            case '5':
                personagem.classe = "Lutador";
                break;
            case '6':
                personagem.classe = "Sacerdote";
                break;
            default:
                personagem.classe = "Não Encontrada!";
        }
        
        System.out.println("-------------- Escolha sua Arma: --------------");
        System.out.println("1. Cajado");
        System.out.println("2. Espada");
        System.out.println("3. Escudo e Machado");
        System.out.println("4. Cajado e Espada");
        System.out.println("5. Soco Inglês");
        System.out.println("6. Adagas");
        System.out.println("7. Lança");
        System.out.println("8. Arco");
        System.out.println("-----------------------------------------------");
        personagem.opArma = sc.next().charAt(0);
        switch(personagem.opArma){
            case '1':
                personagem.arma = "Cajado";
                break;
            case '2':
                personagem.arma = "Espada";
                break;
            case '3':
                personagem.arma = "Escudo e Machado";
                break;
            case '4':
                personagem.arma = "Cajado e Espada";
                break;
            case '5':
                personagem.arma = "Soco Inglês";
                break;
            case '6':
                personagem.arma = "Adagas";
                break;
            case '7':
                personagem.arma = "Lança";
                break;
            case '8':
                personagem.arma = "Arco";
                break;
            default:
                personagem.arma = "Não Encontrada!";
        }
        
        System.out.println("------------ Defina seus Atributos ------------");
        System.out.println("Força: ");
        personagem.forca = sc.nextInt();
        System.out.println("Destreza: ");
        personagem.des = sc.nextInt();
        System.out.println("Constituição: ");
        personagem.con = sc.nextInt();
        System.out.println("Inteligência: ");
        personagem.intelig = sc.nextInt();
        System.out.println("Sabedoria: ");
        personagem.sab = sc.nextInt();
        System.out.println("Carisma: ");
        personagem.car = sc.nextInt();
        System.out.println("-----------------------------------------------");
        
        personagem.status();
    }
    
    
}

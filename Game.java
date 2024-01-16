
package game;
import java.util.Random;
public class Game {
       public static void main(String[] args) {
        Player petani = new Player();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int randomNumber1 = random.nextInt(100) + 1;
        int randomNumber2 = random.nextInt(100) + 1;
        int randomNumber3 = random.nextInt(100) + 1;
        int  r= random.nextInt(90) + 1;
        int  r1= random.nextInt(90) + 1;
        int  r2= random.nextInt(90) + 1;
        
        petani.e="Alucard ";
        petani.name = "Jeki ";
        petani.HealtPointe = r2;
        petani.ATKe = r1;
        petani.DEFe = r;
        petani.Speed = randomNumber;
        petani.HealtPoint = randomNumber1;
        petani.ATK = randomNumber2;
        petani.DEF = randomNumber3;
        petani.run();
        System.out.println("----------------------------");
        petani.DEf();        
        if(petani.isDead()){
        System.out.println("----------------------------");         
            System.out.println("Game Over!");
            System.exit(0);
        }
        System.out.println("----------------------------");
        petani.ATk();
        System.out.println("----------------------------");
        petani.run();
        if(petani.isDeade()){
            System.out.println("YOU KILL THE GOBLIN NICE");
            System.exit(0);
            }
        else{
            System.out.println("Opps The goblin manage to run try again");
            System.exit(0);
        }
        
        
        
        

    }
}
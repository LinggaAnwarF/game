
package game;
public class Player {
    
    
    String name,e;
    int Speed,HealtPoint,ATK,DEF,ATKe,DEFe,HealtPointe;
    
    void run(){
        System.out.println(name+"Stats...");
        System.out.println("Healt: "+HealtPoint);        
        System.out.println("Speed: "+Speed);
        System.out.println("DEF: "+DEF);
        
    }
    
    void ATk(){
        System.out.println(name+"is Atacking : "+ e);
        System.out.println(name+" deal "+ ATK +" to "+e);
        ATK=-DEFe;
        if(DEFe<=0){
            System.out.println(name+"kill"+e);
        }
    }
    void DEf(){
        System.out.println(name+"is Defending from : "+e+"ATK");
        System.out.println(e+"deal "+ATKe+" to "+name);
        HealtPoint-=ATKe;
    }
    
    
    boolean isDead(){
       if(HealtPoint<=0) return true;
       return false;
    }
    boolean isDeade(){
       if(HealtPointe<=0) return true;
       return false;
    }
    



}
    


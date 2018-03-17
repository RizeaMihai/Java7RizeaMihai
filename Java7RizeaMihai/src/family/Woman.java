/*
 * Woman character
 */
package family;

/**
 *
 * @author Mihai Rizea
 */
public class Woman extends Thread{
    
    private Boolean isSleeping = true;
    private Cigar tigara;

    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
    }
    
    public Woman(Cigar c){
        tigara = c;
    }
    
    @Override
    public void run(){
        System.out.println("Femeia doarme...si sforaie");
        while(isSleeping){
        }
        System.out.println("Femeia se uita la TV");
    }
}

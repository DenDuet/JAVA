
public class Animal extends SnowMan {
    public Animal(String nameSM, String classSM) {
        super(nameSM, classSM);
        this.idSM = SnowMan.index;
        // System.out.println(" "+this.nameSM+ " "+ this.classSM + " " + idSM);
    }
}

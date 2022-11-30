
public abstract class SnowMan {
    public String nameSM;
    public String classSM;
    public Integer idSM;
    public static Integer index = 0;

    public SnowMan(String nameSM, String classSM) {
        this.nameSM = nameSM;
        this.classSM = classSM;
        this.idSM = null;
        index++;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Class: %s", nameSM, classSM);
    }
}

package personal.model;

public class UserMapperNext extends UserMapper{

    String subLine = "_";

   
    public UserMapperNext() {
        super.subLine = subLine;
    }


    public UserMapperNext(String subLine) {
        super(subLine);
    }

}

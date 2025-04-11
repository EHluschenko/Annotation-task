package Model;

import Annotation.Author;
import Annotation.MethodInfo;

public class AppModel {
    @MethodInfo(nameMethod = "getData", typeValue = "String", description = "Return info")
    public String getData() {
        return "No data";
    }


    @Author(nameAuthor = "Eduard", surnameAuthor = "Hluschenko")
    public String getNumber() {
        return "No number!";
    }

}

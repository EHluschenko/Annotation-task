package Controller;

import Model.AppModel;
import View.AppView;


import java.lang.reflect.Method;

public class AppController {

    public void runApp(){
        AppModel obj = new AppModel();
        AppView view = new AppView();
        try{
        Class<?> cls = obj.getClass();
        Method methodGetData = cls.getMethod("getData");
        view.showAnnotathion(methodGetData);

        Method methodGetNumber = cls.getMethod("getNumber");
        view.showAnnotathion(methodGetNumber);}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

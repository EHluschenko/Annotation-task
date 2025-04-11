package View;

import Annotation.Author;
import Annotation.MethodInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class AppView {

    public void showAnnotathion(AnnotatedElement element) {
        try  {
                System.out.println("\nAnnotation on " +
                        element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();

            for (Annotation annotation : annotations) {

                if (annotation instanceof MethodInfo methodInfo) {
                    System.out.println("name: " + methodInfo.nameMethod());
                    System.out.println("type: " + methodInfo.typeValue());
                    System.out.println("description: "+ methodInfo.description());
                    System.out.println();
                }else if(annotation instanceof Author author){
                    System.out.println("name: "+ author.nameAuthor());
                    System.out.println("surname: "+ author.surnameAuthor());
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Facade;

public class FacadeTest {
    public static void main(String[] args) {
        CourseFacade ingressFacade = new IngressFacade(new Laptop(), new Projector());
        ingressFacade.startLesson();
    }
}

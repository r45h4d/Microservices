package Facade;

public class IngressFacade implements CourseFacade{
    Laptop laptop;
    Projector projector;
    public IngressFacade(Laptop laptop, Projector projector) {
        this.laptop = laptop;
        this.projector = projector;
    }

    @Override
    public void startLesson() {
        laptop.turnOn();
        projector.turnOn();
        laptop.startShareScreen();
    }

    @Override
    public void endLesson() {
        laptop.turnOff();
        projector.turnOff();
        laptop.endShareScreen();
    }
}

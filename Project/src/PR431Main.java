import java.lang.reflect.Constructor;

public class PR431Main {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        PR431Objecte instance0 = PR431Objecte.getInstance("Joel", "Martin", "19");
        System.out.println("Instant 0");
        
        PR431Objecte instance1 = null;
        try {
            Thread.sleep(1000);
            Constructor[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance1 = (PR431Objecte) constructor.newInstance("Leo", "Messi", "35");
                break;
            }
        } catch (Exception e) { e.printStackTrace(); }
        System.out.println("Instant 1");

        PR431Objecte instance2 = null;
        try {
            Thread.sleep(1000);
            Constructor[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (PR431Objecte) constructor.newInstance("Cristiano", "Ronaldo", "38");
                break;
            }
        } catch (Exception e) { e.printStackTrace(); }
        
        System.out.println("Instant 2");

        System.out.println(instance0);
        System.out.println(instance1);
        System.out.println(instance2);
    }

}

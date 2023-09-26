public class Main {
    public static void main(String[] args){

        
        
        PR430Objecte instance0 = PR430Objecte.getInstance("Joel", "Martin", "19");
        System.out.println("Instant 0");
        PR430Objecte instance1 = PR430Objecte.getInstance("Leo", "Messi", "35");
        System.out.println("Instant 1");
        PR430Objecte instance2 = PR430Objecte.getInstance("Cristiano", "Ronaldo", "38");
        System.out.println("Instant 2");

        System.out.println(instance0);
        System.out.println(instance1);
        System.out.println(instance2);
        

    }
} 
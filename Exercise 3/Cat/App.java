public class App {
    public static void main(String[] args) throws Exception {
        
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println();
        System.out.println("Cat Facts: ");
        System.out.println("The fur color of a burmese cat is " + myPet.furColor);
        System.out.println("The lifespan of a burmese cat is " + myPet.lifeSpan);
        System.out.println("\nThe personality of a chinchilla persian cat are " + myPet.personality);
        System.out.println("The weight of a chinchilla persian cat is " + myPet.weight);
    }
}

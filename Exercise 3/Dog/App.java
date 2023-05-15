public class App {
    public static void main(String[] args) throws Exception {
        
        Shorkie myPet = new Shorkie();

        myPet.bark();
        System.out.println();
        System.out.println("The height of a shih tzu is " + myPet.height + " and its life span is " + myPet.lifeSpan);
        System.out.println("\nThe eye color of a yorkshire terrier dog is " + myPet.eyeColor + " and they are very " + myPet.personality);
    }
}

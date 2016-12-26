package lesson_java_Pet;

public class PetMaster {

    public static void main(String[] args) {
        System.out.println("Заяц: ");
        System.out.println();
        String petReaction;
        String fishReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
        System.out.println();
        System.out.println("Рыбка: ");
        System.out.println();
        Fish myFish = new Fish();
        fishReaction = myFish.say("");
        System.out.println(fishReaction);
//        myFish.dive(3);
//        myFish.dive(3);
        myFish.sleep();

    }
}

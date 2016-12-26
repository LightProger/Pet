package lesson_java_Pet;

/**
 * Created by Александр on 26.12.2016.
 */
    public class Fish extends Pet{

    int currentDepth=0;


    public String say(String something){
        return "Ты чё не знаешь, что рыбы не разговаривают?";
    }

//    public int dive(int howDeep){
//
//    currentDepth = currentDepth + howDeep;
//        System.out.println("Я ныряю на глубину " + howDeep + " метров.");
//        System.out.println("Я на глубине " + currentDepth + " метров" + " ниже уровня моря!");
//        return currentDepth;
//
//    }
}

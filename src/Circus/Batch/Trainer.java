package Circus.Batch;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        // train(new Parrot());

        Animal a2 = new Animal();
        Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        //if bird is not isntance of duck, nothing happens
        //checks if bird is actually what type of animal, a duck
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
            else {
                Systme.out.println("not a duck");
            }
        }
    }
}

package Zoo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.displayZoo();
    }
}

class Animal {

    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }

    @Override
    public String toString() {
        return name + " (" + species + ")";
    }
}

class Cage {
    private Animal[] animals;
    private int count;

    public Cage() {
        animals = new Animal[5];
        count = 0;
    }

    public boolean addAnimal(Animal a) {
        // TODO: add animal only if capacity not exceeded
        // and no animal of same species already exists in cage
        return false;
    }

    public int getCount() { return count; }
    public Animal[] getAnimals() { return animals; }
}

class Zoo {
    private Cage[] cage;
    private int totalNoOfAnimals;
    private Random random;


    private String[] speciesList = {"Lion", "Tiger", "Bear", "Elephant", "Zebra", "Giraffe", "Monkey", "Hippo", "Kangaroo", "Panda"};
    private String[] nameList = {
            "Leo", "Simba", "Rajah", "Shera", "Baloo", "Barnaby", "Dumbo", "Ellie", "Marty", "Ziggy",
            "Melman", "Gerry", "George", "Abu", "Harry", "Gloria", "Jack", "Joey", "Po", "Bao",
            "Rocky", "Bruno", "Luna", "Milo", "Coco", "Bella", "Charlie", "Max", "Teddy", "Ollie",
            "Zeus", "Thor", "Loki", "Nala", "Kiara", "Kovu", "Tigger", "ShereKhan", "Bagheera", "Kaa",
            "Winnie", "Paddington", "Yogi", "BooBoo", "Fred", "Barney", "Wilma", "Betty", "Bugs", "Daffy"
    };

    public Zoo(){
    random = new Random();


    cage = new Cage[50];
        for (int i = 0; i < 50; i++) {
        cage[i] = new Cage();
    }


        this.totalNoOfAnimals = random.nextInt(101) + 100;

    distributeAnimals();
}


    private void distributeAnimals() {
        int animalsCreated = 0;
        int nameIndex = 0;


        for (int i = 0; i < cage.length && animalsCreated < totalNoOfAnimals; i++) {
            String uniqueName = nameList[nameIndex % nameList.length] + "_" + (nameIndex + 1);
            String randomSpecies = speciesList[random.nextInt(speciesList.length)];

            Animal animal = new Animal(uniqueName, randomSpecies);
            cage[i].addAnimal(animal);

            animalsCreated++;
            nameIndex++;
        }

        // Step 2: Distribute the remaining animals randomly across cages
        while (animalsCreated < totalNoOfAnimals) {
            int randomCageIndex = random.nextInt(cage.length);

            String uniqueName = nameList[nameIndex % nameList.length] + "_" + (nameIndex + 1);
            String randomSpecies = speciesList[random.nextInt(speciesList.length)];

            Animal animal = new Animal(uniqueName, randomSpecies);

            // Try to add. If it fails (cage full or species exists), it loops again without counting up
            if (cage[randomCageIndex].addAnimal(animal)) {
                animalsCreated++;
                nameIndex++;
            }
        }
    }

    public void displayZoo() {
        System.out.println("=== ZOO STATUS REPORT ===");
        System.out.println("Total targeted population: " + totalNoOfAnimals);
        System.out.println("-----------------------------------------");

        int realTotal = 0;
        for (int i = 0; i < cage.length; i++) {
            System.out.print("Cage #" + (i + 1) + " [" + cage[i].getCount() + "/5 animals]: ");

            if (cage[i].getCount() == 0) {
                System.out.println("Empty");
            } else {
                Animal[] animals = cage[i].getAnimals();
                for (int j = 0; j < cage[i].getCount(); j++) {
                    System.out.print(animals[j]);
                    if (j < cage[i].getCount() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            realTotal += cage[i].getCount();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total successfully allocated animals: " + realTotal);
    }
}
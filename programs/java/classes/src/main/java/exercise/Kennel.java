package exercise;

import java.util.Arrays;
// BEGIN
public class Kennel {
    static Puppy[] puppies  = new Puppy[100];
    private static int countPuppies = 0;

    public static class Puppy {
        private String name;
        private String breed;

        public Puppy (String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
    }


//    addPuppy() — принимает в качестве аргумента щенка и добавляет его в питомник.
//    addSomePuppies() — принимает в качестве аргумента массив щенков и добавляет их в питомник.
//    getPuppyCount() — возвращает общее количество щенков, находящихся на данный момент в питомнике.
//    isContainPuppy() — принимает в качестве аргумента имя щенка и проверяет, есть ли в питомнике щенок с таким именем. Если щенок есть, метод возвращает true, в ином случае — false.
//    getAllPuppies() — возвращает всех щенков, имеющихся в питомнике, в виде вложенного массива (смотрите пример вызова метода). Щенки в массиве должны располагаться в том порядке, в каком они были добавлены в питомник.
//    getNamesByBreed() — принимает в качестве аргумента породу и возвращает массив с именами щенков этой породы.
//    resetKennel() — очищает питомник, не оставляя в нем ни одного щенка.
    
    public static void addPuppy (String[] dog) {
        puppies[countPuppies] = new Puppy(dog[0],dog[1]);
        countPuppies++;
    }

    public static void addSomePuppies (String[][] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            String[] dog = new String[2];
            dog[0] = dogs[i][0];
            dog[1] = dogs[i][1];
            addPuppy(dog);
        }
    }

    public static int getPuppyCount() { return countPuppies; }

    public static boolean isContainPuppy(String name) {
        for (int i = 0; i < countPuppies; i++) {
            if (puppies[i].name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String[][] getAllPuppies() {
        String[][] allPuppies = new String[countPuppies][2];
        for (int i = 0; i < countPuppies; i++) {
                allPuppies[i][0] = puppies[i].name;
                allPuppies[i][1] = puppies[i].breed;
            }
        return allPuppies;
    }

    public static String[] getNamesByBreed(String breed) {
        String[] names = new String[countPuppies];
        int countNames = 0;
        for (int i= 0; i < countPuppies; i++) {
            if (puppies[i].breed.equals(breed)) {
                names[countNames] = puppies[i].name;
                countNames++;
            }
        }

        String[] namesNoNull = new String[countNames];
        for (int i = 0; i < countNames; i++) {
            namesNoNull[i] = names[i];
        }

        return namesNoNull;
    }

    public static void resetKennel() {
        for (int i= 0; i < countPuppies; i++) {
            puppies[i] = null;
        }
        countPuppies = 0;
    }

    public static boolean removePuppy(String puppyName) {
        boolean foundPuppy = false;
        for (int i= 0; i < countPuppies; i++) {
           if ((puppies[i].name).equals(puppyName)) {
               puppies[i] = null;
               foundPuppy = true;
               countPuppies--;
           }
        }
        for (int i= 0; i < countPuppies; i++) {
            if (puppies[i] == null) {
                puppies[i] = puppies[i+1];
                puppies[i+1] = null;
            }
        }
        return foundPuppy;
    }

    public static void main (String[] args) {

        String[] puppy1 = {"Rex", "boxer"};
        Kennel.addPuppy(puppy1);
        String[][] puppies2 = {
                {"Buddy", "chihuahua"},
                {"Toby", "chihuahua"},
        };
        Kennel.addSomePuppies(puppies2);

        Kennel.getPuppyCount(); // 3
        System.out.println(Kennel.getPuppyCount());

        Kennel.isContainPuppy("Buddy"); // true
        System.out.println(Kennel.isContainPuppy("Buddy"));

        String[][] puppies = Kennel.getAllPuppies();
        System.out.println(Arrays.deepToString(puppies));

        String[] names = Kennel.getNamesByBreed("chihuahua");
        System.out.println(Arrays.toString(names)); // => [Buddy, Toby]

        Kennel.resetKennel();
        Kennel.getPuppyCount(); // 0
        System.out.println(Kennel.getPuppyCount());

        String[][] puppies3 = {
                {"Teddy", "dog"},
                {"Lessie", "doberman"},
        };
        Kennel.addSomePuppies(puppies3);
        Kennel.removePuppy("Jack"); // false
        Kennel.removePuppy("Lessie"); // true

        String[][] allPuppies = Kennel.getAllPuppies();
        System.out.println(Arrays.deepToString(allPuppies));
// => [[Teddy, dog]]

    }
}
// END

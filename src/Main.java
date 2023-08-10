
public class Main {
    public static void main(String[] args) {


        Animal [] animal = new Animal[3];
        animal[0] = new Akula();
        animal[1] = new Cherpaha();
        animal[2] = new Arel();

        for (Animal animalik:animal) {
            if (animalik instanceof Akula){
                 animalik.delo();
            } else if (animalik instanceof Cherpaha){
                animalik.delo();
            } else if (animalik instanceof Arel) {
                animalik.delo();
            }

            }
        Akula[] akulas = new Akula[1];
        akulas[0] = new Akula();
        Cherpaha []cherpaha = new Cherpaha[1];
        cherpaha[0]= new Cherpaha();
        Arel[] arel = new Arel[1];
        arel[0] = new Arel();
        }



}
package guru.qa;

public class Homework {
    public static void main(String[] args) {

        Actor chuckNorris = new Actor();
        chuckNorris.name = "Chuck Norris";
        chuckNorris.age = 99;
        chuckNorris.numberOfMovies = 200;

        chuckNorris.playInNewMovie();
        System.out.println(chuckNorris.numberOfMovies);
        chuckNorris.getTheOscar();


        Pokemon bulbasaur = new Pokemon();
        Pokemon charmander = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.pokedexNumber = 1;
        bulbasaur.type = "grass";
        charmander.name = "Charmander";
        charmander.pokedexNumber = 4;
        charmander.type = "fire";

        charmander.fight();
        bulbasaur.fight();
    }
}

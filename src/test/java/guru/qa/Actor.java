package guru.qa;

public class Actor {
    String name;
    int age;
    int numberOfMovies;

    public void getTheOscar(){
        System.out.println("And the Oscar goes to " + this.name + "!");
    }

    public void playInNewMovie(){
        this.numberOfMovies++;
    }
}

public class LabActivity1 {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "Jungle (2017)";
        movie1.genre = "Adventure";
        movie1.duration = 115;

        Movie movie2 = new Movie();
        movie2.title = "Family Matters";
        movie2.genre = "Drama";
        movie2.duration = 120;

        Movie movie3 = new Movie();
        movie3.title = "Green Bones";
        movie3.genre = "Drama";
        movie3.duration = 123;


        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}
public class TestAlbum {

    public static void main(String[] args) {
      Album[] albums = {
        new Album("Hotel California", "Eagles", Album.Genre.ROCK),
        new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
        new Album("Arrival", "ABBA", Album.Genre.POP),
        new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
        new Album("White album", "Beatles", Album.Genre.POP),
        new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
        new Album("Thank you for the music", "ABBA", Album.Genre.POP)
      };
      System.out.println("Pop filtered");
      System.out.println("-");
      printAlbums(albums, new FilterPop());
      System.out.println("-");
      System.out.println("Only pop");
      System.out.println("-");
      printAlbums(albums, new FilterAllButPop());

    }
  
    static void printAlbums(Album[] albums, GenreFilter filter) {
      for(Album a : albums) {
        if (filter.permit(a)){
          System.out.println(a);
        }
      }
    }
  }
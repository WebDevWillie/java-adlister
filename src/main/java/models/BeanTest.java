package models;
import java.util.ArrayList;
import java.util.List;




public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album( 1, "The Beatles", "Abbey Road", 1969, "Rock", 30.0f);
        Album album2 = new Album( 2, "The Beatles", "Revolver", 1966, "Rock", 30.0f);

        ArrayList<Album> albums = new ArrayList<>(List.of(album1, album2));

        for (Album album : albums) {
            System.out.println(album.getName());
        }

        Author author1 = new Author(1, "John Lennon");
        Author author2 = new Author(2, "Paul McCartney");

        ArrayList<Author> authors = new ArrayList<>(List.of(author1, author2));

        for (Author author : authors) {
            System.out.println(author.getName());
        }
    }
}

package models;

public class Album  {
    private int id;
    private String artist;
    private String name;
    private int releaseDate;
    private String genre;
    private float sales;

    public Album(int id, String artist, String name, int releaseDate, String genre, float sales) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.sales = sales;
    }

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }
}

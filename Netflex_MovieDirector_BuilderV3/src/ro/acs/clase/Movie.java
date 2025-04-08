package ro.acs.clase;

public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private int releaseYear;
    private float score;

    private Movie(){

    }
    Movie(String title,int minutes,String genre,int releaseYear,float imdbScore){
        this.title=title;
        this.minutes=minutes;
        this.genre=genre;
        this.releaseYear=releaseYear;
        this.score=score;
    }

    public String title() {
        return title;
    }

    public int minutes() {
        return minutes;
    }

    public String genre() {
        return genre;
    }

    public int releaseYear() {
        return releaseYear;
    }

    public float score() {
        return score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", minutes=").append(minutes);
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", releaseYear=").append(releaseYear);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}

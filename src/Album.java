public class Album {
    public String title;
    public String artist;
    private int numTracks;
    private double playTime; //in minutes

    public Album(String title, String artist, int tracks, double time){
        this.title = title;
        this.artist = artist;
        numTracks = tracks;
        playTime = time;
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        String result = "";
        result += title + ", by " + artist + " | " + numTracks + " tracks";
        result += ", Time: " + playTime + "min";
        return result;
    }
}

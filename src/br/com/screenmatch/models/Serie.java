package br.com.screenmatch.models;

public class Serie extends Tittle{
    private int seasons;
    private boolean active;
    private int episodesBySeason;
    private int minutesBySeason;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getMinutesBySeason() {
        return minutesBySeason;
    }

    public void setMinutesBySeason(int minutesBySeason) {
        this.minutesBySeason = minutesBySeason;
    }

    @Override
    public int getDurationInMinutes(){
        return seasons * episodesBySeason * minutesBySeason;
    }
}

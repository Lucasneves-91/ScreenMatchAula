package br.com.screenMatch.models;

public class Series extends Title {

    private int seasons;
    private boolean activates;
    private int episodesBySeason;
    private int minutesPerEpisode;

    public Series(String name, int year) {
        super(name, year);
    }


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActivates() {
        return activates;
    }

    public void setActivates(boolean activates) {
        this.activates = activates;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDuration() {
        return seasons * episodesBySeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + "(" +this.getYear() + ")";
    }
}

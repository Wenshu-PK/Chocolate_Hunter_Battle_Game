package Chocolate_Hunter_Battle_Game;

public class ScoreEntry {
    private final String name;
    private final int iconIndex;
    private final int score;

    public ScoreEntry(String name, int iconIndex, int score) {
        this.name = name;
        this.iconIndex = iconIndex;
        this.score = score;
    }

    public String getName()      { return name; }
    public int getIconIndex()    { return iconIndex; }
    public int getScore()        { return score; }
}

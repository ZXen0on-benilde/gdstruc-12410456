public class StoredPlayer {
    private String key;
    private Player player;

    public StoredPlayer(String key, Player player) {
        this.key = key;
        this.player = player;
    }

    public String getKey() {
        return key;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {

        return player.toString();
    }
}

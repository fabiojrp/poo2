package pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}

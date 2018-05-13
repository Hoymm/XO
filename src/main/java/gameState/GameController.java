package gameState;

public interface GameController {
    void displayGame();
    boolean userWantsToStayInGame();
    boolean tryFetchAndProcessValidInputFromUser();
    Game getNextState();
}
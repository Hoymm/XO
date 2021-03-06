package gameState.states;
import data.*;
import messenger.Messenger;
import gameState.Game;

public class GameFinishedState extends Game {
    GameFinishedState(Data data, Messenger messenger) {
        super(data, messenger);
    }

    @Override
    public boolean tryFetchAndProcessValidInputFromUser() {
        return false;
    }

    @Override
    public Game getNextState() {
        return null;
    }

    @Override
    public void displayGame(Messenger messenger) {
        System.out.println(data.gameFinishResult(messenger));
    }

    @Override
    public boolean userWantsToStayInGame() {
        return false;
    }
}

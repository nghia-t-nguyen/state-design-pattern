package csce247.state;

/**
 * 
 * @author Nghia Nguyen
 * 
 * Represents the nintendo state of a game console
 *
 */
public class NintendoState implements State {
  private static final String[] games =
      {"Super Smash Bros", "Mario Kart", "Animal Crossing", "Pokemon Sword", "Splatoon"};
  private GameConsole gameConsole;

  /**
   * Creates a nintendo state
   * @param gameConsole - the game console that has this instance of a nintendo state
   */
  public NintendoState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  @Override
  public void pressHomeButton() {
    System.out.println("\nDisplay Home Screen...");
    gameConsole.setState(gameConsole.getHomeState());
  }

  @Override
  public void pressNintendoButton() {
    System.out.println("You are already viewing Nintendo.");
  }

  @Override
  public void pressXBoxButton() {
    System.out.println("\nStarting XBox...");
    gameConsole.setState(gameConsole.getXBoxState());
  }

  @Override
  public void pressGameButton() {
    System.out.println("You have the following games:");
    for (String game : games) {
      System.out.println(game);
    }
  }
}

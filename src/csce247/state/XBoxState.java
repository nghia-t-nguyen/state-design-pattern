package csce247.state;

/**
 * 
 * @author Nghia Nguyen
 * 
 *         Represents an xbox state of a game console
 *
 */
public class XBoxState implements State {
  private static final String[] games =
      {"Grand Theft Auto", "Halo", "Call of Duty", "Fortnite", "Destiny 2"};
  private GameConsole gameConsole;

  /**
   * Creates an xbox state
   * 
   * @param gameConsole - the game console that has this instance of an xbox state
   */
  public XBoxState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  @Override
  public void pressHomeButton() {
    System.out.println("\nDisplay Home Screen...");
    gameConsole.setState(gameConsole.getHomeState());
  }

  @Override
  public void pressNintendoButton() {
    System.out.println("\nStarting Nintendo...");
    gameConsole.setState(gameConsole.getNintendoState());
  }

  @Override
  public void pressXBoxButton() {
    System.out.println("You are already viewing XBox.");
  }

  @Override
  public void pressGameButton() {
    System.out.println("You have the following games:");
    for (String game : games) {
      System.out.println(game);
    }
  }
}

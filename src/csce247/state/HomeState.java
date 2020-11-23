package csce247.state;

/**
 * 
 * @author Nghia Nguyen
 * 
 *         Represents the home state of a game console, such as a home menu
 *
 */
public class HomeState implements State {
  private GameConsole gameConsole;

  /**
   * Creates a home state
   * 
   * @param gameConsole - the game console that has this instance of a home state
   */
  public HomeState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  @Override
  public void pressHomeButton() {
    System.out.println("You are already on the home screen.");
  }

  @Override
  public void pressNintendoButton() {
    System.out.println("\nStarting Nintendo...");
    gameConsole.setState(gameConsole.getNintendoState());
  }

  @Override
  public void pressXBoxButton() {
    System.out.println("\nStarting XBox...");
    gameConsole.setState(gameConsole.getXBoxState());
  }

  @Override
  public void pressGameButton() {
    System.out.println("You have to pick a gaming system to play.");
  }
}

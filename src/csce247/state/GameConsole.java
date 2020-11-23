package csce247.state;

/**
 * 
 * @author Nghia Nguyen
 * 
 *         Represents a game console that can play xbox and nintendo games
 */
public class GameConsole {
  private State homeState;
  private State nintendoState;
  private State xBoxState;
  private State state;

  /**
   * Creates a game console
   */
  public GameConsole() {
    homeState = new HomeState(this);
    nintendoState = new NintendoState(this);
    xBoxState = new XBoxState(this);
    state = homeState;
    System.out.println("Starting up Game Console");
  }

  /**
   * Displays a message when you press the home button depending on which state your console is in
   */
  public void pressHomeButton() {
    state.pressHomeButton();
  }

  /**
   * Displays a message when you press the nintendo button depending on which state your console is
   * in
   */
  public void pressNintendoButton() {
    state.pressNintendoButton();
  }

  /**
   * Displays a message when you press the xbox button depending on which state your console is in
   */
  public void pressXBoxButton() {
    state.pressXBoxButton();
  }

  /**
   * Displays a message when you press the game button depending on which state your console is in
   */
  public void pressGameButton() {
    state.pressGameButton();
  }

  /**
   * Changes the state of the game console to another state
   * 
   * @param state - the state to change to
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * @return - the home state of the console
   */
  public State getHomeState() {
    return homeState;
  }

  /**
   * @return - the nintendo state of the console
   */
  public State getNintendoState() {
    return nintendoState;
  }

  /**
   * @return - the xbox state of the console
   */
  public State getXBoxState() {
    return xBoxState;
  }
}

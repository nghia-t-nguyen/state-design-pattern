package csce247.state;

/**
 * @author Nghia Nguyen
 * 
 *         Represents a state the the game console is in
 *
 */
public interface State {
  /**
   * Displays a message when you press the home button that differs with each state
   */
  public void pressHomeButton();

  /**
   * Displays a message when you press the nintendo button that differs with each state
   */
  public void pressNintendoButton();

  /**
   * Displays a message when you press the xbox button that differs with each state
   */
  public void pressXBoxButton();

  /**
   * Displays a message when you press the game button that differs with each state
   */
  public void pressGameButton();
}

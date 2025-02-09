import Engines._
import org.jpl7._
@main
def main(): Unit = {
  System.setProperty("java.library.path", "C:/Program Files/swipl/lib/jpl.jar")
  val sudoku = new Query("consult('D:/CSED/semester4/Paradigms/Board-Drawing-Engine/prolog/src/main/scala/Sudoku.pl')")
  val queens8 = new Query("consult('D:/CSED/semester4/Paradigms/Board-Drawing-Engine/prolog/src/main/scala/Queens8.pl')")
  while(true){
    println(
      "Enter the game number:\n" +
        "1. Chess Game\n" +
        "2. Connect 4 Game\n" +
        "3. Sudoku Game\n" +
        "4. 8 Queens Game\n" +
        "5. Checkers Game\n" +
        "6. Tic Tac Toe Game\n" +
        "Enter -1 in any game to return to main menu."
    )
    scala.io.StdIn.readLine() match
      case "1" => AbstractGameEngine(chess_controller, chess_drawer,
        chess_initializer, true);
      case "2" => AbstractGameEngine(connect4_controller, connect4_drawer,
        connect4_initializer, true);
      case "3" => AbstractGameEngine(sudoku_controller, sudoku_drawer,
        sudoku_initializer, false);
      case "4" => AbstractGameEngine(eightQueens_controller, eightQueens_drawer,
        eightQueens_initializer, false);
      case "5" => AbstractGameEngine(checkers_controller, checkers_drawer,
        checkers_initializer, true);
      case "6" => AbstractGameEngine(ticTacToe_controller, ticTacToe_drawer,
        ticTacToe_initializer, true);
      case _ =>
  }
}
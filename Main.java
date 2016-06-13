
public class Main {

	public static void main(String[] args) {
	BoardMethods board=new BoardMethods();
	Movement move=new Movement();
	board.BoardPrint();
	move.oben();
	board.BoardClear();
	board.BoardPrint();

	}

}

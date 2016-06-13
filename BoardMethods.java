
public class BoardMethods {
World world=new World();
	public void BoardClear(){
		for(int x=1;x<10;x++){
			System.out.println(""); 
		}
	}
	
public void BoardPrint(){		//Ausgabe des Gameboards

		for ( int zeile = 0; zeile < world.board.length; zeile++ ){
			 for ( int spalte=0; spalte < world.board[zeile].length; spalte++ )
			      System.out.print( world.board[zeile][spalte] + " ");
		     	  System.out.println();
		}
	}
}

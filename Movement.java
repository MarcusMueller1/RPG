public class Movement {
	
World world = new World();
int x;
int y;
public int[][] board2 = new int[][]{
};


public void oben(){
world.setBoard(world.getCurrentPosX(), world.getCurrentPosY(),0);
x=world.getCurrentPosX();
x+=1;
world.setCurrentPosX(x);
world.setBoard(world.getCurrentPosX(), world.getCurrentPosY(),1);


}

public void unten(){
world.board[world.currentPosX][world.currentPosY]=0;
world.currentPosX-=1;
world.board[world.currentPosX][world.currentPosY]=1;	
}

public void rechts(){
world.board[world.currentPosX][world.currentPosY]=0;
world.currentPosY+=1;
world.board[world.currentPosX][world.currentPosY]=1;	
	
}

public void links(){
world.board[world.currentPosX][world.currentPosY]=0;
world.currentPosY-=1;
world.board[world.currentPosX][world.currentPosY]=1;	

	}
}

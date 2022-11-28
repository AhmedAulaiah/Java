package U9; /**
 * 
 */

/**
 * 
 *
 */
public class Snake implements ISnake {

	private char direction;
	private GameBoard board;
	private int positionX;
	private int positionY;
	/**
	 * getter Methode fuer Position x 
	 * @return
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * setter Methode fuer die Position x 
	 * @param positionX
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * getter Methode fuer Position y.
	 * @return
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * setter Methode fuer die Position y.
	 * @param positionY
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	/**
	 * die setDir Methode schreiben .
	 * diese Methode ermoeglicht die Bewegung in den 4 Richtungen
	 */
	public void setDirection(char direction) {
		// GO_UP if True
		if(direction == GO_DOWN) {
			// GO_UP if True
			this.direction = GO_DOWN;
		} else if (direction == GO_RIGHT) {
			// GO_LEFT if True
			this.direction = GO_RIGHT;
		} else if (direction == GO_LEFT) {
			// GO_RIGHT if True
			this.direction = GO_LEFT;
		} else if(direction == GO_UP) {
			// GO_DOWN if True
			this.direction = GO_UP;

		}		

	}

	@Override
	public char getDirection() {
		return direction;
	}

	@Override
	public boolean isEating() {
		if(body.getLast().equals(getBoard().getAppleBody())) {
			return true ;
		}else {
			return false;
		}
	}

	@Override
	public int getLength() {
		int snakelength = body.size();
		return snakelength;
	}
	/**
	 * 
	 * Waehrend der Bewegung wird das der Kopft der Snake irgendwohin auf x oder y Axe Laufen ,
	 * und wird das letzte Stuek entfernt  .
	 * und die Snake kann nicht sofort umkehren von oben nach unten und von links nach rechts .
	 * und die leavesboard methode wurde hier aufgerufen , deren Kommentare unten spaeter kommen .
	 */
	

	public boolean move() {
		// Checking Collisions with Board or Snake self.
		if (leavesTheBoard()==true) {
			//Moving stops when Snake lives Board, also gameplay ends.
			return false ;
		}
		if(isSelfEating() == true) {
			//Moving stops when Snake lives Board, also gameplay ends.
			return false;
		}


		if(this.direction == GO_LEFT && this.direction != GO_RIGHT) {

			body.addLast(new Body(body.getLast().getPositionX()-1, body.getLast().getPositionY()));
			if(isEating() == true) {
				getBoard().setApple();
			}else {
				body.removeFirst();
			}
		}
		if(this.direction ==GO_RIGHT && this.direction != GO_LEFT) {
			body.addLast(new Body(body.getLast().getPositionX()+1, body.getLast().getPositionY()));
			if(isEating() == true) {
				getBoard().setApple();
			}else {
				body.removeFirst();
			}

		}
		if(this.direction == GO_UP && this.direction != GO_DOWN) {
			body.addLast(new Body(body.getLast().getPositionX(), body.getLast().getPositionY()-1));
			if(isEating()==true) {
				getBoard().setApple();
			} else {
				body.removeFirst();
			}
		}
		if(this.direction == GO_DOWN && this.direction != GO_UP) {
			body.addLast(new Body(body.getLast().getPositionX(), body.getLast().getPositionY()+1));
			if(isEating() == true) {
				getBoard().setApple();
			} else {
				body.removeFirst();
			}
		}
		return true;
	}


	@Override
	public boolean isSelfEating() {
		for(int i = 0 ;i < body.size()-1;i++) {
			if(body.getLast().equals(body.get(i))) {
				return true ;
			} 
		}
		// On selfeating, Game over.
		return false;
	}

	
	public boolean leavesTheBoard() {
		if( 
				(body.getLast().getPositionX() == 40) 	 // Right Boarder of Console
				|| (body.getLast().getPositionY() == 27) // Bottom Boarder of Console
				|| (body.getLast().getPositionX() == 0)	 // Origin Boarder of Console at X
				|| (body.getLast().getPositionY()==0))	 // Origin Boarder of Console at Y
		{
			return true ;
		} else {
			return false;
		}
	}


	/**
	 * 	 Creates a new Snake with default length in the middle of the Console.
	 *   Every body cell has the default position for x and y.
	 *   The default direction should be GO_RIGHT. 
	 *    @param board
	 *    				Set the board of the snake to board.

	 */
	public Snake(GameBoard board) {
		for (int i = 0; i < DEFAULT_START_LENGTH; i++) {
			body.add(new Body(10 +i , 10));
		} 
		this.direction = GO_RIGHT;
		this.board=board;
	}

	/**
	 * @return the board
	 */
	public GameBoard getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(GameBoard board) {
		this.board = board;
	}

}

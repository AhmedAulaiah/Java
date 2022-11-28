package U9; /**
 * 
 */

/**
 * @author aulaiah
 *
 */
public class Snake2 extends Snake{

	/**
	 * Das Konstruktor in GameBoard.java soll zu dieser Klasse gezeigt werden.
	 * Snake snakeBody = new Snake2(this);
	 * @param board
	 */
	public Snake2(GameBoard board) {
		super(board);
	}

	@Override
	public boolean leavesTheBoard() {
		// On exceeding Right Boarder of Console reset Snake to Left Boarder
		if (body.getLast().getPositionX() > 40) {
			body.getLast().setPositionX(0);
		}
		// On exceeding Top Left of Console reset Snake to Right Boarder
		if (body.getLast().getPositionX() < 0) {
			body.getLast().setPositionX(40);
		}
		// On exceeding Top Boarder of Console reset Snake to Bottom Boarder
		if (body.getLast().getPositionY() < 0) {
			body.getLast().setPositionY(27);
		}
		// On exceeding Bottom Boarder of Console reset Snake to Top Boarder
		if (body.getLast().getPositionY() > 27) {
			body.getLast().setPositionY(0);
		}
		return false;
	}


	/**
	 * Overrides Initial functionallty of move in Snake.java.
	 * It updates the first If-Clause setting Board Boundaries and
	 * relocating Snake Position. 
	 */
	@Override
	public boolean move() {

		// Checking Snake Collision with Board Boundaries.

		if (leavesTheBoard() == true) {
			//Moving stops when Snake lives Board,it reappears and gameplay continues.
			if ((body.getLast().getPositionX() >= 40)) {
				body.getFirst().setPositionX(2); //Warp to right
			} else if ((body.getLast().getPositionY() >= 27)) {
				body.getFirst().setPositionY(2); //Warp to left
			} else if ((body.getLast().getPositionX() <= 0)) {
				body.getFirst().setPositionY(40); //Warp to bottom
			} else if ((body.getLast().getPositionY() <= 0)){
				body.getFirst().setPositionY(27); //Warp to top
			}

			return true ;
		}

		if(isSelfEating() == true) {
			//Moving stops when Snake lives Board, also gameplay ends.
			return false;
		}


		if(this.getDirection() == GO_LEFT && this.getDirection() != GO_RIGHT) {

			body.addLast(new Body(body.getLast().getPositionX()-1 , body.getLast().getPositionY()));
			if(isEating() == true) {
				getBoard().setApple();
			}else {
				body.removeFirst();
			}
		}
		if(this.getDirection()==GO_RIGHT && this.getDirection() != GO_LEFT) {
			body.addLast(new Body(body.getLast().getPositionX()+1,body.getLast().getPositionY()));
			if(isEating() == true) {
				getBoard().setApple();
			}else {
				body.removeFirst();
			}

		}
		if(this.getDirection() == GO_UP && this.getDirection() != GO_DOWN) {
			body.addLast(new Body(body.getLast().getPositionX(),body.getLast().getPositionY()-1));
			if(isEating()==true) {
				getBoard().setApple();
			} else {
				body.removeFirst();
			}
		}
		if(this.getDirection() == GO_DOWN && this.getDirection() != GO_UP) {
			body.addLast(new Body(body.getLast().getPositionX(),body.getLast().getPositionY()+1));
			if(isEating() == true) {
				getBoard().setApple();
			} else {
				body.removeFirst();
			}
		}
		return true;
	}

}

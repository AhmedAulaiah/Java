package U9;

public class Body {
	private int positionX;
	private int positionY;

	/**
	 * Creates a new body at position (x, y).
	 */
	public Body(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}

	/**
	 * @return the positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX
	 *            the positionX to set
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * @param positionY
	 *            the positionY to set
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Body) {
			Body b = (Body) obj;
			return b.positionX == this.positionX && b.positionY == this.positionY;
		}
		
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + positionX + ", " + positionY + ")";
	}
}

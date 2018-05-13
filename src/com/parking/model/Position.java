package com.parking.model;

public class Position{
	
	private int x;
	
	private int y;
	
	private String direction;
	
	
	
	public Position() {
		super();
	}

	public Position(Position position) {
		super();
		this.x = position.getX();
		this.y = position.getY();
		this.direction = position.getDirection();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", direction=" + direction + "]";
	}

	

}

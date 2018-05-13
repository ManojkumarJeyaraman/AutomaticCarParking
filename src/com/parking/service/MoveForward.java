package com.parking.service;

import com.parking.model.Position;


import static com.parking.common.Direction.EAST;
import static com.parking.common.Direction.NORTH;
import static com.parking.common.Direction.SOUTH;
import static com.parking.common.Direction.WEST;

public class MoveForward {
	
	public static void moveForward(Position position) {
		setNewPosition(position);
	}
	
	public static void setNewPosition(Position position) {
		
		String direction = position.getDirection();
		int pointX = position.getX();
		int pointY = position.getY();
		
		switch(direction) {
		case NORTH:
			position.setX(pointX+1);
			break;
		case SOUTH:
			position.setX(pointX-1);
			break;
		case EAST:
			position.setY(pointY-1);
			break;
		case WEST:
			position.setY(pointY+1);
			break;
		}
		
		
	}
	

}

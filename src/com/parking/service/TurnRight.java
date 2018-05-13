package com.parking.service;

import static com.parking.common.Direction.EAST;
import static com.parking.common.Direction.NORTH;
import static com.parking.common.Direction.SOUTH;
import static com.parking.common.Direction.WEST;

import com.parking.common.Direction;
import com.parking.model.Position;

public class TurnRight {
	
	
	public static void turnRight(Position position) {
		position.setDirection(getNewDirection(position.getDirection()));
	}
	
	private static String getNewDirection(String currentDirection) {

		String newDirection = currentDirection;

		switch(currentDirection) {
			case  NORTH :
				newDirection = WEST;
				break;
			case SOUTH:
				newDirection = EAST;
				break;
			case WEST:
				newDirection = SOUTH;
				break;
			case EAST:
				newDirection = NORTH;
				break;
		}
		return newDirection;
	}
	

	

}

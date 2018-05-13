package com.parking.service;

import static com.parking.common.Direction.EAST;
import static com.parking.common.Direction.NORTH;
import static com.parking.common.Direction.SOUTH;
import static com.parking.common.Direction.WEST;

import com.parking.model.Position;

public class TurnLeft {

	
	public static void turnLeft(Position position) {
		position.setDirection(getNewDirection(position.getDirection()));
	}
	
	private static String getNewDirection(String currentDirection) {

		String newDirection = currentDirection;

		switch(currentDirection) {
			case  NORTH :
				newDirection = EAST;
				break;
			case SOUTH:
				newDirection = WEST;
				break;
			case WEST:
				newDirection = NORTH;
				break;
			case EAST:
				newDirection = SOUTH;
				break;
		}
		return newDirection;
	}


}

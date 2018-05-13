package com.parking.client;

import com.parking.exception.BoundryViolationException;
import com.parking.model.Position;
import com.parking.service.MoveForward;
import com.parking.service.TurnLeft;
import com.parking.service.TurnRight;

public class CarDriveClient {
	
	private void turnRight(Position position) {
		TurnRight.turnRight(position);
	}
	
	private void turnLeft(Position position) {
		TurnLeft.turnLeft(position);
	}
	
	private void moveForward(Position position) {
		MoveForward.moveForward(position);
	}
	
	public Position doAction(char c, Position position) throws BoundryViolationException {
		
		Position newPosition = new Position(position);
		
		if (c == 'R') {
			turnRight(newPosition);
		}else if(c == 'L') {
			turnLeft(newPosition);
		}else if(c == 'F') {
			moveForward(newPosition);
		}else {
			System.out.println("Invalid Command");
		}
		
		validatePosition(newPosition);
		
		return newPosition;
		
	}
	
	public void validatePosition(Position position) throws BoundryViolationException{
		if(position.getX()<0 || position.getY()<0) {
			throw new BoundryViolationException("The issued command can't be performed as it is going out of parking boundry");
		}
	}

}

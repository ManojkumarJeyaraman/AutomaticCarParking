package com.parking.app;

import java.util.Scanner;

import com.parking.client.CarDriveClient;
import com.parking.common.Direction;
import com.parking.exception.BoundryViolationException;
import com.parking.model.Position;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the driving commands: ");
		String commands = in.nextLine();
		System.out.println("Command Entered: "+commands);
		
		Position startingPosition = new Position();
		startingPosition.setDirection(Direction.NORTH);
		startingPosition.setX(5);
		startingPosition.setY(5);
		
		CarDriveClient client = new CarDriveClient();
		
		Position newPosition = new Position(startingPosition);
		
		for(char c: commands.toCharArray()) {
			try {
				newPosition = client.doAction(c, newPosition);
			} catch (BoundryViolationException e) {
				e.printStackTrace();
				break;
			}
		}
		
		System.out.println("New position: "+ newPosition);
		
	}

}

package com.miracles.july15;
//Inheritance by Encapsulation
public class RunDemo {   
	public static void main (String[] args) {
		PlayerPiece player = new PlayerPiece(); 
		TilePiece tile = new TilePiece(); 
		doShapes(player);
		doShapes(tile);
		}
	public static void doShapes(GameShape shape) { 
		shape.displayShape();
	}
}
class GameShape{
	public void displayShape() {
		System.out.println("Display Shape");
	}
}
class PlayerPiece extends GameShape{
	public void movePiece() {
		System.out.println("Moving game Pieces");
	}
}
class TilePiece extends GameShape{
	public void adjecentShape() {
		System.out.println("Adjecent Shape");
	}
}


import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World myWorld = new World();
		myWorld.show();
		Bug bug1 = new Bug();
		Location location1 = new Location(5,5);
		bug1.setColor(Color.BLUE);
		myWorld.add(location1, bug1);
		bug1.turn();
		bug1.turn();
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if (!(j == 5 && i == 5)) {
					if (j%2==0) {
						drawFlower(myWorld, j, i, Color.RED);
					}
					else {
						drawFlower(myWorld, j, i, Color.BLUE);
					}
				}
			}
		}
	}
	private static void drawFlower(World myWorld, int x, int y, Color color) {
		Flower flower1 = new Flower();
		Location location2 = new Location(x,y);
		myWorld.add(location2, flower1);
		flower1.setColor(color);
	}
}

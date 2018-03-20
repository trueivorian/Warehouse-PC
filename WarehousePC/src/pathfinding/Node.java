package pathfinding;

public class Node {
	int x;
	int y;
	
	 Node(int _x, int _y) {
		x = _x;
		y = _y;
	}
	 
	 void set(int _x, int _y) {
		 x = _x;
		 y = _y;
	 }
	 
	 int getX() {
		 return x;
	 }
	 
	 int getY() {
		 return y;
	 }
}

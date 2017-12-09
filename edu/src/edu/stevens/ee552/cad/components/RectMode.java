package edu.stevens.ee552.cad.components;

public class RectMode implements Mode{
	public Shape create(int x1, int y1, int x2, int y2) {
        return new Rect(x1,y1, x2-x1,y2-y1);
    }
}

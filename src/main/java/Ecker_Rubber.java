import processing.core.PApplet;

public class Ecker_Rubber extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_Rubber");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        frameRate(60);
        background(250);
        drawRect();
    }

    public void draw() {
        stroke(250);
        fill(250);
        ellipse(mouseX, mouseY, 50,50);
    }

    private void drawRect() {
        fill(0);
        rect(125,125,250,250);
    }
}

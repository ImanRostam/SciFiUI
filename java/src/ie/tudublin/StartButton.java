package ie.tudublin;

import processing.core.PApplet;

public class StartButton extends UIElement
{
    public StartButton(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(2);
        ui.fill(255, 30, 30, 200);
        ui.rect(50, ui.height-280, 145, 70);

        ui.fill(0);
        ui.textSize(22);
        ui.text(("START"), 122.5f, ui.height-237);
    }
}
package ie.tudublin;

import processing.core.PApplet;

public class Frames extends UIElement
{
    private int space;

    public Frames(float x, float y, PApplet ui, int space)
    {
        super(x, y, ui);
        this.space = space;
    }

    public void render()
    {
        ui.stroke(255, 0, 0, 70);
        ui.strokeWeight(3);

        // Top Left frame
        ui.line(space, space, space+40, space); // H
        ui.line(space, space, space, space+40); // V
        
        // Top Right Frame
        ui.line(ui.width-space, space, ui.width-70, space); // H
        ui.line(ui.width-space, space, ui.width-space, space+40); // V
        
        // Bottom Left Frame
        ui.line(space, ui.height-space, space+40, ui.height-space); // H
        ui.line(space, ui.height-space, space, ui.height-70); // V

        // Bottom Right Frame
        ui.line(ui.width-space, ui.height-space, ui.width-70, ui.height-space); // H
        ui.line(ui.width-space, ui.height-space, ui.width-space, ui.height-70); // V
    }
}
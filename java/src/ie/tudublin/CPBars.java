package ie.tudublin;

import processing.core.PApplet;

public class CPBars extends UIElement
{
    public CPBars(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        int barsH = ui.height -100;
        int x = 0;
        int moving = 9;
        int start = 10;
        
        // Moving bars
        ui.noStroke();
        ui.fill(ui.random(255), ui.random(255), ui.random(255), 100);
        for(int i = 0; i < 5; i++)
        {
            ui.rect(250, barsH + x, start+ui.mouseX/moving, 20);
            x = x + 32;
            moving = moving + 6;
            start = start + 2; 
        }
        
        // Moving Bar Frame
        ui.stroke(255);
        ui.strokeWeight(1);
        ui.noFill();
        int y =-3;
        for(int i = 0; i < 5; i++)
        {
            ui.rect(246, barsH+y, 169, 26);
            y = y + 32;
        }
    }
}
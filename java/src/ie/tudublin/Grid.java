package ie.tudublin;

import processing.core.PApplet;

public class Grid extends UIElement
{
    public Grid(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.fill(0);
        ui.rect(ui.width-450, ui.height-90, 150, 150);
        ui.fill(255, 0, 0, 80);
        ui.strokeWeight(1);
        ui.stroke(255, 0, 0);
        for(int gapY = 0; gapY < 150; gapY = gapY + 15)
        {            
            for(int gapX = 0; gapX < 150; gapX = gapX + 15)
            {
                ui.rect(ui.width - 450 + gapX, ui.height -90 + gapY, 15, 15);
            }
        }
    }
}
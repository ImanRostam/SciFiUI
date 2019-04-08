package ie.tudublin;

import processing.core.PApplet;

public class UnknownObjects1 extends UIElement
{
    public UnknownObjects1(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        float cirX = ui.random(ui.width - 440, ui.width -310);
        float cirY = ui.random(ui.height - 80, ui.width);

        ui.fill(255, 255, 0);
        ui.ellipse(cirX, cirY, ui.random(10, 20), ui.random(10, 20));
        ui.delay(5);
    }
}

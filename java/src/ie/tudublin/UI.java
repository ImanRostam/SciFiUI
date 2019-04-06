package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    CircleView circleV;
    ReloadButton rButton;

    public void setup()
    {
        circleV = new CircleView(50, 50, this);
        rButton = new ReloadButton(50, 50, this);
    }

    public void settings()
    {
    fullScreen();
    }

    public void draw()
    {
    background(0);

    circleV.render();
    rButton.render();
    }
}


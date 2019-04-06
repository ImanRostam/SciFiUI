package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    CircleView circleV;
    ReloadButton rButton;
    ReloadBar rBar;
    RandomButton randButton;

    public void setup()
    {
        circleV = new CircleView(50, 50, this);
        rButton = new ReloadButton(50, 50, this);
        rBar = new ReloadBar(50, 50, this);
        randButton = new RandomButton(50, 50, this);
    }

    public void settings()
    {
    fullScreen();
    }

    public void draw()
    {
    background(0);

    // System.out.println(width);
    // System.out.println(height);
    
    circleV.render();
    rButton.render();
    rBar.render();
    randButton.render();
    }
}


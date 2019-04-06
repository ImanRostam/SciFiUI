package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    CircleView circleV;
    ReloadButton rButton;
    ReloadBar rBar;
    RandomButton randButton;
    Stars stars;
    Astroids astroids;

    public void setup()
    {
        circleV = new CircleView(50, 50, this);
        rButton = new ReloadButton(50, 50, this);
        rBar = new ReloadBar(50, 50, this);
        randButton = new RandomButton(50, 50, this);
        stars = new Stars(4, 4, this);
        astroids = new Astroids(random(width), random(height), this, 60);
    }

    public void settings()
    {
    fullScreen();
    }

    public void draw()
    {
    background(0);
    stars.render();

    // System.out.println(width);
    // System.out.println(height);
    
    circleV.render();
    rButton.render();
    rBar.render();
    randButton.render();
    astroids.render();
    }
}


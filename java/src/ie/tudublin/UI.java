package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Scope circleV;
    ReloadButton rButton;
    ReloadBar rBar;
    RandomButton randButton;
    Stars stars;
    Astroids ast1, ast2;
    Frames frame;

    public void setup()
    {
        circleV = new Scope(50, 50, this);
        rButton = new ReloadButton(50, 50, this);
        rBar = new ReloadBar(50, 50, this);
        randButton = new RandomButton(50, 50, this);
        stars = new Stars(4, 4, this);

        // Astroids
        ast1 = new Astroids(random(width), random(height), this, 60);
        ast2 = new Astroids(random(width), random(height), this, 60);
        
        //Frames
        frame = new Frames(4, 4, this, 30);
    }

    public void settings()
    {
    fullScreen();
    }

    public void draw()
    {
    background(0);

    // Stars
    stars.render();

    // Astroids
    ast1.render();
    ast2.render();
    ast1.move1();
    ast2.move2();
    ast1.shoot();
    ast2.shoot();
    ast1.mouseClicked();
    ast2.mouseClicked();
    
    // Target View
    circleV.render();

    // Reload
    rButton.render();
    rBar.render();

    //Random Button
    //randButton.render();

    //Frames
    frame.render();
    }
}


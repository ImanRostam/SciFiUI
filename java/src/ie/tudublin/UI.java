package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    Scope circleV;
    ReloadButton rButton;
    ReloadBar rBar;
    RandomButton randButton;
    Stars stars;
    //Aestroids aest1, aest2, aest3, aest4;
    ArrayList<Astroids> ast = new ArrayList<Astroids>();
    Frames frame;

    public void setup()
    {
        circleV = new Scope(50, 50, this);
        rButton = new ReloadButton(50, 50, this);
        rBar = new ReloadBar(50, 50, this);
        randButton = new RandomButton(50, 50, this);
        stars = new Stars(4, 4, this);

        // Astroids
        /*aest1 = new Astroids(random(width), random(height-100), this, 60, 128, 43, 0);
        aest2 = new Astroids(random(width-100), random(height), this, 60, 192, 192, 192);
        aest3 = new Astroids(random(width-50), random(height), this, 60, 128, 43, 0);
        aest4 = new Astroids(random(width), random(height), this, 60, 169, 169, 169);*/

        ast.add(new Astroids(random(width), random(height-100), this, 60, 128, 43, 0));
        ast.add(new Astroids(random(width-100), random(height), this, 60, 192, 192, 192));
        ast.add(new Astroids(random(width-50), random(height), this, 60, 128, 43, 0));
        ast.add(new Astroids(random(width), random(height), this, 60, 169, 169, 169));

        
        //Frames
        frame = new Frames(4, 4, this, 30);
    }

    public void settings()
    {
    fullScreen();
    }

    // Make Aestroids smaller once clicked
    float attack = -1;
    public void mouseClicked()
    {
        for(Astroids a:ast)
        {
            float d = dist(mouseX,mouseY,a.x,a.y);
            if(d<a.diameter)
            {
                 attack = a.x;
            }
        }
    }

    public void draw()
    {
        background(0);

        // Stars
        stars.render();

        // Astroids
        // aest1.render();
        // aest2.render();
        // ast1.move1();
        // ast2.move2();
        // ast3.render();
        // ast4.render();
        // ast3.move1();
        // ast4.move2();

        for(Astroids a: ast)
        {
            a.render();
            float move = random(0,1);
            if(move == 0)
            {
                a.move1();
                
            }
            else
            {
                a.move2();
            }
            if(attack == a.x)
            {
                a.diameter -= 20;
                attack = -1;
            }
            
        }
        
        // Target View
        circleV.render();

        // Reload
        rButton.render();
        rBar.render();

        //Random Button
        randButton.render();

        //Frames
        frame.render();
    }

}


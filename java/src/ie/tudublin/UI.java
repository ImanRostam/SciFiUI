package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<UIElement> element = new ArrayList<UIElement>();
    ArrayList<Asteroids> ast = new ArrayList<Asteroids>();

    public void setup()
    {
        element.add(new Scope(50, 50, this));
        element.add(new ReloadButton(50, 50, this));
        element.add(new ReloadBar(50, 50, this));
        element.add(new RandomButton(50, 50, this));
        element.add(new Stars(4, 4, this));
        element.add(new Frames(4, 4, this, 30));
        element.add(new UFO(width/2, height/2, this));

        // Astroids
        ast.add(new Asteroids(random(width), random(height-100), this, 60, 128, 43, 0));
        ast.add(new Asteroids(random(width-100), random(height), this, 60, 192, 192, 192));
        ast.add(new Asteroids(random(width-50), random(height), this, 60, 128, 43, 0));
        ast.add(new Asteroids(random(width), random(height), this, 60, 169, 169, 169));
    }

    public void settings()
    {
    fullScreen();
    }

    // Make Aestroids smaller once clicked
    float attack = -1;
    public void mouseClicked()
    {
        for(Asteroids a:ast)
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

        for(Asteroids a: ast)
        {
            a.render();
            // float move = random(0,1);
            // if(move == 0)
            // {
            //     a.move1();
                
            // }
            // else
            // {
            //     a.move2();
            // }
            if(attack == a.x)
            {
                a.diameter -= 20;
                attack = -1;
            }
            
        }
    
        for(UIElement el: element)
        {
            el.render();
        }
    }

}


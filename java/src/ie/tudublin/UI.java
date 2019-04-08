package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<UIElement> element = new ArrayList<UIElement>();
    ArrayList<UFO> ufo = new ArrayList<UFO>();
    ArrayList<Asteroids> ast = new ArrayList<Asteroids>();

    public void setup()
    {
        // All the Shapes
        element.add(new Scope(50, 50, this));
        element.add(new ReloadButton(50, 50, this));
        element.add(new ReloadBar(50, 50, this));
        element.add(new RandomButton(50, 50, this));
        element.add(new Stars(4, 4, this));
        element.add(new Frames(4, 4, this, 30));
        element.add(new RandomBar(50, 50, this));
        element.add(new CircularFrame(0, 0, this));

        // UFO + Alien
        ufo.add(new UFO(random(width), random(height), this, 255, 0, 0));
        ufo.add(new UFO(random(width), random(height), this, 0, 0, 255));
        ufo.add(new UFO(random(width), random(height), this, 128, 0, 0));
        ufo.add(new UFO(random(width), random(height), this, 255, 192, 203));

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

    float attack = -1;
    public void mouseClicked()
    {
        // Attack Asteroids
        for(Asteroids a:ast)
        {
            float d = dist(mouseX,mouseY,a.x,a.y);

            if(d<a.diameter && d<a.diameter)
            {
                 attack = a.x;
            }
        }

        // Attack UFO
        for(UFO ship: ufo)
        {
            float d = dist(mouseX,mouseY,ship.x,ship.y);
            if(d<150 && d < 60)
            {
                ship.setDamage(true);
            }
        }
    }

    public void draw()
    {
        background(0);
        for (UFO ufo: ufo)
        {
            if(ufo.isDamage() == false)
            {
                ufo.render();
                ufo.move();
            }
        }

        for(Asteroids a: ast)
        {
            a.render();
            float move = random(0,1);
            if(attack == a.x)
            {
                a.diameter -= 20;
                attack = -1;
            }
            if(move == 0)
            {
                a.move1();
            }
            else
            {
                a.move2();
            }
        }
    
        for(UIElement el: element)
        {
            el.render();
        }
    }

}


package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<UIElement> element = new ArrayList<UIElement>();
    ArrayList<UFO1> ufo1 = new ArrayList<UFO1>();
    ArrayList<UFO2> ufo2 = new ArrayList<UFO2>();
    ArrayList<Asteroids> ast = new ArrayList<Asteroids>();

    public void setup()
    {
        // All the Shapes
        element.add(new Scope(60, 60, this));
        element.add(new ReloadButton(50, 50, this));
        element.add(new ReloadBar(50, 50, this));
        // element.add(new RandomButton(50, 50, this));
        element.add(new Stars(4, 4, this));
        element.add(new Frames(4, 4, this, 30));
        element.add(new RandomBar(50, 50, this));
        element.add(new ControlPanel(0, 0, this));
        element.add(new Grid(0, 0, this));
        element.add(new UnknownObjects1(0, 0, this));
        element.add(new UnknownObjects2(0, 0, this));

        // UFO1 + Alien
        ufo1.add(new UFO1(random(width), random(height), this, 255, 0, 0));
        ufo1.add(new UFO1(random(width), random(height), this, 0, 0, 255));
        ufo1.add(new UFO1(random(width), random(height), this, 128, 0, 0));
        ufo1.add(new UFO1(random(width), random(height), this, 255, 255, 102));

        // UFO2  + Alien
        ufo2.add(new UFO2(random(width), random(height), this, 204, 153, 255));
        ufo2.add(new UFO2(random(width), random(height), this, 0, 255, 0));
        ufo2.add(new UFO2(random(width), random(height), this, 0, 179, 179));
        ufo2.add(new UFO2(random(width), random(height), this, 138, 138, 92));

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
        for(UFO1 ship: ufo1)
        {
            float d = dist(mouseX,mouseY,ship.x,ship.y);
            if(d<150 && d < 60)
            {
                ship.setDamage(true);
            }
        }

        for(UFO2 ship: ufo2)
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
        
        for (UFO1 ufo1: ufo1)
        {
            if(ufo1.isDamage() == false)
            {
                ufo1.render();
                ufo1.move1();
            }
        }

        for (UFO2 ufo: ufo2)
        {
            if(ufo.isDamage() == false)
            {
                ufo.render();
                ufo.move2();
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


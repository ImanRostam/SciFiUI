package ie.tudublin;

import java.util.ArrayList;
import processing.data.*;

import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Stars> stars = new ArrayList<Stars>();
    ArrayList<LightsOff> off = new ArrayList<LightsOff>();
    ArrayList<UIElement> element = new ArrayList<UIElement>();
    ArrayList<UFO1> ufo1 = new ArrayList<UFO1>();
    ArrayList<UFO2> ufo2 = new ArrayList<UFO2>();
    ArrayList<Asteroids> ast = new ArrayList<Asteroids>();
    ArrayList<ScrollHandle> handle = new ArrayList<ScrollHandle>();
    private ArrayList<Info> info = new ArrayList<Info>();
    boolean lightsOff = false;
    int draw = 0;

    // SoundEffect
    AudioPlayer ComputerSound, SpaceShip;
    AudioPlayer Asteroids, Space;
    Minim minim;
    AudioInput ai;

    public void setup()
    {
        
        // Stars
        element.add(new Stars(4, 4, this));

        // All the Shapes
        element.add(new Scope(60, 60, this));
        element.add(new StartButton(50, 50, this));
        element.add(new ReloadBar(50, 50, this));
        // element.add(new RandomButton(50, 50, this));
        element.add(new Frames(4, 4, this, 30));
        element.add(new RandomBar(50, 50, this));
        element.add(new ControlPanel(0, 0, this));
        element.add(new Grid(0, 0, this));
        element.add(new UnknownObjects1(0, 0, this));
        element.add(new UnknownObjects2(0, 0, this));
        element.add(new CPBars(0, 0, this));
        element.add(new ScrollBar(0, 0, this));
        element.add(new CPButton(0, 0, this));
        // element.add(new WarpStars(2, 10, this));

        // Scroll Handle
        handle.add(new ScrollHandle(0, 0, this));

        // Lights off
        off.add(new LightsOff(5, 5, this));

        // UFO1 + Alien
        ufo1.add(new UFO1(random(width), random(height), this, 255, 0, 0, (int)(random(100, 500))));
        ufo1.add(new UFO1(random(width), random(height), this, 0, 0, 255, (int)(random(100, 500))));
        ufo1.add(new UFO1(random(width), random(height), this, 128, 0, 0, (int)(random(100, 500))));
        ufo1.add(new UFO1(random(width), random(height), this, 255, 255, 102, (int)(random(100, 500))));

        // UFO2  + Alien
        ufo2.add(new UFO2(random(width), random(height), this, 204, 153, 255, (int)(random(100, 500))));
        ufo2.add(new UFO2(random(width), random(height), this, 0, 255, 0, (int)(random(100, 500))));
        ufo2.add(new UFO2(random(width), random(height), this, 0, 179, 179, (int)(random(100, 500))));
        ufo2.add(new UFO2(random(width), random(height), this, 138, 138, 92, (int)(random(100, 500))));

        // Astroids
        ast.add(new Asteroids(random(width), random(height-100), this, 60, 128, 43, 0));
        ast.add(new Asteroids(random(width-100), random(height), this, 60, 192, 192, 192));
        ast.add(new Asteroids(random(width-50), random(height), this, 60, 128, 43, 0));
        ast.add(new Asteroids(random(width), random(height), this, 60, 169, 169, 169));
    
        // Sound
        minim = new Minim(this);
        ComputerSound = minim.loadFile("ComputerSound.mp3");
        SpaceShip = minim.loadFile("SpaceShip.mp3");
        Asteroids = minim.loadFile("Asteroids.mp3");
        Space = minim.loadFile("Space.mp3");

        loadName();
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

    public void mousePressed()
    {
        if((mouseX > 399 && mouseX < 440) && (mouseY > 667 && mouseY < 767))
        {
            for(ScrollHandle handle: handle)
            if(handle.handleY != mouseY)
            {
                handle.setSlide(true);
            }else if (handle.handleY == mouseY)
            {
                handle.setSlide(false);
            }
        }

        if((mouseX > 641 && mouseX < 689) && (mouseY > 603 && mouseY < 652))
        {
            lightsOff = true;
        }

        if((mouseX > 50 && mouseX < 195) && (mouseY > height-280 && mouseY < height-210))
        {
            draw = 1;
        }
    }

    public void keyPressed()
    {
        if(key == 's')
        {
            lightsOff = false;
        }
    }

    public void loadName()
    {
        Table table = loadTable("info.csv", "header");
        for(TableRow row : table.rows())
        {
            Info nameInfo = new Info(row);
            info.add(nameInfo);
        }
    }

    public void drawName()
    {
        for(Info nameInfo : info)
        {
            stroke(255);
            fill(0);
            textSize(20);
            textAlign(CENTER);
            text(nameInfo.getName(), 670, 740);
            noFill();
            noStroke();
        }
    }

    public void draw()
    {
        if(lightsOff == false)
        {
            // Audio
            if(!ComputerSound.isPlaying())
            {
                ComputerSound.play();
                ComputerSound.rewind();
            }

            if(!SpaceShip.isPlaying())
            {
                SpaceShip.rewind();
                SpaceShip.play();
            }

            background(0);
            
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

            if(draw == 1)
                {
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

                }
                
            for(Stars stars: stars)
            {
                stars.render();
            }

            for(UIElement el: element)
            {
                el.render();
                for(int i = 0; i < info.size(); i++)
                {
                    drawName();
                }
            }

            for(ScrollHandle handle: handle)
            {
                handle.render();
            }
            
            for(ScrollHandle handle: handle)
            {
                if((mouseY > 670 && mouseY < 766) && (handle.isSlide() == true || handle.handleY < height - 95))
                {
                        handle.render();
                        handle.handleY = mouseY;
                }
                else
                {
                    handle.handleY = handle.handleY;
                }
            }
        }
        else
        {
            // //Sound
            // Asteroids.play();
            // Space.play();
            if(!Asteroids.isPlaying())
            {
                Asteroids.rewind();
                Asteroids.play();
            }

            if(!Space.isPlaying())
            {
                Space.rewind();
                Space.play();
            }

            background(0);

            for(LightsOff off: off)
            {
                off.render();
            }

            for(Asteroids ast: ast)
            {
                ast.render();
                ast.render();
                ast.move2();
            }
        }
    }    
}


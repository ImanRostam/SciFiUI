package ie.tudublin;

import processing.core.PApplet;

public class UFO2 extends UIElement
{
    protected int colR, colG, colB;
    private boolean damage;
    protected int licensePlate;

    public UFO2(float x, float y, PApplet ui, int colR, int colG, int colB, int licensePlate)
    {
        super(x, y, ui);
        this.damage = false;
        this.colR = colR;
        this.colG = colG;
        this.colB = colB;
        this.licensePlate = licensePlate;
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(1);

        // UFO Head Frame
        ui.fill(120);
        ui.ellipse(x, y-20, 85, 89);

        // UFO Inside Frame
        ui.strokeWeight(2);
        ui.stroke(0);
        ui.fill(0);
        ui.ellipse(x, y-20, 75, 77);

        // Alien antenna
        ui.strokeWeight(2);
        ui.stroke(255);
        ui.line(x, y, x-10, y-45);
        ui.line(x, y, x, y-47);
        ui.line(x, y, x+10, y-45);
        

        // Alien
        ui.stroke(0);
        ui.fill(colR, colG, colB);
        ui.ellipse(x, y-10, 50, 60);
        ui.fill(0);
        ui.ellipse(x-5, y-25, 10, 13);
        ui.ellipse(x+7, y-25, 10, 13);

        // UFO Body Frame
        ui.strokeWeight(1);
        ui.fill(120);
        ui.ellipse(x, y, 100, 42);

        // UFO Body Design 
        ui.fill(0);
        ui.textSize(8);
        ui.text(("UFO " + licensePlate), x+6, y+4);
    }

    public void move2()
    {
        y = y - 5;
        x = x - 5;

        if(y>ui.height || x<0)
        {
            x = 0+ui.random(ui.width);
            y = ui.height;
        }
    }

    /**
     * @return the damage
     */
    public boolean isDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    // IDEA
    // When clicked on it - it will show a message from the Alien
    // When press letter S and the mouse is at it - it will shot the Alien 
}
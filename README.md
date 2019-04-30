# SciFi UI Project

Name: Iman Rostam

Student Number: C17367011

Fork this repository and use it a starter project for your assignment

# Description of the assignment
For this OOP assignment I had to create a Sci-Fi User Interface. For my assignment I based it on the idea of spaceships, aliens and space in general. The UI allows the user to kill aliens and shoot down asteroids. Turn off the lights to experience and admire the stars and asteroids from inside The Grand 3000. 

# Instructions
Once the program runs, users will be greeted with the view of the blinking stars and moving asteroids as if they are inside the spaceship, *The Grand 3000*. Audio files, ComputerSound.mp3 and SpaceShip.mp3, will be playing in the background. 

The red, blue, purple and white spinning scope will follow the location of the mouseX and mouseY. 

The bar chart on the right side will change colour base on the location of mouseX and mouseY. The bar chart on the control panel section will also move right to left according to the mouseX and mouseY. 

The scroll handle will move once you click on the red handle and move it up and down with your mouse. And if you click the red handle again it will stop at that location. 

Once the user is ready to kick some butt, the user can press on the 'START' button and 'the killing mode' will turn on which means the aliens will appear. To kill the aliens, users will use the scope to follow the aliens and once they click their mouse then the aliens will die and disappear. If the user wishes to be nice and not kill the aliens, they may exit 'the killing mode' by pressing key 'a'. 

While the user is on 'the killing mode', they can also destroy the asteroids by clicking on them. The asteroids will become smaller and smaller and eventually it will disappear. 

The user can enjoy and admire the stars and asteroids when the lights inside the spaceship is turned off by pressing the 'OFF' button. Audio files, Space.mp3 and Asteroids.mp3, will be played in the background for the user to relax.

# How it works
These are the following classes made for this assignment:

UI class 
- The main class and where everything is drawn


# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |


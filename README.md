# SciFi UI Project

Name: Iman Rostam

Student Number: C17367011

Fork this repository and use it a starter project for your assignment

# Description of the assignment
For this OOP assignment I had to create a Sci-Fi User Interface. For my assignment I based it on the idea of spaceships, aliens and space in general. The UI allows the user to kill aliens and shoot down asteroids. Turn off the lights to experience and admire the stars and asteroids from inside The Grand 3000. 

# Instructions
Once the program runs, users will be greeted with the view of the blinking stars and moving asteroids as if they are inside the spaceship, *The Grand 3000*. Audio files, ComputerSound.mp3 and SpaceShip.mp3, will be playing in the background. 

The red, blue, purple and white spinning scope will follow the location of the mouseX. 

The bar chart on the right side will change colour base on the location of mouseX and mouseY. The bar chart on the control panel section will also move right to left according to the mouseX and mouseY. 

The scroll handle will move once you click on the red handle and move it up and down with your mouse. And if you click the red handle again it will stop at that location. 

Once the user is ready to kick some butt, the user can press on the '*START*' button and '*the killing mode*' will turn on which means the aliens will appear. To kill the aliens, users will use the scope to follow the aliens and once they click their mouse then the aliens will die and disappear. If the user wishes to be nice and not kill the aliens, they may exit '*the killing mode*' by pressing key '*a*'. 

While the user is on '*the killing mode*', they can also destroy the asteroids by clicking on them. The asteroids will become smaller and smaller and eventually it will disappear. 

The user can enjoy and admire the stars and asteroids when the lights inside the spaceship is turned off by pressing the '*OFF*' button. Audio files, Space.mp3 and Asteroids.mp3, will be played in the background for the user to relax. Once the program is run, users will be greeted with the view of the stars and asteroids. 

# How it works
These are the following classes made for this assignment:

#### Main Class 
The UI class is main class and where everything is called and rendered. This class includes array lists, the declaration of array lists, mouseClicked methods, mousePressed methods and keyPressed methods. 

#### Super Class
The UIElement class is the super class which all classes will need to inherit.

#### Control Panel
The control panels design was made up of different classes: 
- Control Panel class - This drew the control panel itself and the boxes
- CPBars class - This drew the bar left side of the control panel, this is the one that will move right to left following the mouseX
- CPButton class - This drew the small blue buttons and the red '*OFF*' button. The '*OFF*' button will bring you to another page, the LightsOff class
- Grid class - This drew the red grid
- UnknownObjects1 class and UnknownObjects2 class - This is the random ellipse shapes that appears on the grid
- Info class - Using a csv file to load the text '*The Grand 3000*'
- ScrollBar class - This drew the scroll bar 
- ScrollHandle class - This drew the handle, the sliding of the handle was implemented in the main class, UI class

#### Scope Class
This class drew the circle scope that follows the mouseX and mouseY. I made the rotation of the arcs using pushMatrix(), translate(), rotate() and popMatrix() methods.

#### UFO Classes
I made 2 classes for UFO: UFO 1 and UFO 2. Both class carries the same functions the only different is that the alien and UFO itself in UFO1 class is bigger than the one in UFO2 class. The alien and UFO in UFO2 class also moves at a faster speed.

#### Button Class
I made a StartButton class that will make the aliens appear (once the '*START*' button is clicked) so the user can kill the aliens. 

#### Frames Class
This class creates the red edges on the UI

#### Stars Class
This class creates the background stars. I used ellipse and placed it at random height and width to create the blinking stars effect

#### LightsOff Class
Once the '*OFF*' button is clicked the LightsOff background will appear

#### Asteroids Class
The asteroids were built in this class and the movement of the asteroids were also implemented in this class. The movement from one side of the screen to the other and it will reappear once it reaches the edges of the screen.

#### Bar Class
Bottom right section of the UI screen has a bar chart. The bar chart changes colour depending on the mouseX and mouseY

#### Filler Classes
I created 2 classes: RandomButton and ReloadBar classes to fill up my UI screen. It doesn't have any special feautures

# What I am most proud of in the assignment
What I'm most proud of in my assignment is being able to implement the shooting and killing of the aliens. It was a tricky challenge for me since it was the first time I came across this situation while doing the assignment. It took me a while to figure out how to do it but I managed to find the way. After implementing it for the aliens, I also implemented it for the asteroids. And personally, I am proud of myself after doing this assignment because I actually had to think hard of what I needed to code in order to follow the plan that I drew. There were times when I woke up in the middle of the night with an idea of code to implement and straight away I would type it into my phone and try it the next day and most of the time it works. The basic idea for the implementation of the killing of aliens was actually one of those 'middle of the night' idea. 

## Images
### Start page
![An image](images/Home.png)

### Killing Mode Page
![An image](images/KillingMode.PNG)

### Lights Off Mode
![An image](images/LightsOff.PNG)

## Youtube 
This is my YouTube video:
[![YouTube](images/youtube.PNG)](https://youtu.be/d8lFO6YR4hU)

### MY info.csv File:

| Name:          |
|----------------|
| The Grand 3000 |

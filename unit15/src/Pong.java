//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

import javax.swing.KeyStroke;

import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private boolean lose = false;
	public Pong() {
		// set up all variables related to the game
		//ball = new Ball();
		//ball = new BlinkyBall();
		ball = new SpeedUpBall(200, 200, 20, 20, 1, 1);
		ball.setColor(Color.blue);
		leftPaddle = new Paddle(20, 10, 10, 100, 5);
		rightPaddle = new Paddle(770, 10, 10, 100, 5);
		leftPaddle.setColor(Color.orange);
		rightPaddle.setColor(Color.orange);
		leftScore = 0;
		rightScore = 0;
		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;
		if (lose) {
			twoDGraph.drawString("GAME OVER", 300, 200);
			return;
		}
		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		ball.moveAndDraw(graphToBack);
		rightPaddle.draw(graphToBack);
		leftPaddle.draw(graphToBack);

		// see if ball hits left wall or right wall
		if (!(ball.getX() >= 10 && ball.getX() <= 770)) {
			lose = true;
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}
		if((ball.getY()>=540))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.getY()<=20) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		// see if the ball hits the top or bottom wall
		if (!(ball.getY() >= 10 && ball.getY() <= 590)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if ((ball.getX() <= leftPaddle.getX()) && //check if paddle is within bounds of x
				((leftPaddle.getY() <= ball.getY()) && (ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()) 
				))
		    {
			leftScore++;
		    	ball.setXSpeed(-ball.getXSpeed());
		    	if(ball.getYSpeed()<0) {
	        		ball.setYSpeed(ball.getYSpeed()-1);
	        	}
	        	if(ball.getYSpeed()>0) {
	        		ball.setYSpeed(ball.getYSpeed()+1);
	        	}
		    }
		    
		    if ((ball.getX()+ball.getWidth() >= rightPaddle.getX()) && //check if paddle is within bounds of x
		    		((rightPaddle.getY() <= ball.getY()) && (ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()) 
		    		))
		        {
		    	rightScore++;
		        	ball.setXSpeed(-ball.getXSpeed());
		        	if(ball.getYSpeed()<0) {
		        		ball.setYSpeed(ball.getYSpeed()-1);
		        	}
		        	if(ball.getYSpeed()>0) {
		        		ball.setYSpeed(ball.getYSpeed()+1);
		        	}
		        }
		// see if the paddles need to be moved
		if (keyIsPressed('W') == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keyIsPressed('Z') == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}

		if (keyIsPressed('I') == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keyIsPressed('M') == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if (leftPaddle.getY() < 0)
			leftPaddle.setY(0);
		
		if (rightPaddle.getY() < 0)
			rightPaddle.setY(0);
		
		if (leftPaddle.getY() > 500)
			leftPaddle.setY(500);
		
		if (rightPaddle.getY() > 500)
			rightPaddle.setY(500);
		
		twoDGraph.drawImage(back, null, 0, 0);
		twoDGraph.setColor(Color.red);
		twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 20, 520);
		twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 20, 550);

	}

	public boolean keyIsPressed(char key) {
		switch (toUpperCase(key)) {
		case 'W':
			return keys[0];
		case 'Z':
			return keys[1];
		case 'I':
			return keys[2];
		case 'M':
			return keys[3];
		}
		return false;
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}
	public void createEncode(Picture message) {
		Pixel[][] messagePixels = message.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
	
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = currPixels[row][col];
				messagePixel = messagePixels[row][col];
				int r = (currPixel.getRed()%100)%10;
				int b = (currPixel.getBlue()%100)%10;
				int sq = r*b;
				if (messagePixel.colorDistance(Color.BLACK) < 200) {
					if(Math.sqrt(sq)%1==0) {
						
					}
					else {
						
						int redRound = currPixel.getRed()/10;
						redRound=redRound*10; 
						if(redRound==250&&b>5) {
							redRound=240+b;
						}
						else {
							redRound+=b;
						}
						currPixel.setRed(redRound);
					}
				}
				else {

					
						int redRound = currPixel.getRed()/10;
						int blueRound = currPixel.getBlue()/10;
						redRound=redRound*10; blueRound=blueRound*10;
						currPixel.setRed(redRound+4);
						currPixel.setBlue(blueRound+5);
					
				}
			}
		}
	}
	public Picture createDecode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				int r = (currPixel.getRed()%100)%10;
				int b = (currPixel.getBlue()%100)%10;
				if (Math.sqrt(r*b)%1==0) {
					messagePixel.setColor(Color.BLACK);
				}
			}
		}
		return messagePicture;
	}
	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				// if the current pixel red is odd make it even
				currPixel = currPixels[row][col];
				if (currPixel.getRed() % 2 == 1)
					currPixel.setRed(currPixel.getRed() - 1);
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					currPixel.setRed(currPixel.getRed() + 1);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				if (currPixel.getRed() % 2 == 1) {
					messagePixel.setColor(Color.BLACK);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}

	/** Method to set the blue to 0 */
	public void backgroundSwap(Picture newBackground) {
		System.out.println("Pranav Bantval\nPeriod 1\nComputer 25\n5-17-2022");
		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] backpixel = newBackground.getPixels2D();
		for (Pixel[] rows : pixels) {
			for (Pixel pix : rows) {
				if (pix.getBlue() > pix.getGreen() && pix.getBlue() > pix.getRed()) {
					pix.setColor(backpixel[pix.getY()][pix.getX()].getColor());
				}
				if (pix.getX() > 356 && pix.getY() > 357 && pix.getX() < 403 && pix.getY() < 385) {
					pix.setBlue(190);
					pix.setGreen(199);
					pix.setRed(203);
				}
				if (pix.getX() < 40 || pix.getY() < 50) {
					pix.setColor(backpixel[pix.getY()][pix.getX()].getColor());
				}
			}
		}
	}

	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
				pixelObj.setRed(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate() {
		Pixel[][] p = this.getPixels2D();
		for (Pixel[] pp : p) {
			for (Pixel ppp : pp) {
				ppp.setBlue(255 - ppp.getBlue());
				ppp.setGreen(255 - ppp.getGreen());
				ppp.setRed(255 - ppp.getRed());
			}
		}
	}

	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int avg = pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen();
				avg = avg / 3;
				pixelObj.setBlue(avg);
				pixelObj.setGreen(avg);
				pixelObj.setRed(avg);
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel pixel = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				pixel = pixels[row][col];
				pixel.setRed(pixel.getRed() * 5);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVRTL() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[height - row - 1][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHBTT() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[height - row - 1][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int max = pixels.length;
		if (pixels[0].length < max)
			max = pixels[0].length;
		for (int row = 1; row < max; row++) {
			for (int col = 0; col < row; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[col][row];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count + "");
	}

	public void mirrorArms() {
		Pixel topPixel = null;
		Pixel botPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		for (int row = 155; row < 191; row++) {
			for (int col = 98; col < 169; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[191 - row + 191][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
		for (int row1 = 155; row1 < 191; row1++) {
			for (int col = 238; col < 296; col++) {
				topPixel = pixels[row1][col];
				botPixel = pixels[191 - row1 + 191][col];
				botPixel.setColor(topPixel.getColor());

			}
		}

	}

	public void mirrorGull() {
		int mirrorPoint = 350;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		for (int row = 225; row < 332; row++) {
			for (int col = 219; col < mirrorPoint; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void copyPart(Picture fromPic, int startRow, int startCol, int fromRowStart, int fromColStart,
			int fromRowEnd, int fromColEnd) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		if (fromRowStart < 0 || fromRowStart > fromPixels.length) {
			fromRowStart = 0;
		}
		if (fromColStart < 0 || fromColStart > fromPixels[0].length) {
			fromColStart = 0;
		}
		if (fromRowEnd < 0 || fromRowEnd > fromPixels.length) {
			fromRowEnd = fromPixels.length;
		}
		if (fromColEnd < 0 || fromColEnd > fromPixels[0].length) {
			fromColEnd = fromPixels[0].length;
		}
		for (int fromRow = fromRowStart, toRow = startRow; fromRow < fromRowEnd
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = fromColStart, toCol = startCol; fromCol < fromColEnd
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	public void edgeDetection2(int edgeDist) {
		Picture copy = new Picture(this);
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist) {
					leftPixel.setColor(Color.BLACK);
				} else {
					leftPixel.setColor(Color.WHITE);
				}
			}
		}
		Pixel[][] copyPixels = copy.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		Color botColor = null;
		for (int row = 0; row < copyPixels.length - 1; row++) {
			for (int col = 0; col < copyPixels[0].length; col++) {
				topPixel = copyPixels[row][col];
				botPixel = copyPixels[row + 1][col];
				botColor = botPixel.getColor();
				if (topPixel.colorDistance(botColor) > edgeDist) {
					pixels[row][col].setColor(Color.BLACK);
				}
			}
		}
	}

	public void myCollage() {

		Picture beach = new Picture("beach.jpg");
		Picture seagull = new Picture("seagull.jpg");
		Picture wall = new Picture("wall.jpg");
		this.copy(beach, 0, 0);
		beach.mirrorDiagonal();
		this.copy(beach, 100, 0);
		seagull.zeroBlue();
		this.copyPart(seagull, 200, 0, 200, 200, 350, 350);
		wall.grayscale();
		this.copyPart(wall, 300, 0, 78, 107, 202, 352);
		this.mirrorVertical();
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */

	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this

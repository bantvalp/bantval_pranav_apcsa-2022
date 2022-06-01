/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testNegate() {
	  Picture pic = new Picture("blueMotorcycle.jpg");
	  pic.explore();
	  pic.negate();
	  pic.explore();
  }
  public static void testGrayscale() {
	  Picture pic = new Picture("blueMotorcycle.jpg");
	  pic.explore();
	  pic.grayscale();
	  pic.explore();
  }
  public static void testFixUnderwater() {
	  Picture pic = new Picture("water.jpg");
	  pic.explore();
	  pic.fixUnderwater();
	  pic.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVRTL()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVRTL();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal() {
	  Picture pic = new Picture("redMotorcycle.jpg");
	  pic.explore();
	  pic.mirrorHorizontal();
	  pic.explore();
  }
  public static void testMirrorHBTT() {
	  Picture pic = new Picture("redMotorcycle.jpg");
	  pic.explore();
	  pic.mirrorHBTT();
	  pic.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture pic = new Picture("beach.jpg");
	  pic.explore();
	  pic.mirrorDiagonal();
	  pic.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms() {
	  Picture arm = new Picture("snowman.jpg");
	  arm.explore();
	  arm.mirrorArms();
	  arm.explore();
  }
  public static void testMirrorGull() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testCopyPart()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.copyPart(new Picture("seagull.jpg"),230,300,200,200,350,350);
    beach.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    Picture swan2 = new Picture("swan.jpg");
    swan2.edgeDetection2(10);
    swan2.explore();
  }
  public static void testBackgroundSwap()
  {
    	Picture mark = new Picture("blue-mark.jpg");
    	Picture moon = new Picture("moon-surface.jpg");
    	mark.backgroundSwap(moon);  //replace blue pixels in mark with pixels in moon
					    //replace pixels containing the logo on the t-shirt
   	mark.explore();
  }
 public static void testEncodeDecode() {
	 Picture beach = new Picture("beach.jpg");
	 beach.explore();
	 //Picture message = new Picture("apple_icon.jpg");
	 Picture message = new Picture("msg.jpg");
	 beach.encode(message);
	 beach.explore();
	 beach.decode().explore();
 }
 public static void testCreateEncodeDecode() {
	 Picture beach = new Picture("beach.jpg");
	 beach.explore();
	// Picture message = new Picture("apple_icon.jpg");
	 Picture message = new Picture("msg.jpg");
	 beach.createEncode(message);
	 beach.explore();
	 beach.createDecode().explore();
 }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test this is
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();//
//    testKeepOnlyBlue();//
//    testKeepOnlyRed();//
//    testKeepOnlyGreen();//
//    testNegate();//
//    testGrayscale();//
//    testFixUnderwater();//
//    testMirrorVertical();//
//    testMirrorVRTL();//
//    testMirrorHorizontal();//
//	  testMirrorHBTT();//
//    testMirrorTemple();//
//    testMirrorArms();//
//    testMirrorGull();//
//    testMirrorDiagonal();//
//    testCollage();//
//    testCopyPart();//
//    testEdgeDetection();//
//    testEdgeDetection2();//
   //testBackgroundSwap();
	 // testEncodeDecode();
	  testCreateEncodeDecode();
	  
	  
	 //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}

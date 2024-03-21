import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class ImageConverter 
{
	public static void main(String[] args) 
	{
		File file=new File("C:\\Users\\HP\\Pictures\\download (3).png");
		try{

			BufferedImage image=ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++){
				for(int j=0;j<image.getWidth();j++){
					Color color= new Color(image.getRGB(j,i));
					if((color.getRed()==0) && (color.getBlue()==0) && (color.getGreen()==1) )
					{  
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}catch(Exception e){
		}
	}
}

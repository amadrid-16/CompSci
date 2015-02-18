public class Color{
   public int r,g,b;
   public int rin,gin,bin;
   public int decform;
   public int redChange,greenChange,blueChange;
   public int saturation;
   public int compareVal;
   public String hexform,rgb;
   public static String hexString;
   public static int validNum;
   
   
   public String toString(){//method to put the color into rgb form. it returns the rgb form from the ealrier inputs
      this.rgb = "rgb(" + this.r + ", " + this.g + ", " + this.b + ")";
   
      return this.rgb;
   }
   public Color(){ //creates a default counstructor for the Color object it uses overloading to go to the 
      this(255,255,255);//more specific form of the constructor\/\/\/

      //then run rgb method
   }
   public Color(int rin, int gin, int bin){//uses the specific color inputs 
      this.r = Color.valid(rin);//for red component of the rgb input
      this.g = Color.valid(gin);//for green component of the rgb code
      this.b = Color.valid(bin);//for th blue component of the rgb code     
   }
   public String htmlHex(){
      //convert from rgb to hex
      this.decform = (((r*256)+g)*256)+b;
         //rin * 256
         //^^+g
         //^^*256
         //^^+b
         //^^=decimal
      //decimal to hexadecimal
      this.hexform = Integer.toHexString(this.decform);//changes the decimal form to hexadecimal format using the to HexString() method
      this.hexform = "#" + this.hexform.toUpperCase(); //put the hex form into the correct format
      return this.hexform;//return Hexadecimal format
   }
   public int changeRed(int redChange){
      this.r += redChange;//r = r + redChange
      return r;//returns the integer that we changed. almost like refreshing and saving the value 
   }
   public int changeGreen(int greenChange){
      this.g += greenChange;// does the same as the changeRed() method with the green value
      return g;
   }
   public int changeBlue(int blueChange){
      this.b += blueChange;// does the same as the changeRed() and changeGreen() methods with the blue value

      return b;
   }
   public static Color black(){
     Color black = new Color(0, 0, 0);//creates new instance of the Color object
     return black;
   }
   public int saturation(){
      this.saturation = this.r + this.g + this.b;
      return this.saturation;
   }
   public int compareTo(Color other){
      this.compareVal = other.saturation - this.saturation;
      
      return this.compareVal;
   }
   public static String hexify(int num){
      
      hexString = Integer.toHexString(num);
      return hexString;
   }
   public static int valid(int num){
      
     if(num<0){
      validNum = 0;
     } 
     else if(num>255){
      validNum = 255;
     }
     else{
      validNum = num;
     }
     return validNum;
   }


}
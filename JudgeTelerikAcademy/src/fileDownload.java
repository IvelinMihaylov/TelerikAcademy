import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class fileDownload {
  public static void saveImage(String imageUrl, String destinationFile) throws IOException {
    URL url = new URL(imageUrl);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destinationFile);
    
    byte[] b = new byte[2048];
    int length;
    
    while ((length = is.read(b)) != -1) {
      os.write(b, 0, length);
    }
    
    is.close();
    os.close();
  }
  
  public static void download(String address, String localFileName) {
    OutputStream out = null;
    URLConnection conn = null;
    InputStream in = null;
    
    try {
      URL url = new URL(address);
      out = new BufferedOutputStream(new FileOutputStream(localFileName));
      conn = url.openConnection();
      in = conn.getInputStream();
      byte[] buffer = new byte[1024];
      
      int numRead;
      long numWritten = 0;
      
      while ((numRead = in.read(buffer)) != -1) {
        out.write(buffer, 0, numRead);
        numWritten += numRead;
      }
      
      System.out.println(localFileName + "\t" + numWritten);
    }
    catch (Exception exception) {
      exception.printStackTrace();
    }
    finally {
      try {
        if (in != null) {
          in.close();
        }
        if (out != null) {
          out.close();
        }
      }
      catch (IOException ioe) {
      }
    }
  }
  
  
  public static void main(String[] args) throws Exception {
    download("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Pumiforme.JPG/240px-Pumiforme.JPG", "C:\\Users\\IvelinMihaylov\\Desktop\\JavaCourse 2018\\JudgeTelerikAcademy\\src\\image\\image1.jpg");
    String imageUrl = "http://arsofia.com/uploads/2011/02/beki.jpg";
    String destinationFile = "C:\\Users\\IvelinMihaylov\\Desktop\\JavaCourse 2018\\JudgeTelerikAcademy\\src\\image\\image2.jpg";
    saveImage(imageUrl, destinationFile);
  }
}

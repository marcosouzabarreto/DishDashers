import java.io.*;
import java.util.Scanner;

public class SaveGame {

  public void save (int fase) {
    try {
      PrintWriter out = new PrintWriter("save.txt");
      out.print(fase);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public int load () {
    int fase = -1;
    try {
      File myObj = new File("save.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        fase = myReader.nextInt();
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return fase;
  }
}

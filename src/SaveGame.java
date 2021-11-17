import org.json.simple.*;
import java.io.*;

public class SaveGame {
  private final int fase;

  private static FileWriter saveFile;

  @SuppressWarnings("unchecked")

  public void save () {
    JSONObject object = new JSONObject();

    object.put("fase", fase);

    try {
      saveFile = new FileWriter("save.txt");
      saveFile.write(object.toJSONString());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        saveFile.flush();
        saveFile.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public SaveGame (int fase) {
    this.fase = fase;
  }

}

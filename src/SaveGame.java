import org.json.simple.JSONObject;
import java.io.*;

public class SaveGame {

  @SuppressWarnings("unchecked")

  public void save (int fase) {
    JSONObject object = new JSONObject();

    object.put("fase", fase);

    try {
      FileWriter saveFile = new FileWriter("save.json");
      saveFile.write(object.toJSONString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

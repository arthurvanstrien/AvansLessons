/**
 * Created by Arthur on 20-2-2017.
 */
import jdk.nashorn.internal.parser.JSONParser;

import javax.json.*;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;

public class TiledMapPractice
{
    public static final String _path = System.getProperty("user.dir");
    public static final String _jsonFile = _path + "\\src\\testfile.json";

    public static void main(String[] args)
    {
        JsonObject jsonObject = null;
        try(
                InputStream file = new FileInputStream(_jsonFile);
                JsonReader jsonReader = Json.createReader(file);
        ){
            jsonObject = jsonReader.readObject();}
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(jsonObject);

        int height = jsonObject.getInt("height");
        System.out.println(height);

        JsonArray layers = jsonObject.getJsonArray("layers");

        for(int i = 0; i < layers.size(); i++)
        {
            JsonObject layer = layers.getJsonObject(i);

            System.out.println(layer.getString("name"));
        }


        //while(parser.hasNext())

        /*
        for(int i = 0; i < jsonObject.size(); i++)
        {
            System.out.println(jsonObject.);
        }*/
    }
}

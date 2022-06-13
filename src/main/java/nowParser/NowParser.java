package nowParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import util.CsvParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NowParser {

    private static final String filePath = "D:/DEV/nowparser/src/main/resources/csv/top20.csv";

    public static void nParser() throws IOException {
        JSONArray jsonArray = new JSONArray();

        CsvParser csvParser = new CsvParser(filePath);

        String[] line=null;
        int index = 0;
        while((line = csvParser.nextRead()) != null){
            if (index != 0) {
                JSONObject jo = new JSONObject();
                jo.put("id", line[0]);
                jo.put("title", line[1]);
                jo.put("licenseOrgan", line[2]);
                jo.put("esRegdt", line[3]);
                jsonArray.add(jo);
            }
            index++;
        }

        for(int i=0; i<jsonArray.size(); i++) {
            Map<String, Object> getObj = (HashMap<String, Object>) jsonArray.get(i);
            String id = (String) getObj.get("id");
            String licenseOrgan = (String) getObj.get("licenseOrgan");
            System.out.print("Id : " + id);
            System.out.println(" / licenseOrgan : " + licenseOrgan);
        }
    }
}

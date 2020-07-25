package filereading;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import filereading.relation.Relation;
import filereading.stations.Station;

import java.io.*;
import java.util.List;

public class JsonFilesReader {

    Gson gson = new Gson();
    List<Relation> relationList;
    String relationsFilePath;
    String nodesFilePath;


    public JsonFilesReader(String relationsFilePath,String nodesFilePath) {
        this.relationsFilePath =relationsFilePath;
        this.nodesFilePath=nodesFilePath;
    }

    public List<Relation> getRelationFromPath() throws IOException {
        String jsonContent = this.readFromInputStream(this.relationsFilePath);
        return gson.fromJson(jsonContent.toString(), new TypeToken<List<Relation>>() {
        }.getType());
    }

    public List<Station> getStationsFromPath() throws IOException {
        String jsonContent = this.readFromInputStream(this.nodesFilePath);
        return gson.fromJson(jsonContent.toString(), new TypeToken<List<Station>>() {
        }.getType());
    }

    private String readFromInputStream(String path) throws IOException {
        StringBuilder result = new StringBuilder();
        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            result.append(st);

        return result.toString();
    }


}

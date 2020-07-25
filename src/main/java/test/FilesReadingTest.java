package test;

import filereading.JsonFilesReader;
import filereading.relation.Relation;
import filereading.stations.Station;

import java.io.IOException;
import java.util.List;

public class FilesReadingTest {

    public static void main(String args[]) throws IOException {
        JsonFilesReader jsonFilesReader = new JsonFilesReader("src/main/java/test/full.json", "src/main/java/test/nodes.json");
        List<Relation> relationList = jsonFilesReader.getRelationFromPath();
        List<Station> stationList = jsonFilesReader.getStationsFromPath();
        System.out.println("Count Relations " + relationList.size());
        System.out.println("Count Stations " + stationList.size());
    }
}

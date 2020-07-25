package test;

import algorithms.eppstein.Eppstein;
import filereading.JsonFilesReader;
import filereading.relation.Relation;
import filereading.stations.Station;
import tools.Graph;
import tools.Node;
import util.Path;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class TestCasaData {

    public static void main(String[] args) throws IOException {
        JsonFilesReader jsonFilesReader = new JsonFilesReader("src/main/java/test/full.json", "src/main/java/test/nodes.json");
        List<Relation> relationList = jsonFilesReader.getRelationFromPath();
        List<Station> stationList = jsonFilesReader.getStationsFromPath();
        Graph graph = new Graph();
        HashMap<String, Node> nodeHashMap = new HashMap<>();

        int k = 100;
        String source = "214";
        String destination = "207";

        System.out.println("Loading Stations and Relations");

        for (Station station : stationList
        ) {
            Node node = new Node();
            node.setLabel(station.getN().getIdentity().toString());
            node.setName(station.getN().getProperties().getStationName());
            nodeHashMap.put(station.getN().getIdentity().toString(), node);
        }
        System.out.println("Nodes Loaded");

        for (Relation relation : relationList) {
            Node depart = nodeHashMap.get(relation.getR().getStart().toString());
//            Check if it does exist
            if (depart.getNeighbors().containsKey(relation.getR().getEnd().toString())) {
                double currentWeight = depart.getNeighbors().get(relation.getR().getEnd().toString());
                if (relation.getR().getProperties().getDureeEtCout() < currentWeight) {
                    depart.getNeighbors().put(relation.getR().getEnd().toString(), relation.getR().getProperties().getDureeEtCout().doubleValue());
                }
            }
            {
                depart.getNeighbors().put(relation.getR().getEnd().toString(), relation.getR().getProperties().getDureeEtCout().doubleValue());
            }
        }

        System.out.println("Relation Loaded");

        System.out.println("Creating graph");

        for (Node node : nodeHashMap.values()
        ) {
            graph.addNode(node);
        }
        System.out.println("Graph created");


        System.out.println("Computing the " + k + " shortest paths from [" + source + "] to [" + destination + "] ");
        System.out.println("using Eppstein.Eppstein's algorithm... ");
        List<Path> ksp;
        long timeStart = System.currentTimeMillis();
        Eppstein eppsteinAlgorithm = new Eppstein();
        ksp = eppsteinAlgorithm.ksp(graph, source, destination, k);
        long timeFinish = System.currentTimeMillis();
        System.out.println("complete.");

        System.out.println("Operation took " + (timeFinish - timeStart) / 1000.0 + " seconds.");

        /* Output the K shortest paths */
        System.out.println("k) cost: [path]");
        int n = 0;
        for (Path p : ksp) {
            StringBuilder toDisplay = new StringBuilder();
            List<String> listNodes = p.getlistOfNodes();
            for (String nodeID : listNodes
            ) {
                toDisplay.append(graph.getNodes().get(nodeID).getName());
                toDisplay.append(" - ");
            }
            System.out.println(++n + ") " + toDisplay.toString());
        }

    }
}

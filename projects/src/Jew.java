import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jew {
    public static void main(String[] args) {
        Transport distanceAB = new Transport("A", "B", 12);
        Transport distanceAC = new Transport("A", "C", 2);
        Transport distanceAD = new Transport("A", "D", 5);
        Transport distanceAE = new Transport("A", "E", 7);
        Transport distanceAF = new Transport("A", "F", 8);
        Transport distanceAG = new Transport("A", "G", 1);
        Transport distanceAH = new Transport("A", "H", 0);
        Transport distanceAI = new Transport("A", "I", 12);
        Transport distanceAJ = new Transport("A", "J", 0);
        Transport distanceBC = new Transport("B", "C", 5);
        Transport distanceBD = new Transport("B", "D", 2);
        Transport distanceBE = new Transport("B", "E", 9);
        Transport distanceBF = new Transport("B", "F", 3);
        Transport distanceBG = new Transport("B", "G", 2);
        Transport distanceBH = new Transport("B", "H", 3);
        Transport distanceBI = new Transport("B", "I", 30);
        Transport distanceBJ = new Transport("B", "J", 4);
        Transport distanceCD = new Transport("C", "D", 12);
        Transport distanceCE = new Transport("C", "e", 0);
        Transport distanceCF = new Transport("C", "F", 1);
        Transport distanceCG = new Transport("C", "G", 2);
        Transport distanceCH = new Transport("C", "H", 0);
        Transport distanceCI = new Transport("C", "I", 78);
        Transport distanceCJ = new Transport("C", "J", 90);
        Transport distanceDE = new Transport("D", "E", 12);
        Transport distanceDF = new Transport("D", "F", 5);
        Transport distanceDG = new Transport("D", "G", 6);
        Transport distanceDH = new Transport("D", "H", 67);
        Transport distanceDI = new Transport("D", "I", 7);
        Transport distanceDJ = new Transport("D", "J", 9);
        Transport distanceEF = new Transport("E", "F", 0);
        Transport distanceEG = new Transport("E", "G", 2);
        Transport distanceEH = new Transport("E", "H", 76);
        Transport distanceEI = new Transport("E", "I", 34);
        Transport distanceEJ = new Transport("E", "J", 4);
        Transport distanceFG = new Transport("F", "G", 7);
        Transport distanceFH = new Transport("F", "H", 2);
        Transport distanceFI = new Transport("F", "I", 5);
        Transport distanceFJ = new Transport("F", "J", 9);
        Transport distanceGH = new Transport("G", "H", 3);
        Transport distanceGI = new Transport("G", "I", 46);
        Transport distanceGJ = new Transport("G", "J", 56);
        Transport distanceHI = new Transport("H", "I", 87);
        Transport distanceHJ = new Transport("H", "J", 3);
        Transport distanceIJ = new Transport("I", "J", 83);
        List<Transport> transportListA = new ArrayList<>();
        transportListA.add(distanceAB);
        transportListA.add(distanceAC);
        transportListA.add(distanceAD);
        transportListA.add(distanceAE);
        transportListA.add(distanceAF);
        transportListA.add(distanceAG);
        transportListA.add(distanceAH);
        transportListA.add(distanceAI);
        transportListA.add(distanceAJ);
        City cityA = new City("A",12, transportListA);
        System.out.println(cityA);

        List<Transport> transportListB = new ArrayList<>();
        transportListB.add(distanceAB);
        transportListB.add(distanceBC);
        transportListB.add(distanceBD);
        transportListB.add(distanceBE);
        transportListB.add(distanceBF);
        transportListB.add(distanceBG);
        transportListB.add(distanceBH);
        transportListB.add(distanceBI);
        transportListB.add(distanceBJ);
        City cityB = new City("B", 45, transportListB);
        System.out.println(cityB);

        List<Transport> transportListC = new ArrayList<>();
        transportListC.add(distanceAC);
        transportListC.add(distanceBC);
        transportListC.add(distanceCD);
        transportListC.add(distanceCE);
        transportListC.add(distanceCF);
        transportListC.add(distanceCG);
        transportListC.add(distanceCH);
        transportListC.add(distanceCI);
        transportListC.add(distanceCJ);
        City cityC = new City("C",3, transportListC);
        System.out.println(cityC);

        List<Transport> transportListD = new ArrayList<>();
        transportListD.add(distanceBD);
        transportListD.add(distanceAD);
        transportListD.add(distanceCD);
        transportListD.add(distanceDE);
        transportListD.add(distanceDF);
        transportListD.add(distanceDG);
        transportListD.add(distanceDH);
        transportListD.add(distanceDI);
        transportListD.add(distanceDJ);
        City cityD = new City("D",7, transportListD);
        System.out.println(cityD);

        List<Transport> transportListE = new ArrayList<>();
        transportListE.add(distanceAE);
        transportListE.add(distanceBE);
        transportListE.add(distanceCE);
        transportListE.add(distanceDE);
        transportListE.add(distanceEF);
        transportListE.add(distanceEG);
        transportListE.add(distanceEH);
        transportListE.add(distanceEI);
        transportListE.add(distanceEJ);
        City cityE = new City("E",2, transportListE);
        System.out.println(cityE);

        List<Transport> transportListF = new ArrayList<>();
        transportListF.add(distanceAF);
        transportListF.add(distanceBF);
        transportListF.add(distanceCF);
        transportListF.add(distanceDF);
        transportListF.add(distanceEF);
        transportListF.add(distanceFG);
        transportListF.add(distanceFH);
        transportListF.add(distanceFI);
        transportListF.add(distanceFJ);
        City cityF = new City("F",13, transportListF);
        System.out.println(cityF);

        List<Transport> transportListG = new ArrayList<>();
        transportListG.add(distanceAG);
        transportListG.add(distanceBG);
        transportListG.add(distanceCG);
        transportListG.add(distanceDG);
        transportListG.add(distanceEG);
        transportListG.add(distanceFG);
        transportListG.add(distanceGH);
        transportListG.add(distanceGI);
        transportListG.add(distanceGJ);
        City cityG = new City("G",1, transportListG);
        System.out.println(cityG);

        List<Transport> transportListH = new ArrayList<>();
        transportListH.add(distanceAH);
        transportListH.add(distanceBH);
        transportListH.add(distanceCH);
        transportListH.add(distanceDH);
        transportListH.add(distanceEH);
        transportListH.add(distanceFH);
        transportListH.add(distanceGH);
        transportListH.add(distanceHI);
        transportListH.add(distanceHJ);
        City cityH = new City("H",6, transportListH);
        System.out.println(cityH);

        List<Transport> transportListI = new ArrayList<>();
        transportListI.add(distanceAI);
        transportListI.add(distanceBI);
        transportListI.add(distanceCI);
        transportListI.add(distanceDI);
        transportListI.add(distanceEI);
        transportListI.add(distanceFI);
        transportListI.add(distanceGI);
        transportListI.add(distanceHI);
        transportListI.add(distanceIJ);
        City cityI = new City("I",6, transportListI);
        System.out.println(cityI);

        List<Transport> transportListJ = new ArrayList<>();
        transportListJ.add(distanceAJ);
        transportListJ.add(distanceBJ);
        transportListJ.add(distanceCJ);
        transportListJ.add(distanceDJ);
        transportListJ.add(distanceEJ);
        transportListJ.add(distanceFJ);
        transportListJ.add(distanceGJ);
        transportListJ.add(distanceHJ);
        transportListJ.add(distanceIJ);
        City cityJ = new City("J",6, transportListJ);
        System.out.println(cityJ);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pierwszego Miasta:");
        String firstNameCity= scan.nextLine();
        System.out.println("Wprowadzono " + firstNameCity);

        System.out.println("Podaj nazwę drugiego Miasta:");
        String nextNameCity= scan.nextLine();
        System.out.println("Wprowadzono " + nextNameCity);

        List<City> cityList = new ArrayList<>();
        cityList.add(cityA);
        cityList.add(cityB);
        cityList.add(cityC);
        cityList.add(cityD);
        cityList.add(cityE);
        cityList.add(cityF);
        cityList.add(cityG);
        cityList.add(cityH);
        cityList.add(cityI);
        cityList.add(cityJ);
        City firstCity = new City();
        for(City tmp: cityList){
            if (tmp.getName().equals(firstNameCity)) firstCity = tmp;


        }
  System.out.println("Wybrales miasto pierwsze: " + firstCity);
        City nextCity = new City();
        for(City tmp: cityList){
            if (tmp.getName().equals(nextNameCity)) nextCity = tmp;


        }
        System.out.println("Wybrales miast drugie: " + nextCity);
    }
    Tu sie dodaje algorytm drzewa :)
}
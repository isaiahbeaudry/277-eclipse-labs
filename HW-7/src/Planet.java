import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

/**
 * 
 * @author Connor Koch, Isaiah Beaudry, Vraj Dalsania, and Dimpal Shah
 * Planet.java creates the planets size and then adds the terra objects to an array list
 *
 */
public class Planet {
	
  int impactScore;
	int NumTerraObjects;
	String planetName;
	ArrayList<TerraObject> Planet = new ArrayList<TerraObject>();
	String TerraObjects;
	String WaterObjects = "";
	String PlantObjects = "";
	String MineralObjects = "";
	String AnimalObjects = "";
	double waterDist;
	double plantDist;
	double mineralDist;
	double animalDist;
  double water;
	double plant;
	double mineral;
	double animal;
	
	
	/**
	 * Default constructor to create size of the planet
	 */
	public Planet() {
    Scanner name = new Scanner(System.in);
		System.out.println("Welcome to the Terraforming Program!\nEnter the name of your new planet: ");
		planetName = name.nextLine();
		System.out.println("Planet name is: " + planetName + "\n");
		Boolean b = true;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Which size planet do you want?\n1) small,\n2) medium,\n3) large,\n4) extra large");
	    int size = myObj.nextInt();
		Random r = new Random();
		while (b) {

			if (size == 1) {
				System.out.println("1 - small");
				NumTerraObjects = r.nextInt((500 - 200) + 1) + 200;
				b = false;
			}
			else if (size == 2) {
				System.out.println("2 - medium");
				NumTerraObjects = r.nextInt((1000 - 501) + 1) + 501;
				b = false;
			}
			else if (size == 3) {
				System.out.println("3 - large");
				NumTerraObjects = r.nextInt((1500 - 1001) + 1) + 1001;
				b = false;
			}
			else if (size == 4) {
				System.out.println("4 - extra large");
				NumTerraObjects = r.nextInt((Integer.MAX_VALUE - 1501) + 1) + 1501;
				b = false;
			}
			else {
				myObj = new Scanner(System.in);
				System.out.println("Which size planet do you want?\n1) small,\n2) medium,\n3) large,\n4) extra large");
				size = myObj.nextInt();
			}
			//System.out.println("inside" + NumTerraObjects);
		}
    System.out.println("How do you want to distribute the categories (use percentage):");
    // setting up the category distributions
    water = percentageDistribution("water", 100.0);
		double waterPerc = 100.0 - water;
		plant = percentageDistribution("plant", waterPerc);
		double plantPerc = waterPerc - plant;
		mineral = percentageDistribution("mineral", plantPerc);
		double mineralPerc = plantPerc - mineral;
		animal = percentageDistribution("animal", mineralPerc);
		double animalPerc = mineralPerc - animal;
		
		waterCD(NumTerraObjects, water);
		waterObjs(waterDist);
		plantCD(NumTerraObjects, plant);
		plantObjs(plantDist);
		mineralCD(NumTerraObjects, mineral);
		mineralObjs(mineralDist);
		animalCD(NumTerraObjects, animal);
		animalObjs(animalDist);
		menu();
	}
	
	/**
	 * 
	 * @return impactScore
	 * return int impactScore
	 */
	public int getImpactScore() {
    impactScore = 0;
    for(TerraObject to : Planet)
      impactScore += to.getImpactScore();
		return impactScore;
	}
	
	public int getNumTerraObjects() {
		return NumTerraObjects;
	}
	/**
	 * 
	 * @return WaterObjects
	 * return String WaterObjects
	 */
	public String getWaterObjects() {
		for(TerraObject to : Planet)
			if ((to.getCategory().equals(new River().getCategory())) || (to.getCategory().equals(new Lake().getCategory())) ||
					(to.getCategory().equals(new Pond().getCategory())) || (to.getCategory().equals(new Ocean().getCategory()))) {
				WaterObjects = WaterObjects + to + "\n";
			}
		return WaterObjects;
	}
	/**
	 * 
	 * @return PlantObjects
	 * return String PlantObjects
	 */
	public String getPlantObjects() {
		for(TerraObject to : Planet)
			if ((to.getCategory().equals(new Flower().getCategory())) || (to.getCategory().equals(new Grass().getCategory())) ||
					(to.getCategory().equals(new PalmTree().getCategory())) || (to.getCategory().equals(new Weeds().getCategory()))) {
				PlantObjects = PlantObjects + to + "\n";
			}
		return PlantObjects;
	}
	/**
	 * 
	 * @return MineralObjects
	 * return String MineralObjects
	 */
	public String getMineralObjects() {
		for(TerraObject to : Planet)
			if ((to.getCategory().equals(new Coal().getCategory())) || (to.getCategory().equals(new Diamond().getCategory())) ||
					(to.getCategory().equals(new Gold().getCategory())) || (to.getCategory().equals(new Iron().getCategory()))) {
				MineralObjects = MineralObjects + to + "\n";
			}
		return MineralObjects;
	}
	/**
	 * 
	 * @return AnimalObjects
	 * return String AnimalObjects
	 */
	public String getAnimalObjects() {
		for(TerraObject to : Planet)
			if ((to.getCategory().equals(new Bear().getCategory())) || (to.getCategory().equals(new Dog().getCategory())) ||
					(to.getCategory().equals(new Monkey().getCategory())) || (to.getCategory().equals(new Tiger().getCategory()))) {
				AnimalObjects = AnimalObjects + to + "\n";
			}
		return AnimalObjects;
	}
  /**
	 * 
	 * @return planetName
	 * return String planetName
	 */
	public String getPlanetName() {
		return planetName;
	}
  /**
  *
  * @param to
  * adds a TerraObject to an arrayList to create a planet
  */
	public void addPlanet(TerraObject to) {
    Planet.add(to);
	}
	
	public double waterCD(int num, double wPerc) {
		waterDist = num * (wPerc / 100);
		return waterDist;
	}
	
	public double plantCD(int num, double pPerc) {
		plantDist = num * (pPerc / 100);
		return plantDist;
	}
	
	public double mineralCD(int num, double mPerc) {
		mineralDist = num * (mPerc / 100);
		return mineralDist;
	}
	
	public double animalCD(int num, double aPerc) {
		animalDist = num * (aPerc / 100);
		return animalDist;
	}
	
	
	double waterObjDist;
	WaterObject terraObj = new WaterObject();
	River rImpact = new River();
	Lake lImpact = new Lake();
	Ocean oImpact = new Ocean();
	Pond pImpact = new Pond();
	TerraObject tO1;
	/**
	 * Instantiating the water object concrete classes
	 * @param wDist
	 */
	public void waterObjs(double wDist) {
		waterObjDist = Math.floor(wDist/4);
		while (waterObjDist > 0) {
			tO1 = (terraObj.getObject("River"));
			addPlanet(tO1);
			impactScore += rImpact.getObjImpScore();
			waterObjDist -= 1;
		}
		waterObjDist = Math.floor(wDist/4);
		while (waterObjDist > 0) {
			tO1 = (terraObj.getObject("Lake"));
			addPlanet(tO1);
			impactScore += lImpact.getObjImpScore();
			waterObjDist -= 1;
		}
		waterObjDist = Math.floor(wDist/4);
		while (waterObjDist > 0) {
			tO1 = (terraObj.getObject("Ocean"));
			addPlanet(tO1);
			impactScore += oImpact.getObjImpScore();
			waterObjDist -= 1;
		}
		waterObjDist = Math.floor(wDist/4);
		while (waterObjDist > 0) {
			tO1 = (terraObj.getObject("Pond"));
			addPlanet(tO1);
			impactScore += pImpact.getObjImpScore();
			waterObjDist -= 1;
		}
	}
	
	double plantObjDist;
	PlantObject terraObj2 = new PlantObject();
	Flower fImpact = new Flower();
	Grass gImpact = new Grass();
	PalmTree ptImpact = new PalmTree();
	Weeds wImpact = new Weeds();
	TerraObject tO2;
	/**
	 * Instantiating the plant object concrete classes
	 * @param pDist
	 */
	public void plantObjs(double pDist) {
		plantObjDist = Math.floor(pDist/4);
		while (plantObjDist > 0) {
			tO2 = (terraObj2.getObject("Flower"));
			addPlanet(tO2);
			impactScore += fImpact.getObjImpScore();
			plantObjDist -= 1;
		}
		plantObjDist = Math.floor(pDist/4);
		while (plantObjDist > 0) {
			tO2 = (terraObj2.getObject("Grass"));
			addPlanet(tO2);
			impactScore += gImpact.getObjImpScore();
			plantObjDist -= 1;
		}
		plantObjDist = Math.floor(pDist/4);
		while (plantObjDist > 0) {
			tO2 = (terraObj2.getObject("PalmTree"));
			addPlanet(tO2);
			impactScore += ptImpact.getObjImpScore();
			plantObjDist -= 1;
		}
		plantObjDist = Math.floor(pDist/4);
		while (plantObjDist > 0) {
			tO2 = (terraObj2.getObject("Weeds"));
			addPlanet(tO2);
			impactScore += wImpact.getObjImpScore();
			plantObjDist -= 1;
		}
	}
	
	double mineralObjDist;
	MineralObject terraObj3 = new MineralObject();
	Coal cImpact = new Coal();
	Diamond dImpact = new Diamond();
	Gold goImpact = new Gold();
	Iron iImpact = new Iron();
	TerraObject tO3;
	/**
	 * Instantiating the mineral object concrete classes
	 * @param mDist
	 */
	public void mineralObjs(double mDist) {
		mineralObjDist = Math.floor(mDist/4);
		while (mineralObjDist > 0) {
			tO3 = (terraObj3.getObject("Coal"));
			addPlanet(tO3);
			impactScore += cImpact.getObjImpScore();
			mineralObjDist -= 1;
		}
		mineralObjDist = Math.floor(mDist/4);
		while (mineralObjDist > 0) {
			tO3 = (terraObj3.getObject("Diamond"));
			addPlanet(tO3);
			impactScore += dImpact.getObjImpScore();
			mineralObjDist -= 1;
		}
		mineralObjDist = Math.floor(mDist/4);
		while (mineralObjDist > 0) {
			tO3 = (terraObj3.getObject("Gold"));
			addPlanet(tO3);
			impactScore += goImpact.getObjImpScore();
			mineralObjDist -= 1;
		}
		mineralObjDist = Math.floor(mDist/4);
		while (mineralObjDist > 0) {
			tO3 = (terraObj3.getObject("Iron"));
			addPlanet(tO3);
			impactScore += iImpact.getObjImpScore();
			mineralObjDist -= 1;
		}
	}
	
	double animalObjDist;
	AnimalObject terraObj4 = new AnimalObject();
	Dog doImpact = new Dog();
	Bear bImpact = new Bear();
	Monkey mImpact = new Monkey();
	Tiger tImpact = new Tiger();
	TerraObject tO4;
	/**\Instantiating the animal object concrete classes
	 * @param aDist
	 */
	public void animalObjs(double aDist) {
		animalObjDist = Math.floor(aDist/4);
		while (animalObjDist > 0) {
			tO4 = (terraObj4.getObject("Dog"));
			addPlanet(tO4);
			impactScore += doImpact.getObjImpScore();
			animalObjDist -= 1;
		}
		animalObjDist = Math.floor(aDist/4);
		while (animalObjDist > 0) {
			tO4 = (terraObj4.getObject("Bear"));
			addPlanet(tO4);
			impactScore += bImpact.getObjImpScore();
			animalObjDist -= 1;
		}
		animalObjDist = Math.floor(aDist/4);
		while (animalObjDist > 0) {
			tO4 = (terraObj4.getObject("Monkey"));
			addPlanet(tO4);
			impactScore += mImpact.getObjImpScore();
			animalObjDist -= 1;
		}
		animalObjDist = Math.floor(aDist/4);
		while (animalObjDist > 0) {
			tO4 = (terraObj4.getObject("Tiger"));
			addPlanet(tO4);
			impactScore += tImpact.getObjImpScore();
			animalObjDist -= 1;
		}
	}
	
  /**
	 * 
	 * @param type
	 * @param percentage
	 * @return percentage remaining
	 */
	
  public double percentageDistribution(String type, double percentage) {
		System.out.println("Percentage remaining:" + percentage);
		Scanner p = new Scanner(System.in);
		System.out.println("\tEnter " + type + " percentage:");
		double percentUsed = p.nextDouble();
		while(percentUsed > percentage) {
			System.out.println("That's too high!");
			System.out.println("Percentage remaining:" + percentage);
			System.out.println("\tEnter " + type + " percentage:");
			percentUsed = p.nextDouble();
		}
		return percentUsed;	
	}
  /**
	 * 
	 * Method to print out different types of TerraObjects
	 */
	public void menu() {
		Boolean t = true;
		while(t) {
			System.out.println("Planet name: " + getPlanetName() + ", TerraObjects: " + getNumTerraObjects() + ", Impact Score: " + getImpactScore());
			Scanner option = new Scanner(System.in);
			System.out.println("1)\tList all water objects\n2)\tList all plant objects\n3)\tList all mineral objects"
					+ "\n4)\tList all animal objects\n5)\tExit program");
			int userInput = option.nextInt();
			if (userInput == 1) {
				System.out.println(getWaterObjects());
			}
			else if(userInput == 2) {
				System.out.println(getPlantObjects());
			}
			else if(userInput == 3) {
				System.out.println(getMineralObjects());
			}
			else if(userInput == 4) {
				System.out.println(getAnimalObjects());
			}
			else if(userInput == 5) {
				System.out.println("You have exited the Terraforming program!");
				t = false;
			}
		}
	}
  /**
	 * 
	 * @return all TerraObjects associated with a planet
	 */
  public String toString() {
		for(TerraObject to : Planet)
			TerraObjects = TerraObjects + to + "\n";
		return TerraObjects;
	}
		

}
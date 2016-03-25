/**
 * 
 */

/**
 * @author martin
 *
 */
public class Slot {

	/**
	 * @param args
	 */
	
	String name;
	int sets;
	int reps;
	int vikt;
	double generalFatigueFactor;
	//int[] Slot;
	
	public int getReps(){
		return reps;
	}
	public String getName(){
		return name;
	}
	public void setsets(int incomingSets){
		sets = incomingSets;
	}
	public double getGFT(){
		//Returnerar generalFatigueFactor som är en variabel som jag tänker mig 
		//ska användas för att mäta hur trött man blir av en övning
		return generalFatigueFactor;
	}
		
	//Detta är constructorn
	public Slot(String constructorName, int constructorSets, int constructorReps){
		
		name = constructorName;
		sets = constructorSets;
		reps = constructorReps;
		
		if (name=="marklyft"){
			generalFatigueFactor = 1.2;
		}
		else {
			if (name=="backSquat"){
				generalFatigueFactor = 1;
				}
			else {
				if (name=="benchPress"){
					generalFatigueFactor = 0.9;
				}
				else 
					System.out.println("Unknown exercise!");
				}
			}
	}
	
	
	 /*	Detta är main-metoden: Detta är i praktiken där programmet börjar köras.
	 /	Så i denna åkallas konstruktorn, och konstruktorn i sin tur printar
	 /	Variablerna
	 * 
	 */
//	public static void main(String[] args) {
//		
//		
//		Slot[] slotList = new Slot[19]; //En Slot-array som heter slotList = en Slot-array med längden 1
//		int heavyReps = 3;
//		int laterSets = 5;
//		
//		for (int i=1; i<19; i++){
//			
//			if((i%2)==0){
//				if (heavyReps<=6){
//					slotList[i-1] = new Slot("marklyft", 6, heavyReps); //Här skapas 6x3-6x6
//					heavyReps++;
//				}
//					else{
//						
//						slotList[i-1] = new Slot("marklyft", laterSets, laterSets); //Här skapas 5x5-1x1
//						laterSets--;
//					}
//			}
//				else{
//					slotList[i-1] = new Slot("marklyft", 6, 2); // här skapas 6x2-passen
//				}
//			//System.out.println(name + ": " + sets + "x" + reps+ " ");	
//		}
//		System.out.println(slotList[3].sets +"x"+ slotList[3].reps);
//		
//		//slotList[0] = new Slot("marklyft", 6, 2);
//		//slotList[0].setsets(3);
//		
//	}
	

}

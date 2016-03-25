
public class Pass {

	/**
	 * @param args
	 */
	String name;
	int sets;
	int reps;
	int vikt;
	
	public static void main(String[] args) {
		Slot[] slotList = new Slot[19]; //En Slot-array som heter slotList = en Slot-array med längden 19
//		Slot mySlot = new Slot("marklyft", 6, 2);
//		System.out.println(mySlot);
		
		int heavyReps = 3;
		int laterSets = 5;
		
		for (int i=1; i<19; i++){
			
			if((i%2)==0){
				if (heavyReps<=6){
					slotList[i-1] = new Slot("marklyft", 6, heavyReps); //Här skapas 6x3-6x6
					heavyReps++;
				}
					else{
						
						slotList[i-1] = new Slot("marklyft", laterSets, laterSets); //Här skapas 5x5-1x1
						laterSets--;
					}
			}
				else{
					slotList[i-1] = new Slot("marklyft", 6, 2); // här skapas 6x2-passen
				}
		}
		System.out.println(slotList[3].sets +"x"+ slotList[3].reps + slotList[3].generalFatigueFactor);
		//slotList[0] = new Slot("marklyft", 6, 2);
		//slotList[0].setsets(3);

	}

}

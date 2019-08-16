public class Euclidean {
  public static int extendedAlgorithm(int a, int b) {
    
	int i =2;
	int leftover=0;
	int firstONE = 0;
	int firstTWO =1;
	int firstcur=0;
	int tfirst=1;
	int sec=0;
	int tcur=0;
	
	//while runs until remainder = 1 lowest common factor
	while (leftover != 1){
		int q = a /b;
		leftover = a % b;
		firstcur = firstTWO - (q*firstONE);
		tcur = sec - (q*tfirst);
		
		firstTWO = firstONE;
		firstONE = firstcur;
		
		sec = tfirst;
		tfirst = tcur;
		
		a = b;
		b= leftover;
		i++;
	}
	if (firstcur > tcur){
		return firstcur;
	}
		else{
			return tcur;
		}
	}
}	
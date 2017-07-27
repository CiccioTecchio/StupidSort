
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] array={5,2,7};
		int [] array={5,2,7,3,12,-2,2,10}; //for stress-test :D
		StupidSort ss=new StupidSort(array);
		ss.sort();
		//Commento
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}



import java.util.Random;
import java.util.logging.Logger;

public class StupidSort {

	private int [] array;
	private static Logger logger=Logger.getLogger("global");
	
	public StupidSort(int [] array){
		this.array=array;
	}
	
	public void sort(){
		randomize();
		int i=0;
		int len=array.length;
				  //j number of changes,
		//int j=0; remove the comment on this raw,on the raw 26 and on the raw 30 for show it
		while( (i<len-1) ){
			if((array[i]<=array[i+1])  ){
				i++;
			}
			else{
				randomize();
				i=0;
				//j++;
				
			}
		}	
		//logger.info(j+":CAMBIO");
	}
	
	
	public void randomize(){
		int app,r=0;
		int len=array.length;
		Random random = new Random();
		for(int i=0;i<len;i++){
			r=random.nextInt(len);
			app=array[r];
			array[r]=array[i];
			array[i]=app;
		}
		
	}
	
	
}
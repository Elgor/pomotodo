
public class SingletonClass {
	
	private static SingletonClass instance;
	
	private SingletonClass() {
	
	}
	
	public static SingletonClass getInstance(){
		
		if(instance == null){
			synchronized (SingletonClass.class) {
				if(instance == null){
					instance = new SingletonClass();
				}
			}
			
		}
		
		return instance;
	}
	
	
}

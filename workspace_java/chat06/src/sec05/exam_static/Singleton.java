package sec05.exam_static;

public class Singleton {
		
//		Singleton singleton = null;
		private static Singleton singleton = null;
		
		private Singleton() {
			
		}
		
//		Singleton getInstance() {
		static	Singleton getInstance() { 
			if(singleton == null) {
				singleton = new Singleton();
			}
			return singleton;
		}
}

package Classloaders;

public class InitClassloaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Obtient le ClassLoader de la classe actuelle (ClassLoader par défaut)
		ClassLoader classLoader = InitClassloaders.class.getClassLoader();
		
		try {
			//Charge la classe "MyClassToLoad"
			Class<?> myClass = classLoader.loadClass("classloaders.MyClassToLoad");
			
			// Crée une instance de la classe chargée
			Object myObject = myClass.newInstance();
			
			//Utilise la classe chargée
			if (myObject instanceof MyclassToLoad) {
				MyclassToLoad instance = (MyclassToLoad) myObject;
				instance.sayHello();
			}else {
				System.err.println("La classe chargée n'est pas une instance de MyclassToLoad");
			}
		} catch (ClassNotFoundException e) {
			System.err.println("La classe spécifiée n'a pas été trouvée.");
		} catch (InstantiationException e) {
			// TODO: handle exception
			System.err.println("Impossible de creer une instance MyClassToLoad);
		}
		
		//END CLASS
	}

}

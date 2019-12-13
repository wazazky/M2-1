

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Jugador implements java.io.Serializable{

	public static int tam=5;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2128200458112401415L;
	public String nombre;
	public int  puntaje;
	public boolean ocupado;
	
	
	
	public Jugador(String nombre, int puntaje) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.ocupado=true;
	}
	public Jugador(int puntaje) {
		this.nombre = Wcore.leer();
		this.puntaje = puntaje;
		this.ocupado=true;
	}
	
	public Jugador(){
		this.nombre="Nombre "+Wcore.convierteInt(Wcore.rng(100));
		this.puntaje=Wcore.rng(100);
		this.ocupado=true;
		
	}
	
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntaje=" + puntaje + ", ocupado=" + ocupado + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {	
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public static boolean cmp(Jugador listas) {
		if (listas.isOcupado())
			return listas.isOcupado();
		else 
		  return false;
	}
	
	 public static	String Grabar(Jugador[] listas){
		 
		   try {
				ObjectOutputStream salida=new
				ObjectOutputStream(new FileOutputStream("src/Lista.obj"));
				 salida.writeObject(listas);
			      salida.close();
			   System.out.println(" se guardo correctamente archivo");
			   return "Se guardo correctamente";
			} catch (IOException e) {
			   System.out.println("No se guardo correctamente archivo");

				e.printStackTrace();
				return "No Se guardo correctamente";
			} 
	 }
	
	 
	 
	 
	 public static String Leer(Jugador[] listas) throws ClassNotFoundException{

		 try {
				ObjectInputStream entrada=new 
				 ObjectInputStream(new FileInputStream("src/Lista.obj"));
			 Jugador[] 	listas1=(Jugador[])entrada.readObject();
			 for(int x=0;x<tam;x++){
				 listas[x]=listas1[x];
			 }
				//Mostrar(listas);
			    entrada.close();
			 System.out.println(" se encontro archivo");
			return "se encontro archivo";

			} catch (IOException e) {
								e.printStackTrace();
			 System.out.println("No se encontro archivo");
			return "No se encontro archivo";

			}

	 }
    
	 public static void Mostrar(Jugador[] listas) throws IOException {

         try {
             for (int x = 0; x < tam; x++) {
                 System.out.println(listas[x].toString());
             }
         } catch (Exception e) {
             System.out.println("no hay valores en la lista");
         }
     }

         public static String MostrarToString(Jugador[] listas) throws IOException {
             String txt="";
             try {
                 for (int x = 0; x <tam; x++) {
                    txt=(txt+listas[x].toString()+"\n");
                 }
             } catch (Exception e) {

             	System.out.println("no hay valores en la lista");
             	return "no hay valores en la lista";
             }

             return txt;
         }

	 public static String GLR(Jugador[] listas) {// generar lista random

		 for(int x=0;x<tam;x++)
			{
				listas[x]=new Jugador();	
			}
		 System.out.println("Nueva lista gnerada");
		return"Nueva Lista Generada";
		 
	 }
	 
	 public static void main(String[] args) throws ClassNotFoundException, IOException {
    Jugador[] listas = new Jugador[tam];
		String eleccion;
    	/*int x=0;
    do{
		System.out.println("1) Generar nueva lista de valores");
		System.out.println("2) Guardar Lista");
		System.out.println("3) Leer Lista ");
		System.out.println("4) Mostrar Lista");
		System.out.println("5) Salir");
		System.out.print("Eleccion ");
		eleccion =Wcore.leer();
		x=Wcore.conviertecadenaI(eleccion);

		if (x==1){

			x=0;
		}
		if (x==2){
			Grabar(listas);
			x=0;
		}
		if (x==3){

			x=0;
		}
		if (x==4){

			x=0;
		}
	}while(x<5);
 //  listas=GLR();
   // Grabar(listas);
   // listas=Leer();




*/
}
}

package Informacion;


import java.io.*;
import java.util.ArrayList;

public class listaCervezas {

	private static ArrayList<Cerveza> lista;
	public listaCervezas()
	{
		lista=new ArrayList<Cerveza>();		
	}
	
	private File[] listaArchivos()
	{
		//Lista los archivos en el directorio
		String ruta="C:\\Users\\Lea\\Desktop\\Archivos";
		File directorio=new File(ruta);
		
		File[] files = directorio.listFiles(new FilenameFilter() {
		    public boolean accept(File directorio, String name) {
		        return name.toLowerCase().endsWith(".txt");
		    }
		});
		
		return files;
		//return directorio.listFiles();		
	}
	
	public void cargarCervezas()
	{
		//Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
		
	
		for(File archivo: listaArchivos())
		{
			//Creo la cerveza y llamo al metodo que inicializa los datos de la misma
			Cerveza cerv=null;
			CargarDatosCerv(archivo,cerv);
			
			//Agrego cerveza al final de la lista de cervezas
			lista.add(cerv);
			
		}
	}
	
	private void CargarDatosCerv(File archivo, Cerveza cerv)
	//Carga los datos de cada cerveza proveniente de los archivos. Cada cerveza tiene su archivo.
	{
		
		try
		{
			cerv=new Cerveza();
			String linea="";
			cerv.setNombre(obtenerNombreCerv(archivo));
			BufferedReader buffer = new BufferedReader(new FileReader(archivo.toString()));
			linea=buffer.readLine();
			cerv.setDireccion(linea);
			linea=buffer.readLine();
			cerv.setMejorVariedad(linea);
			linea=buffer.readLine();
			cerv.setDesc(linea);
			linea=buffer.readLine();
			cerv.setPuntaje(Integer.parseInt(linea));
			
			buffer.close();
			
		}
		catch(Exception e) {}	
	}
	
	private String obtenerNombreCerv(File archivo)
	{
		//Obtiene el nombre del archivo sin extension para asignarlo a la cerveza
		String nombre,temp;
		int i=0;
		nombre="";
		temp=archivo.getName();
		while((temp.charAt(i)!='.'))
		{
			nombre+=temp.charAt(i);
		}
		return nombre;	
	}
}


package Informacion;


import java.io.*;
import java.util.ArrayList;
import org.apache.struts2.ServletActionContext;

public class listaCervezas {

	private ArrayList<Cerveza> lista;
	private Cerveza cerv;

	public listaCervezas()
	{
		lista=new ArrayList<Cerveza>();	
		cerv=null;
		cargarCervezas();
	}
	
	public File[] listaArchivos()
	{
		//Lista los archivos .txt en el directorio indicado
		String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/WEB-INF/files/Archivos");
		File directorio=new File(ruta);
		File[] files=directorio.listFiles(new FilenameFilter() {
		    public boolean accept(File directorio, String name) {
		        return name.toLowerCase().endsWith(".txt");
		    }
		});
		return files;		
	}
	
	public void cargarCervezas()
	{
		//Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
		for(File archivo: listaArchivos())
		{
			//Creo la cerveza y llamo al metodo que inicializa los datos de la misma
			CargarDatosCerv(archivo);
			CargarImagenCerv(archivo);
			//Agrego cerveza al final de la lista de cervezas
			lista.add(cerv);
		}
	}
	
	private void CargarImagenCerv(File archivo)
	{
		try
		{
			String rutaImagen="img/";
			int i=archivo.getName().length();
			for(int j=0;j<(i-3);j++)
			{
				rutaImagen+=archivo.getName().charAt(j);
			}
			rutaImagen+="jpg";
			//controlar que este el archivo, sino cargar imagen predeterminada
			String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/");
			File af = new File(ruta+rutaImagen);
			if (!af.exists()) { 
				rutaImagen="img/not found.jpg";
			}
			cerv.setImagen(rutaImagen);
		}
		catch(Exception e) {}
		
	}
	
	private void CargarDatosCerv(File archivo)
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
			i++;
		}
		return nombre;	
	}
	
	public ArrayList<Cerveza> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cerveza> lista) {
		this.lista = lista;
	}

	public Cerveza buscarCerveza(String nombreCerveceria) {
		//Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
		Cerveza x=null;
		int i=0;
		while(!lista.isEmpty() && x==null) {
			if(lista.get(i).getNombre().equals(nombreCerveceria))
				x=lista.get(i);
			else
				i++;
		}
		return x;
	}
}


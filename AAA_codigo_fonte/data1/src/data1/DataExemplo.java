package data1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class DataExemplo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6340651415290115420L;
	private static long autoIncremento;
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	/**
	 * @return the autoIncremento
	 */
	public static long getAutoIncremento() {
		return autoIncremento;
	}

	/**
	 * @param autoIncremento the autoIncremento to set
	 */
	public static void setAutoIncremento(long autoIncremento) {
		DataExemplo.autoIncremento = autoIncremento;
	}

	
	private Long codigo;
	private Date data;

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}	




	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DataExemplo)) {
			return false;
		}
		DataExemplo other = (DataExemplo) obj;
		return Objects.equals(codigo, other.codigo);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[codigo=" + codigo + "]";
	}



	public DataExemplo() {
		super();
		DataExemplo.autoIncremento++;
		Locale.setDefault(new Locale("pt","br"));
		this.setCodigo(DataExemplo.autoIncremento);
		try {
			setData(DataExemplo.sdf1.parse("31/01/1980"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public DataExemplo(Long codigo) {
		this();
		if (this.codigo < codigo) {
			this.codigo = codigo;
		}		
		this.data = new Date();
	}



	public static void main(String[] args) {
		
		DataExemplo dt = new DataExemplo();
		System.out.println(dt.toString());
		System.out.println(DataExemplo.sdf1.format(dt.getData()));
		DataExemplo dt1 = new DataExemplo(1l);
		System.out.println(dt1.toString());
		System.out.println(DataExemplo.sdf1.format(dt1.getData()));

	}



}

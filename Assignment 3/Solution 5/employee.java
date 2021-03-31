
public class employee {
	int id;
	String name;
	@Override
	public int hashCode() {
		return 15;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Employee[Id="+id+", Name="+name+"]";
	}
}

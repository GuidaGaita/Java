package produto;



import java.util.ArrayList;
import java.util.List;


public class User {
	
	private String name;
	private String address;
	private String cpf;
	private String phone;
	public List <Product> listaProdutos;
	
	public User(String name, String address, String cpf, String phone) {
		
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.phone = phone;
		this.listaProdutos = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", cpf=" + cpf + ", phone=" + phone + ", listaProdutos="
				+ listaProdutos + "]";
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Product> getListaProdutos() {
		return listaProdutos;
	}
	public void modifyListaProdutos(List<Product> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
	public void addProduct(Product product){
        this.listaProdutos.add(product);
    }
	
	
	
	


}

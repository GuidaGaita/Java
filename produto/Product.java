package produto;



public class Product {

	
	    private String name;
		private String description;
		private String category;
		private double price;
			
		public Product(String name, String category, String description, double price) {
			this.name = name;
			this.category = category;
			this.description = description;
			this.price = price;
			
		}
		
		@Override
		public String toString() {
			return "Product [name=" + name + ", description=" + description + ", category=" + category + ", price="
					+ price + "]";
		}
	

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	}



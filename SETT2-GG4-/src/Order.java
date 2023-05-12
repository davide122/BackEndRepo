import java.util.List;

public class Order {
long id;
String status;
int localdate;
List<Product> Products;
String Customer;

public Order(long id, String status, int localdate, List<Product> products, String customer) {
	super();
	this.id = id;
	this.status = status;
	this.localdate = localdate;
	Products = products;
	Customer = customer;
}

@Override
public String toString() {
	return "Order [id=" + id + ", status=" + status + ", localdate=" + localdate + ", Products=" + Products
			+ ", Customer=" + Customer + "]";
}

}

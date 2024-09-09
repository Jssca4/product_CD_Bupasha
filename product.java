public class product {
//Object Class
int number;
String nama;
int quantity;
double price;

public product() {
    number = 0;
    nama = "";
    quantity = 0;
    price = 0;
}

public product(int number, String nama, int quantity, double price) {
    this.number = number;
    this.nama = nama;
    this.number = number;
    this.quantity = quantity;
    this.price = price;
}


public int getNumber() {
    return this.number;
}

public void setNumber(int number) {
    this.number = number;
}

public String getNama() {
    return this.nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public int getQuantity() {
    return this.quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public double getPrice() {
    return this.price;
}

public void setPrice(double price) {
    this.price = price;
}

}


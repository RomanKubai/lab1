package ua.lviv.iot.lab1;

public record perfume (int volume, float price, String producter,
		               String countryOfOrigin, String name, String color) {
	public static String shopNumber = "0961425872";
	
	public static String showShopNumber() {
		return shopNumber;
	}
	public perfume() {
		this(0, 0, "unknown", "unknown", "unknown", "unknown");
	}
	public perfume(int volume, float price, String producter) {
		this (volume, price, producter, "unknown", "unknown", "unknown" );
	}
	public perfume(int volume, float price, String producter,
            String countryOfOrigin, String name, String color) {
		this.volume = volume;
		this.price = price;
		this.producter = producter;
        this.countryOfOrigin = countryOfOrigin;
        this.name = name;
        this.color = color;
		}
	@Override
	public String toString() {
		return "Perfume : "
				+"Volume: " + volume + " ml, "
				+"Price: " + price + " grn, "
				+"Producter: " + producter +" "
				+"Country Of Origin: " + countryOfOrigin +" "
				+"Name: " + name + " "
				+"Color: " + color +".";
	}
	
}

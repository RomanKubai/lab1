package ua.lviv.iot.lab1;

public class Main {

	public static void main(String[] args) {
		perfume avon = new perfume(125, 800, "germany");
		System.out.println(avon);
		perfume oriflame = new perfume(200, 400, "oriflame", "turkey", "for victory", "red");
		System.out.println(oriflame);
	}

}

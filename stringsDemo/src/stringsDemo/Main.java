package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = " Merhaba nas�ls�n?";
//
//		System.out.println("Eleman say�s� : " + mesaj.length());
//		System.out.println("Be�inci eleman : " + mesaj.charAt(5));
//		System.out.println(mesaj.concat(" �yiyim ya sen"));
//
//		System.out.println(mesaj.startsWith("M"));
//		System.out.println(mesaj.endsWith("M"));
//
//		char[] karakterler = new char[7];
//		mesaj.getChars(0, 7, karakterler, 0);
//		System.out.println(karakterler);
//
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(5));
		System.out.println(mesaj.substring(5, 7));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}

}

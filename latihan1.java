public class latihan1{
	public static void main(String [] args){
		char hurufawal = 'a';
		System.out.print("Masukkan huruf awal nama anda : ");
		try{
			hurufawal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("salah menginput");
		}
		if (hurufawal == 'a'){
			System.out.println("apa namamu bang : ");
		}
		  
		else if (hurufawal == 'b'){
			System.out.println("apa namamu sis : ");
			
		}else if (hurufawal == 'c'){
			System.out.println("apa namamu ko : ");
			
		}else if (hurufawal == 'd'){
			System.out.println("apa namamu ce : ");
			
		}else if (hurufawal == 'e'){
			System.out.println("apa namamu ko : ");
			
		}else{
			System.out.println("aku tidak bisa menebak  ");
			
		}
	}
}
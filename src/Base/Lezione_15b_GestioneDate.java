package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Lezione_15b_GestioneDate {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now(); //Data odierna
		System.out.println(now);
		
		LocalDateTime now_c = LocalDateTime.now();
		
		LocalDateTime scadenza_c = LocalDateTime.of(2023, 10, 04, 12, 30); 
		
		LocalDate scadenza = LocalDate.of(2023, 10, 4);
		System.out.println(scadenza);
		
		//Comparare le date
		System.out.println(now.compareTo(scadenza));
		
		//Conoscere la diffenza in giorni tra due date
		long dif_gg = ChronoUnit.DAYS.between(now, scadenza); //Data inizio, data fine
		long dif_ore = ChronoUnit.HOURS.between(now_c, scadenza_c);
		System.out.println(dif_ore);

	}

}

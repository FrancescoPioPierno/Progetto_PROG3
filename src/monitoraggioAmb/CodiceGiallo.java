package monitoraggioAmb;

/**
 * Seconda implementazione dell'interfaccia Strategy. Questa classe andr� a definire la seconda strategia da adottare se verificata una determinata
 * condizione.
 * 
 * @author Pierno Francesco Pio
 *
 */


public class CodiceGiallo implements Strategy{
	/*/
	 * @param n passo la stringa codice.
	 * @return String Mi restituir� il codice "Giallo".
	 */
	
	
	@Override
	public String getCode(String code)
	{
		return "Giallo";
	}
}

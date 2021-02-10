package monitoraggioAmb;
/**
 * Creazione della classe Context che invocher� la classe Strategy. Questa classe ha lo scopo di andar ad implementare/inizializzare la strategia da adottare, definita 
 * dall'interfaccia Strategy e dalle sue tre implementazioni.
 * 
 * 
 * @author Pierno Francesco Pio
 *
 */


public class Context {
	
	/**
	 * Dichiarazione della variabile privata Strategy.
	 */
	private Strategy strategy;
	
	/**
	 * Costruttore context che inizializzer� lo Strategy.
	 * @param strategy il costruttore prender� in input l'interfaccia Strategy.
	 */
	
	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	/**
	 * Il metodo executeStrategy() avr� lo scopo di decidere quale strategia andar ad adottare.
	 * 
	 * 
	 * @return Strategy
	 */
	public String executeStrategy()
	{
		return this.strategy.getCode("Codice");
	}

}

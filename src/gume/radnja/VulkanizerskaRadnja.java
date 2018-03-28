package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * @author Mila Dikic
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista guma dostupnih u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	
	/**
	 * Dodaje novu gumu u ponudu vulkanizerske radnje
	 * @param a nova guma koja se dodaje u radnju
	 * @throws java.lang.NullPointerException ako je uneta guma null 
	 * @throws java.lang.RuntimeException ako se u radnji vec nalazi ista takva guma
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	
	/**
	 * Pronalazi gumu u vulkanizerskoj radnji
	 * @param markaModel gume koja se trazi
	 * @return novaLista sa trazenim gumama datog modela
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
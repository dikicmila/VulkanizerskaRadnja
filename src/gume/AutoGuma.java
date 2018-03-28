package gume;

/**
 * @author Mila Dikic
 * @version 1.0
 */
public class AutoGuma {

	/**
	 * Naziv marke i modela guma
	 */
	private String markaModel = null;
	
	/**
	 * Atributi gume: precnik, sirina i visina, 
	 * inicijalno postavljeni na 0
	 */
	private int precnik = 0;
	private int sirina = 0;
	private int visina = 0;

	/**
	 * Vraca marku i model gume
	 * @return markaModel
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja marku i model
	 * @param markaModel 
	 * @throws java.lang.RuntimeException ako je 
	 * uneti string null ili duzine manje od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume
	 * @return precnik
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja precnik gume
	 * @param precnik 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta vrednost manja od 13 ili veca od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume
	 * @return sirina
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja sirinu gume
	 * @param sirina 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta vrednost za sirinu manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume
	 * @return visina
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja visinu gume
	 * @param visina 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta vrednost za visinu manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * vraca String sa svim podacima o gumi
	 * @return String sa svim podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dve gume iste, poredi prema svim atributima
	 * @return true ako su svi atributi obe gume isti, 
	 * a false u svim ostalim situacijama
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}

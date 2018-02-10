package modele;

/**
 * Interface � impl�menter par les diff�rents juge qui caract�rise chaque profil
 * @author Francois
 * @see JugeGaming, JugeBureautique
 */
public interface Juge {
	public void juger(Ordinateur o);
}

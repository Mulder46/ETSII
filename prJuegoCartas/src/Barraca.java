/**
 * Versión muy simplificada del juego bacarrá
 */
public class Bacarra {
	public static void main(String[] args) {
		Mazo b = new Mazo();
		ManoBacarra jugador = new ManoBacarra();
		ManoBacarra banca = new ManoBacarra();

		// Dos cartas para el jugador
		jugador.agnadeCarta(b.daCarta());
		jugador.agnadeCarta(b.daCarta());
		// Dos cartas para la banca
		banca.agnadeCarta(b.daCarta());
		banca.agnadeCarta(b.daCarta());

		if (jugador.esNatural()) {
			System.out.println("Ha ganado el jugador con una mano natural");
		} else if (banca.esNatural()) {
			System.out.println("Ha ganado la banca con una mano natural");
		} else {
			// El jugador juega
			if (!sePlantaJugador(jugador)) {
				System.out.println("El jugador pide una carta extra");
				jugador.agnadeCarta(b.daCarta());
			}
			// La banca juega
			if (!sePlantaBanca(banca, jugador)) {
				System.out.println("La banca pide una carta extra");
				banca.agnadeCarta(b.daCarta());
			}
			// Se cuentan los puntos y se decide el ganador
			double puntosJ = jugador.cuentaPuntos();
			double puntosB = banca.cuentaPuntos();
			if (puntosJ == puntosB) {
				System.out.println("Empate a " + puntosJ + " puntos: "
						+ jugador + " vs. " + banca);
			} else if (puntosJ > puntosB) {
				System.out.println("Gana el jugador con " + jugador + " ("
						+ puntosJ + " puntos) frente a " + banca + " ("
						+ puntosB + " puntos) de la banca");
			} else {
				System.out.println("Gana la banca con " + banca + " ("
						+ puntosB + " puntos) frente a " + jugador + " ("
						+ puntosJ + " puntos) del jugador");
			}
		}
	}

	/**
	 * Jugada del jugador. Este es bastante conservador, si tiene más de 5 se
	 * planta.
	 */
	private static boolean sePlantaJugador(ManoBacarra j) {
		return (j.cuentaPuntos() > 5);
	}

	/**
	 * Jugada de la banca. En el juego real debe seguir una estrategia fija
	 * distinta de esta.
	 */
	private static boolean sePlantaBanca(ManoBacarra b, ManoBacarra j) {
		double puntosJ = j.cuentaPuntos();
		double puntosB = b.cuentaPuntos();
		return !(puntosB < puntosJ && puntosB < 10);
	}
}
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import model.Corso;
import model.Docente;
import model.Indirizzo;
import model.NumeroTelefono;
import model.Persona;
import model.Studente;

import org.junit.Before;
import org.junit.Test;

public class PreliminaryTest {
	Corso corso1;
	Corso corso2;
	Docente docente1;
	Docente docente2;
	Docente docente3;
	Studente studente1;
	Studente studente2;
	
	@Before
	public void setUp() throws Exception {
		Indirizzo indirizzo1 = new Indirizzo(1, "citta 1", "via 1");
		Indirizzo indirizzo2 = new Indirizzo(2, "citta 2", "via 2");
		Indirizzo indirizzo3 = new Indirizzo(3, "citta 3", "via 3");
		Indirizzo indirizzo4 = new Indirizzo(4, "citta 4", "via 4");
		NumeroTelefono nt1 = new NumeroTelefono("+41", "91", "111111");
		NumeroTelefono nt2 = new NumeroTelefono("+41", "91", "222222");
		NumeroTelefono nt3 = new NumeroTelefono("+41", "91", "333333");
		NumeroTelefono nt4 = new NumeroTelefono("+41", "91", "444444");
		NumeroTelefono nt5 = new NumeroTelefono("+41", "91", "555555");
		NumeroTelefono nt6 = new NumeroTelefono("+41", "91", "666666");
		NumeroTelefono nt7 = new NumeroTelefono("+41", "91", "777777");
		corso1 = new Corso("nomeCorso1", "descrizioneCorso1");
		corso2 = new Corso("nomeCorso2", "descrizioneCorso2");
		docente1 = new Docente("nomeDocente1", "cognomeDocente1");
		docente1.setIndirizzo(indirizzo1);
		docente1.addNumeroTelefono(nt1);
		docente1.addNumeroTelefono(nt2);
		docente2 = new Docente("nomeDocente2", "cognomeDocente2");
		docente2.setIndirizzo(indirizzo2);
		docente2.addNumeroTelefono(nt3);
		docente3 = new Docente("nomeDocente3", "cognomeDocente3");
		docente3.setIndirizzo(indirizzo3);
		docente3.addNumeroTelefono(nt4);
		studente1 = new Studente("nomeStudente1", "cognomeStudente1");
		studente1.setIndirizzo(indirizzo3);
		studente1.addNumeroTelefono(nt4);
		studente1.addNumeroTelefono(nt5);
		studente2 = new Studente("nomeStudente2", "cognomeStudente2");
		studente2.setIndirizzo(indirizzo4);
		studente2.addNumeroTelefono(nt6);
		studente2.addNumeroTelefono(nt7);
		corso1.addDocente(docente1);
		corso1.addDocente(docente2);
		corso2.addDocente(docente3);
		corso1.addStudente(studente1);
		corso1.addStudente(studente2);
		corso2.addStudente(studente2);
	}

	@Test
	public void testDocenteIsPersona() {
		assertTrue(docente1 instanceof Persona);
	}

	@Test
	public void testStudenteIsPersona() {
		assertTrue(studente1 instanceof Persona);
	}

	@Test
	public void testSomeDocente() {
		Docente d = docente2;
		assertNotNull(d);
		assertEquals("nomeDocente2", d.getNome());
		assertEquals("cognomeDocente2", d.getCognome());
	}

	@Test
	public void testSomeStudente() {
		Studente s = studente1;
		assertNotNull(s);
		assertEquals("nomeStudente1", s.getNome());
		assertEquals("cognomeStudente1", s.getCognome());
	}

	@Test
	public void testDocentiCorsi() {
		List<Docente> l = corso1.getDocenti();
		assertNotNull(l);
		assertEquals(2, l.size());
		assertEquals("nomeDocente1", l.get(0).getNome());
		assertEquals("nomeDocente2", l.get(1).getNome());
		List<Docente> m = corso2.getDocenti();
		assertNotNull(m);
		assertEquals(1, m.size());
		assertEquals("nomeDocente3", m.get(0).getNome());
	}

	@Test
	public void testCorsiDocente() {
		Corso c1 = docente1.getCorso();
		assertNotNull(c1);
		assertEquals("nomeCorso1", c1.getNome());
		Corso c2 = docente2.getCorso();
		assertNotNull(c2);
		assertEquals("nomeCorso1", c2.getNome());
		Corso c3 = docente3.getCorso();
		assertNotNull(c3);
		assertEquals("nomeCorso2", c3.getNome());
	}

	@Test
	public void testStudentiCorsi() {
		List<Studente> l = corso1.getStudenti();
		assertNotNull(l);
		assertEquals(2, l.size());
		assertEquals("nomeStudente1", l.get(0).getNome());
		assertEquals("nomeStudente2", l.get(1).getNome());
		List<Studente> m = corso2.getStudenti();
		assertNotNull(m);
		assertEquals(1, m.size());
		assertEquals("nomeStudente2", m.get(0).getNome());
	}

	@Test
	public void testCorsiStudente() {
		List<Corso> l = studente2.getCorsi();
		assertNotNull(l);
		assertEquals(2, l.size());
		assertEquals("nomeCorso1", l.get(0).getNome());
		assertEquals("nomeCorso2", l.get(1).getNome());
	}
	
}
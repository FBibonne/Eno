package fr.insee.eno;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Only for dev purposes.
 * */
public class DummyMain {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DDI2FRContext());
		GenerationService service = injector.getInstance(GenerationService.class);
		try {
			service.generateQuestionnaire("dummy.input", "dummy.params");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

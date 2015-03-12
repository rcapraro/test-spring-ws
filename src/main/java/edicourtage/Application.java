
package edicourtage;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.net.URISyntaxException;

public class Application {

	public static void main(String[] args) throws URISyntaxException {
		ApplicationContext ctx = SpringApplication.run(EdiCourtageConfiguration.class, args);

		EdiCourtageClient ediCourtageClient = ctx.getBean(EdiCourtageClient.class);

		String codeUtilisateur = "9019";

        ediCourtageClient.getListeAdherents(codeUtilisateur);

		//GetCityForecastByZIPResponse response = ediCourtageClient.getCityForecastByZip(zipCode);
		//ediCourtageClient.printResponse(response);
	}

}

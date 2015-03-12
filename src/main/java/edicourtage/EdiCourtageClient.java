
package edicourtage;

import edicourtage.wsdl.WsListeAdherentsComplexType;
import edicourtage.wsdl.WsListeAdherentsRetourComplexType;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.net.URISyntaxException;


public class EdiCourtageClient extends WebServiceGatewaySupport {

    public WsListeAdherentsRetourComplexType getListeAdherents(String codeUtilisateur) throws URISyntaxException {
        WsListeAdherentsComplexType request = new WsListeAdherentsComplexType();
        request.setAdherent(codeUtilisateur);

        System.out.println();
        System.out.println("Recherche liste des adhérents pour " + codeUtilisateur);

        WsListeAdherentsRetourComplexType response = (WsListeAdherentsRetourComplexType) getWebServiceTemplate()
                .marshalSendAndReceive(request, new SoapActionCallback("urn:ws_liste_adherents"));


        return response;
    }

}

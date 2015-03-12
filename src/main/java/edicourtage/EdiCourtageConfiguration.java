
package edicourtage;

import org.apache.ws.security.components.crypto.Crypto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j.support.CryptoFactoryBean;

import java.io.IOException;

@Configuration
public class EdiCourtageConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("edicourtage.wsdl");
        return marshaller;
    }

    @Bean
    public EdiCourtageClient ediCourtageClient(Jaxb2Marshaller marshaller) throws Exception {
        EdiCourtageClient client = new EdiCourtageClient();
        client.setDefaultUri("https://recette.edicourtage.fr/webservices/services/ws_csca_liste_adherents_BindingS");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        ClientInterceptor[] clientInterceptors = new ClientInterceptor[1];
        clientInterceptors[0] = new Wss4jSecurityInterceptor();
        client.setInterceptors(clientInterceptors);
        return client;
    }

    @Bean
    public Wss4jSecurityInterceptor wss4jSecurityInterceptor() throws Exception {
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setValidationActions("Signature");
        wss4jSecurityInterceptor.setSecurementEncryptionCrypto(cryptoFactoryBean());
        wss4jSecurityInterceptor.setValidationSignatureCrypto(cryptoFactoryBean());
        wss4jSecurityInterceptor.afterPropertiesSet();
        return wss4jSecurityInterceptor;
    }

    @Bean
    public Crypto cryptoFactoryBean() throws Exception {
        CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
        cryptoFactoryBean.setTrustStorePassword("9019_ws");
        cryptoFactoryBean.setKeyStorePassword("9019_ws");
        cryptoFactoryBean.setKeyStoreLocation(new ClassPathResource("edicourtage_keystore.jks"));
        cryptoFactoryBean.afterPropertiesSet();
        return cryptoFactoryBean.getObject();


    }


}

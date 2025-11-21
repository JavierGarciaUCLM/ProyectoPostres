package sbc.example;
import java.util.Collection;
import java.util.List;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.definition.KiePackage;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la pasteleria de Golosolandiapostres!");

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession session = kieContainer.newKieSession("HelloWorldKS");

        KieBase kieBase = kieContainer.getKieBase("HelloWorldKB");
        //To see the defined rules
        Collection<KiePackage> kiePackages = kieBase.getKiePackages();
        for (KiePackage kiePackage : kiePackages) {
            for (Rule rule : kiePackage.getRules()) {
                System.out.print("Rule name: " + rule.getName());
                System.out.println("             Rule package: " + kiePackage.getName());
            }
        }
        //Create and insert facts
        final Message message = new Message();
        message.setMessage( "Hello World" );
        message.setStatus( Message.HELLO );
        session.insert( message );

  
        List<Receta> recetas = RecetasDatos.crearRecetas();
            for (Receta r : recetas) {
            session.insert(r);
            session.insert(new RecetaPuntuada(r));
}

        
        //Fire the rules
        session.fireAllRules();


    }
}
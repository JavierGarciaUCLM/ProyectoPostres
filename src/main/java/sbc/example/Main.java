package sbc.example;
import java.util.Collection;
import java.util.List;
import java.util.Scanner; //acordase, importante

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
        KieSession session = kieContainer.newKieSession("PostresKS");

        KieBase kieBase = kieContainer.getKieBase("PostresKB");
        //To see the defined rules
        Collection<KiePackage> kiePackages = kieBase.getKiePackages();
        for (KiePackage kiePackage : kiePackages) {
            for (Rule rule : kiePackage.getRules()) {
                System.out.print("Rule name: " + rule.getName());
                System.out.println("             Rule package: " + kiePackage.getName());
            }
        }
  
        List<Receta> recetas = RecetasDatos.crearRecetas();
            for (Receta r : recetas) {
            session.insert(r);
            session.insert(new RecetaPuntuada(r));
}

        // ==========================
        // Preguntas al usuario
        // ==========================
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRespode estas preguntas para recomendarte un postre:");

        //tiempo
        int tiempoDisponible = 0;
        while (true) {
            System.out.print("¿Cuánto tiempo tienes para cocinar (minutos)? ");
            String linea = sc.nextLine();
            try {
                tiempoDisponible = Integer.parseInt(linea.trim());
                if (tiempoDisponible > 0) {
                    break;
                } else {
                    System.out.println("Introduce un número mayor que 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, un número válido.");
            }
        }

        //horno?
        boolean tieneHorno;
        while (true) {
            System.out.print("¿Tienes horno disponible? (s/n): ");
            String resp = sc.nextLine().trim().toLowerCase();
            if (resp.equals("s")) {
                tieneHorno = true;
                break;
            } else if (resp.equals("n")) {
                tieneHorno = false;
                break;
            } else {
                System.out.println("Responde 's' o 'n'.");
            }
        }

        // Dificultad
        Dificultad dificultadDeseada = Dificultad.Facil;
        while (true) {
            System.out.println("¿Qué dificultad prefieres?");
            System.out.println("1) Fácil");
            System.out.println("2) Media");
            System.out.print("¿1 o 2?: ");

            String op = sc.nextLine().trim();
            if (op.equals("1")) {
                dificultadDeseada = Dificultad.Facil;
                break;
            } else if (op.equals("2")) {
                dificultadDeseada = Dificultad.Media;
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }

        //Ingrediente preferido
        System.out.print("¿Algún ingrediente preferido? (deja vacío si no tienes ninguno): ");
        String ingredientePreferido = sc.nextLine().trim();
        if (ingredientePreferido.isEmpty()) {
            ingredientePreferido = null;
        }

        //Ingredientes prohibidos
        Usuario usuario = new Usuario();
        usuario.setTiempoDisponible(tiempoDisponible);
        usuario.setTieneHorno(tieneHorno);
        usuario.setDificultadDeseada(dificultadDeseada);
        usuario.setIngredientePreferido(ingredientePreferido);

        System.out.println("Introduce ingredientes prohibidos de uno a uno (ENTER vacío para terminar):");
        while (true) {
            System.out.print("Ingrediente prohibido: ");
            String ing = sc.nextLine().trim();
            if (ing.isEmpty()) {
                break;
            }
            usuario.addIngredienteProhibido(ing);
        }
        sc.close();
        session.insert(usuario);

        // Disparar reglas
        session.fireAllRules();
        session.dispose();
    }

}
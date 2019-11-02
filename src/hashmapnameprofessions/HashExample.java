package hashmapnameprofessions;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashExample {
    public static void main(String args[]) {

        Hashtable empresas = new Hashtable();
        empresas.put("Google", "USA");
        empresas.put("Nokia", "Finlandia");
        empresas.put("Sony", "Japon");
        empresas.get("Google");
        System.out.println("Contiene la tabla de empresas a Google como clave: "
                + empresas.containsKey("Google"));

        Enumeration enumeration = empresas.elements();
        while (enumeration.hasMoreElements()) {
            System.out
                    .println("valores de la tabla: " + enumeration.nextElement());
        }

        System.out.println("Está la tabla de empresas vacía: "
                + empresas.isEmpty());

        System.out.println("Tamaño de la tabla en Java: " + empresas.size());

        empresas.put("Apple", "USA");

        Enumeration elementsEnum = empresas.elements();
        while (elementsEnum.hasMoreElements()) {
            System.out
                    .println("valores de la tabla: " + elementsEnum.nextElement());
        }

        System.out.println("Tamaño de la tabla en Java: " + empresas.size());
    }
}

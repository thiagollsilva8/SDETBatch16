package class13;

public class E3StringDemo {

    public static void main(String[] args) {

        String str = "sdgfdssdaADDFSDFSWDF124324#@$$%";

        System.out.println(str.replaceAll("[^a-z]", ""));
        // don't replace lower case letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9A-Z]", "\\$"));


    }
}

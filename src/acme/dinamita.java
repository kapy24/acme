package acme;

/**
 * Proporciona una manera de activar de forma remota explosivos para hacer volar al correcaminos.
 * <p>
 * 
 *
 */
public class dinamita {
    
    public void blowDinamitaBigBang(int megatones) {
            System.out.println("colocando un cartucho de dinamita" + megatones + "megatones");
            System.out.println("kaboomg!!!! mega explosion!!!");
        }
    
    /**
     * Permite detonar de forma remota
     una carga de dinamita, <b> aléjese antes de activar el
     método </b>.
     * 
     * 
     * @param megatones indica el número de megatones de explosivo.
     * @see #blowDinamitaBigBang
     * @see Smartphone#zapRoadRunner
     */
    
    public void blowDinamitaSilentBang(int megatones) {
            System.out.println("colocando dinamita silenciosa de" + megatones + "megatones");
            System.out.println("<boom silenciso>. nada no se oye");
        }
    
}

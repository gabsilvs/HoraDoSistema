
package com.mycompany.horadosistema;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
    Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(idioma.getDisplayLanguage(idioma));
    Toolkit resolucao = Toolkit.getDefaultToolkit();
        System.out.println("A resoluçao do sistema é");
        System.out.println(resolucao.getScreenResolution());
    }
}
